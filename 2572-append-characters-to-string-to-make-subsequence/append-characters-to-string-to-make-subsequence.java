class Solution {
    public int appendCharacters(String s, String t) {
        
        int a=0;
        
        for(int i=0; i<s.length(); i++){
            if(a==t.length()){
                break;
            }
            if(s.charAt(i)==t.charAt(a)){
                a++;
            }  
        }
        return t.length()-a;
    }
}