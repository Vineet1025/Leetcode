class Solution {
    public int subsetXORSum(int[] nums) {
        return subset(nums, 0, 0);
    }
    public static int subset(int[] nums, int idx, int currxor){
        if(idx==nums.length){
            return currxor;
        }
        int a=subset(nums, idx+1, currxor^nums[idx]);
        int b=subset(nums, idx+1, currxor);
        return a+b;
    }
}