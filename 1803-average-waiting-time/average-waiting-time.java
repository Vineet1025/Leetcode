class Solution {
    public double averageWaitingTime(int[][] customers) {
        long total=0;
        long ans=0;
        for(int i=0; i<customers.length; i++){
             if(total<customers[i][0]){
                total=customers[i][0]+customers[i][1];
             }else{
                 total+=customers[i][1];
             }
             ans+=total-customers[i][0];
        }
        return (double)ans/customers.length;
    }
}