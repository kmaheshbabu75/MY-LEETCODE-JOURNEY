class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarraysWithAtMostK(nums, k) - subarraysWithAtMostK(nums, k - 1);
    }

    private int subarraysWithAtMostK(int[] nums, int k) {
        int[] freq = new int[nums.length + 1];
        int left = 0;
        int right = 0;
        int distinctCount = 0;
        int totalSubarrays = 0;

        while (right < nums.length) {
            if (freq[nums[right]] == 0) {
                distinctCount++;
            }
            freq[nums[right]]++;
            while (distinctCount > k) {
                freq[nums[left]]--;
                if (freq[nums[left]] == 0) {
                    distinctCount--;
                }
                left++;
            }
            totalSubarrays += (right - left + 1);
            right++;
        }
        return totalSubarrays;
    }
}