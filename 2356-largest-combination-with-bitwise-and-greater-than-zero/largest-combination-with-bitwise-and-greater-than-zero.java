class Solution {
    public int largestCombination(int[] candidates) {
        int max=0;
        for(int i=0; i<24; i++){
            int c=0;
            for(int x: candidates){
                if((x &(1<<i))>0){
                    c++;
                }
            }
            max=Math.max(max, c);
        }
        return max;
    }
}