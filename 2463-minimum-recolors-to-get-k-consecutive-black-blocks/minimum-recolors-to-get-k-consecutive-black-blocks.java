class Solution {
    public int minimumRecolors(String blocks, int k) {
       int n=blocks.length();
       int ans=0,min=k;
       for(int i=0;i<k;i++){
        if(blocks.charAt(i)=='W'){
            ans++;
        }
       }
       if(n == 1)return ans;

       if(min>ans){
        min=ans;
       }

       for(int i=1; i<=n-k; i++){
        if(blocks.charAt(i-1)=='W'){
            ans--;
        }
        if(blocks.charAt(i+k -1)=='W'){
            ans++;
        }
        if(min>ans){
           min=ans;
        }
       }

       return min;
    }
}