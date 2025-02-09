class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        long ans=0;
        for(int i=0; i<nums.length; i++){
           nums[i]=nums[i]-i;
        }
         hm.put(nums[0],1);
        for(int j=1; j<nums.length; j++){
            int totalbefore=j;
            int get=hm.getOrDefault(nums[j],0);
            ans+=(totalbefore-get);
            hm.put(nums[j], get+1);
        }
        return ans;
    }
}