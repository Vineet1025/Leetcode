class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int a=-1;
        int b=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                b=a;
                a=i;
            }
            if(b!= -1 && (a-b)-1 < k){
                return false;
            }
        }
        return true;
    }
}