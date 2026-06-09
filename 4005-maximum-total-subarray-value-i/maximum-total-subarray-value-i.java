class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min = nums[0];
        long max= 0;
       for(int i=0; i<nums.length; i++){
        if(min>nums[i]){
            min= nums[i];
        }
        if(max<nums[i]){
            max=nums[i];
        }
       }

        long ans= (max-min)*k;
        return ans; 
    }
}