class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n= matrix.length * matrix[0].length;
        long maxsum = 0;
        int zero=0;
        int neg=0;
        int smallest= Integer.MAX_VALUE;
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[0].length; j++){
                     if(matrix[i][j]==0){
                        zero++;
                     }else if(matrix[i][j]<0){
                        neg++;                        
                     }
                     smallest = Math.min(smallest, Math.abs(matrix[i][j]));
                     maxsum += Math.abs(matrix[i][j]);
                }
            }
            if(zero == 0 && neg%2!=0){
             return maxsum - smallest*2;
            }
            return maxsum;

        }
    }
