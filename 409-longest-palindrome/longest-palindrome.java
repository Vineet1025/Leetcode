class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        int ans=0;
        int a=0;
        for(int i:hm.values()){
            if(i%2==0){
                ans+=i;
            }else{
                ans+=i-1;
                a=1;
            }
        }
        return ans+a;
    }
}