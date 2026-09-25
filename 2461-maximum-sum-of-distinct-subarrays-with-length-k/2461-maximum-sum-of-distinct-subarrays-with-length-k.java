class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currentSum = 0;
        HashSet<Integer> windowElements = new HashSet<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            while (windowElements.contains(nums[right])) {
                windowElements.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            windowElements.add(nums[right]);
            currentSum += nums[right];
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
                windowElements.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }
}