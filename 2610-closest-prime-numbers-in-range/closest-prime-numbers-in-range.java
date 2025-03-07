class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> list = new ArrayList<>();
        int i = left;
        while(i<=right){
            if(isPrime(i)==1){
                list.add(i);
            }
            i++;
        }
        int[] res = new int[2];
        boolean flag = false;
        int min_diff = Integer.MAX_VALUE;
        for(int j =1; j<list.size(); j++){
            int val =list.get(j)-list.get(j-1);
            if(Math.abs(val) < min_diff){
                min_diff = val;
                res[0] = list.get(j-1);
                res[1] = list.get(j);
                flag = true;
            }
        }
        
        return (flag ? res : new int[] {-1,-1} );
    }
    public int isPrime(int k){
        
        if(k==2 || k==3 ){
            return 1;
        }
        if(k <=1 || k%2==0 || k%3 == 0){
            return 0;
        }
        for(int i=5; i*i<=k; i+=6){
            if(k%i ==0 || k%(i+2)==0){
                return 0;
            }
        }
        return 1;
    }
}