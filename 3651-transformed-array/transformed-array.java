class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
           int idx = (i + nums[i])% nums.length;
           if(idx <0){
            idx +=nums.length;
           }
           ans[i] = nums[idx];
        }
        return ans;
    }
}