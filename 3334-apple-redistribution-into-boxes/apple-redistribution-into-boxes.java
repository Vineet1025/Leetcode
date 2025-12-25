class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum =0;
        int c=0;
        for(int a: apple){
           sum+=a;
        }
        Arrays.sort(capacity);
        for(int i=0; i<capacity.length; i++){
            if(sum<=0){
                break;
            }
            sum-=capacity[capacity.length-1-i];
            c++;
        }
        return c;

    }

}