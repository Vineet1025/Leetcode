class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> arr= new ArrayList<>();
        String last= "";
        for(int i=0; i<words.length; i++){
          char[] c= words[i].toCharArray();
          Arrays.sort(c);
          String a = new String(c);
          if(!a.equals(last)){
            arr.add(words[i]);
            last= a;
          }
        }
        return arr;
    }
}