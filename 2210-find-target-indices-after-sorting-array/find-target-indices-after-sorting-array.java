class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int tarcount =0;
        int small =0;
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]<target){
                small++;
            }else if(nums[i]==target){
                tarcount++;
            }
        }
        while(tarcount>0){
            arr.add(small++);
            tarcount--;
        }
        return arr;
    }
}