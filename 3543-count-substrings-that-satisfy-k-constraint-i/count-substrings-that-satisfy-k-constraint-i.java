class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length();
        
        int res=0;
        for(int i=0; i<n; i++){
            int one = 0, zero=0;
            for(int j=i; j<n; j++){
                if(s.charAt(j)=='1'){
                    one++;
                }else{
                    zero++;
                }

                if(one<=k || zero<=k){
                    res++;
                }else{
                    break;
                }
            }
        }
        return res;
        
    }
}