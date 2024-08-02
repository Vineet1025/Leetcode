class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length/2;
        int c=0;
        while(i<nums.length/2 && j<nums.length){
           if(2*nums[i]<=nums[j]){
            c+=2;
            i++;
            j++;
            continue;
           }
            j++;
           }
        return c;

    }
}