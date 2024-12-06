class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum=0;
        int c=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0; i<banned.length; i++){
            hs.add(banned[i]);
        }

        for(int i=1; i<=n; i++){
            if(!hs.contains(i)){
                sum+=i;
                if(sum<=maxSum){
                    c++;
                }else{
                    break;
                } 
            }
        }
        return c;
    }
}