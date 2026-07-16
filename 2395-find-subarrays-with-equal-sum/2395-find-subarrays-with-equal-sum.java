// class Solution {
//     public boolean findSubarrays(int[] nums) {
//         int n = nums.length;
//         for (int i = 0; i < n - 1; i++) {
//             int sum1 = nums[i] + nums[i + 1];
//             for (int j = i + 1; j < n - 1; j++) {
//                 int sum2 = nums[j] + nums[j + 1];
//                 if (sum1 == sum2) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
import java.util.HashSet;

class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> seenSums = new HashSet<>();
        
        // Loop up to nums.length - 1 to look at pairs (i, i+1)
        for (int i = 0; i < nums.length - 1; i++) {
            int currentSum = nums[i] + nums[i + 1];
            
            // If the sum has been seen before, we found our match
            if (seenSums.contains(currentSum)) {
                return true;
            }
            
            // Otherwise, record the sum
            seenSums.add(currentSum);
        }
        
        return false;
    }
}
