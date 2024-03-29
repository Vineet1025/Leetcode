class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        long count = 0;
        int left = 0;
        int right = 0;
        int freq = 0;
        int max = Integer.MIN_VALUE; 
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }    
        while (right < n) {
            if (nums[right] == max) {
                freq++;
            }  
             while(k==freq){
                if(nums[left]==max){
                    freq--;
                }
                left++;
             }
             count+=left;
             right++;
        }
        return count;
    }
}