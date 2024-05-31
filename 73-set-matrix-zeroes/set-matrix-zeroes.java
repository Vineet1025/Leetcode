class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        boolean[] zeroR=new boolean[rows];
        boolean[] zeroC=new boolean[cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j]==0){
                    zeroR[i]=true;
                    zeroC[j]=true;
                }
            }
        }
        for(int i=0; i<rows; i++){
            if(zeroR[i]){
            for(int j=0; j<cols; j++){
                matrix[i][j]=0;
            }
        }
      }
        for(int j=0; j<cols; j++){
            if(zeroC[j]){
            for(int i=0; i<rows; i++){
                matrix[i][j]=0;
            }
         }
        }
    }
}