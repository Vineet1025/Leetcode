class Solution {
    public int triangularSum(int[] nums) {
        while(nums.length>1){
            int n =nums.length;
            int[] arr = new int[n-1];
            for(int i=1; i<n; i++){
                arr[i-1]= (nums[i-1]+nums[i])%10;
            }
            nums=arr;
        }
        return nums[0];
    }
}