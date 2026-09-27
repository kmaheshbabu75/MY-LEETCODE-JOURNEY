class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0;
        int maxAns = 0;

        for(int j = 0; j < nums.length; j++){
            if(nums[j] == 1){
                currentCount ++;
            }
            else{
                maxAns = Math.max(maxAns, currentCount);
                currentCount = 0;
            }
        }
        return Math.max(maxAns,currentCount);
    }
}