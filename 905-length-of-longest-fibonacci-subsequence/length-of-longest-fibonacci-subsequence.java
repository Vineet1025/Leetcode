class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        if(arr.length< 3){
            return 3;
        }
        int p1=0;
        int p2=0;
        int len=0;
        int maxlen=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                    p1=arr[j];
                    p2=arr[i];
                    len=2;
                    int sum=p1+p2;

                 while(hs.contains(sum)){
                    len++;
                    maxlen=Math.max(maxlen, len);
                    p2=p1;
                    p1=sum;
                    sum=p1+p2;
                 }
            }
        }
        return maxlen;
    }
}