class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for(String str: words2) {
            Map<Character, Integer> currMap = new HashMap<>();
            for(char ch: str.toCharArray()) {
                currMap.put(ch, currMap.getOrDefault(ch, 0)+1);
            }
            for(char ch: currMap.keySet()) {
                if((map.containsKey(ch) && map.get(ch) < currMap.get(ch)) || (!map.containsKey(ch))) {
                    map.put(ch, currMap.get(ch));
                }
            }
        }
        
        for(String str: words1) {
            boolean isCurrSubset = true;
            Map<Character, Integer> currMap = new HashMap<>();
            for(char ch: str.toCharArray()) {
                currMap.put(ch, currMap.getOrDefault(ch, 0)+1);
            }
            for(char ch: map.keySet()) {
                if(!currMap.containsKey(ch)) {
                    isCurrSubset = false;
                    break;
                }
                else if(currMap.get(ch) < map.get(ch)) {
                    isCurrSubset = false;
                    break;
                }
            }
            if(isCurrSubset) {
                ans.add(str);
            }
        }
        return ans;
    }
}