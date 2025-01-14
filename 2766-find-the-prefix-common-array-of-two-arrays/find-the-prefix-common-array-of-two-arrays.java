class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer, Integer> hm= new HashMap<>();
        int[] ans=new int[A.length];
        for(int i=0; i<A.length; i++){
            hm.put(A[i], hm.getOrDefault(A[i],0)+1);
            hm.put(B[i], hm.getOrDefault(B[i],0)+1);
            int c=0;
            if(hm.get(A[i])==2){
                c++;
            }
            if(hm.get(B[i])==2 && A[i]!=B[i]){
                c++;
            }
            if(i==0){
                ans[i]=c;
            }else{
                ans[i]=c+ans[i-1];
            }
        }
        return ans;
    }
}