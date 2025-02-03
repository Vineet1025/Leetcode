class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incre=1;
        int decre=1;
        int max=1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i+1]<nums[i]){
                incre=1;
                decre++;
            }else if(nums[i+1]>nums[i]){
                decre=1;
                incre++;
            }else{
                incre=1;
                decre=1;
            }
            max=Math.max(max,Math.max(incre, decre));
            }

      return max;
    }
}