class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int c=0;

        for(int i=0; i<hours.length; i++){
            for(int j=i+1; j<hours.length; j++){
                int sum= hours[i]+hours[j];
                if(sum%24==0){
                    c++;
                }
            }
        }
        return c;
    }
}