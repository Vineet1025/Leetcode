class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int r=0;
        int max=0;
        double ans=Double.NEGATIVE_INFINITY;

        if(nums.length==1){
            return nums[0];
        }

        while(r<nums.length){
            max+=nums[r];
            if((r-l+1)>k){
              max -=nums[l];
               l++;
            }
           if((r-l+1)==k){

           ans=Math.max(ans,(double) max/k);
           }
            r++;
        }
        return ans;
    }
}