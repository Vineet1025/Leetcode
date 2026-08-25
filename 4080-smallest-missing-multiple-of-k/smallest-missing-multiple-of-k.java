class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        int a=1;
      for(int i=0; i<nums.length; i++){
        hs.add(nums[i]);
      }
      while(hs.contains(k*a)){
        a++;
      }
      return k*a;
    }
}