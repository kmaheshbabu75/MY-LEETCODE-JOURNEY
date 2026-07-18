class Solution {
    public int findNonMinOrMax(int[] nums) {
       if(nums.length < 3){
        return -1;
       } 
//    Arrays.sort(nums);
    int[] firstThree = {nums[0], nums[1], nums[2]};
        Arrays.sort(firstThree);
        return firstThree[1];
    //    return nums[1];
    }
}