class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currMax = 0;
        int maxSum = nums[0];
        int currMin = 0;
        int minSum = nums[0];
        for (int num : nums) {
            totalSum += num;   
            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);
            currMin = Math.min(currMin + num, num);
            minSum = Math.min(minSum, currMin);
        }
        return maxSum > 0 ? Math.max(maxSum, totalSum - minSum) : maxSum;
    }
}