class Solution {
    public int lengthOfLongestSubstring(String s) {
      int l = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if (map.containsKey(c) && map.get(c) >= l) {
                l = map.get(c) + 1; 
            }

            map.put(c, r);
            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}