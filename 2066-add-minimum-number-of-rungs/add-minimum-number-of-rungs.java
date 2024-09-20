class Solution {
    public int addRungs(int[] arr, int dist) {
        int ans = 0;
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int diff = arr[i+1]-arr[i]-1;
            if(diff>=dist){
                ans = ans + (diff/dist);
            }
        }
        return ans+(arr[0]-1)/dist;
    }
}