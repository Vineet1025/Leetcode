class Solution {
    public boolean isGood(int[] nums) {
      int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        if(map.size() != n-1) return false;
        for(int i = 1; i < n-1; i++){
            if (map.getOrDefault(i, 0) != 1) return false;
        }
        if (map.getOrDefault(n-1, 0) != 2) return false;
        return true;
        
    }
}