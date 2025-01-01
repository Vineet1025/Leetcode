class Solution {
    public int maxScore(String s) {
        int ones=0;
        char[] arr=s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='1'){
                ones++;
            }
        }
        int ans=0;
        int zeros=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]=='0'){
                zeros++;
            }else{
                ones--;
            }
            int a=zeros + ones;
            ans=Math.max(ans, a);
        }
        return ans;
    }
}