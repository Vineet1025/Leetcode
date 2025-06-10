class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int x: map.values()){
            if(x % 2 != 0){
                max = Math.max(max, x);
            }else{
                min = Math.min(min,x);
            }
        }
        return max - min;
    }
}