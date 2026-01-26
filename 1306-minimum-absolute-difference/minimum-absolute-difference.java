class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDif = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            minDif = Math.min(minDif, arr[i] - arr[i - 1]);
        }
        for(int i =1; i<arr.length; i++){
            if(Math.abs(arr[i]-arr[i-1])==minDif){
                ans.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return ans;
    }
}