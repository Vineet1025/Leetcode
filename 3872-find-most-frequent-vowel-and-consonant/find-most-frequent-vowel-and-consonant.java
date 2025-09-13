class Solution {
    public int maxFreqSum(String s) {
       HashMap<Character, Integer> hm = new HashMap<>();
       int max1=0;
       int max2 =0;

       for(int i=0; i<s.length(); i++){
          char ch = s.charAt(i);
        if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
         
         int c = hm.get(ch);
         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                max1 = Math.max(max1, c);
            } else {
                max2 = Math.max(max2, c);
            }
        }
           
       
      return max1 + max2;
     }
}