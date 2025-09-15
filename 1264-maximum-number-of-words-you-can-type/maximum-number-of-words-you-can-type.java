class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr= text.split(" ");
        int c=0;
        for(int i=0; i<arr.length; i++){
            boolean canbe = true;
            for(char ch : arr[i].toCharArray()){
                if(brokenLetters.indexOf(ch)!=-1){
                    canbe= false;
                    break;
                }
            }
            if(canbe){
                c++;
            }
        }
        return c;
    }
}