class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int len= Math.min(Math.min(s1.length(), s2.length()), s3.length());
        int c=0;
        for(int i=0; i<len; i++){
            if(s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i)){
                c++;
            }else{
                break;
            }
        }
        int ans=-1;
        if(c>0){
            ans = (s1.length()-c) + (s2.length()-c) + (s3.length()-c);
        }
        return ans;
    }
}