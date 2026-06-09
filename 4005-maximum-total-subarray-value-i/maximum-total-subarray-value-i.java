class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Arrays.sort(nums);
        long min = nums[0];
        long max= nums[nums.length-1];
        long ans= (max-min)*k;
        return ans; 
    }
}