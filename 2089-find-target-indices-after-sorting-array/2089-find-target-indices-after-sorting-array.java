class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lessThanCount = 0;
        int equalCount = 0;
        for (int num : nums) {
            if (num < target) {
                lessThanCount++;
            } else if (num == target) {
                equalCount++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < equalCount; i++) {
            result.add(lessThanCount + i);
        }
        return result;
    }
}