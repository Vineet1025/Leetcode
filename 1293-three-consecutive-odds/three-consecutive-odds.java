class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3) {
            return false;
        }
        arr[0] = arr[0]%2;
        arr[1] = arr[1]%2;
        for(int i=2;i<arr.length;i++){
            arr[i] =arr[i]%2;
            if((arr[i] + arr[i-1] + arr[i-2]) == 3){
                return true;
            }
        }
        return false;
    }
}