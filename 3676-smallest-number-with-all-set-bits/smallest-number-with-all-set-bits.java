class Solution {
    public int smallestNumber(int n) {
        int i=0;
        int a=0;

        while(i<n){
            i+=Math.pow(2, a);
            a++;
        }
        return i;
        
    }
}