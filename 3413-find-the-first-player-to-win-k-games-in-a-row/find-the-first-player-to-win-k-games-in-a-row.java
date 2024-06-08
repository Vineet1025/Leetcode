class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int max =skills[0]; 
        int a=0;
        int i=0;
        for(int j=1; j<skills.length; j++){
            if(a>=k){
                return i;
            }else if(skills[j]>max){
                max=skills[j];
                i=j;
                a=1;
            }else{
                a++;
            }
        }
        return i;
    }
}