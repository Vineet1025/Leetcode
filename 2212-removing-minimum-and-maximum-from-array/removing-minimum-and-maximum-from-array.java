class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length; 
        if(n == 1) return 1;

        int minIndex = nums.length;
        int maxIndex = -1;

        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(maxElement < nums[i]){
                maxElement = nums[i];
                maxIndex = i;
            }
            if(minElement > nums[i]){
                minElement = nums[i];
                minIndex = i;
            }
        }

        int front = Math.max(maxIndex + 1, minIndex + 1);
        int back = Math.max(n - maxIndex, n - minIndex);
        int middle = Math.min(minIndex + 1, n - minIndex) + Math.min(maxIndex + 1, n - maxIndex);

        return Math.min(front, Math.min(back, middle));
    }
}