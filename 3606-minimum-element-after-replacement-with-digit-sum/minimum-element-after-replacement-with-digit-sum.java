class Solution {
    public int minElement(int[] nums) {
        int idx=0;
        for(int i:nums){
            int sum=0;
            while(i>0){
                int rem=i%10;
                sum+=rem;
                i/=10;
            }
            nums[idx]=sum;
            idx++;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}