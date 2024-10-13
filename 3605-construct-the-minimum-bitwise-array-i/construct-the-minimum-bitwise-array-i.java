class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] output=new int[nums.size()];
       for(int i=0;i<nums.size();i++){
           int num=nums.get(i);
        int sum=-1;
        int a=0;
        while(a<num){
        if((a | a+1)==nums.get(i)){
            sum=a;
            break;
        }
        a++;
        }
        output[i]=sum;
       } 
       return output;
    }
}