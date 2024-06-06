class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        for(int i:hm.values()){
            if(i==1){
               return -1;
            }
            ans+=i/3;
            if(i%3!=0){
                ans++;
            }
        }
        return ans;
    }
}