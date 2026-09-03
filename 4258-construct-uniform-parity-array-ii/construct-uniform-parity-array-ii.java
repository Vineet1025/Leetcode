class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd=0;
        int even=0;
        int smallestodd=Integer.MAX_VALUE;
        Arrays.sort(nums1);
        for(int i=0; i<nums1.length; i++){
            if(nums1[i]%2==0 && smallestodd!=Integer.MAX_VALUE){
                odd++;
            }else if(nums1[i]%2==0){
                even++;
            }else{
                odd++;
                smallestodd=Math.min(smallestodd, nums1[i]);
            }
        }
        if(odd==nums1.length || even==nums1.length){
            return true;
        }
        return false;
    }
}