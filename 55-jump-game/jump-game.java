class Solution {
    public boolean canJump(int[] nums) {
        int d=nums.length-1;
        for(int i=nums.length-2; i>=0; i--){
            if(i+nums[i]>=d){
                d=i;
            }
        }
        return d==0;
        
    }
}