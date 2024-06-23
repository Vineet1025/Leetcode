class Solution {
    public int longestSubarray(int[] nums, int limit) {
         int len=nums.length;
        int result,right,left,i;

        result=right=left=i=0;
        while(i<len-1){
          if(len-result+1<i)
             return result+1;
          
           left=nums[i];
           right=nums[i];
               
           int j=i+1;
           while(j<len){
               
           left=Math.max(left,nums[j]);
           right=Math.min(right,nums[j]);
   
               if(left-right<=limit){
               result=Math.max(result,j-i);
               j++;
               continue;
               }
               else
               break;              
           }
           i++;            
        }  
        return result+1;
    }
}