class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        int[] count = new int[nums.length];
        int idx = 0;
        
        for (int num : nums) {
            count[num]++;
            if (count[num] == 2) {
                result[idx++] = num;
                if (idx == 2) {
                    break; 
                }
            }
        }
        
        return result;
    }
}