class Solution {
    public boolean canConstruct(String s, int k) {
        if(k>s.length()){
            return false;
        }
        if(k==s.length()){
            return true;
        }
        HashMap<Character, Integer> hm=new HashMap<>();
         for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        int c=0;
        for(int i:hm.values()){
            if(i%2 !=0){
                c++;
            }
        }
        return c<=k;
    }
}