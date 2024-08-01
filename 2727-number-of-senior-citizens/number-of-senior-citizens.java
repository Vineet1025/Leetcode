class Solution {
    public int countSeniors(String[] details) {
       int a =0;
        for(int i =0; i<details.length; i++){
           if((details[i].charAt(11)=='6') && (details[i].charAt(12)>'0') ){
                a++;
            }
          
           else if(details[i].charAt(11)>'6'){
                a++;
            }
        }
        return a;
    }
}