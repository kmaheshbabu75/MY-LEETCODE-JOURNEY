class Solution {
    public int countValidSelections(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int count = 0;
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int rightSum = totalSum - leftSum;
                if (leftSum == rightSum) {
                    count += 2; 
                } else if (Math.abs(leftSum - rightSum) == 1) {
                    count += 1;
                }
            } else {
                leftSum += nums[i];
            }
        }

        return count;
    }
}