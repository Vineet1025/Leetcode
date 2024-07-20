class Solution {
    public int minimumLength(String s) {
        int ans=0;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);
        }

        for(int c:hm.values()){
            if(c%2==0){
                ans+=2;
            }else{
                ans++;
            }
        }
        return ans;

    }
}