class Solution {
    public int tupleSameProduct(int[] nums) {
        int c=0; 
        Map<Integer, Integer> mp=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int p=(nums[i]*nums[j]);
                mp.put(p, mp.getOrDefault(p, 0)+1);
            }
        }
        for(int i:mp.keySet()){
            int a=mp.get(i);
            c+=(a*(a-1))/2;
        }
        return c*8;
    }
}