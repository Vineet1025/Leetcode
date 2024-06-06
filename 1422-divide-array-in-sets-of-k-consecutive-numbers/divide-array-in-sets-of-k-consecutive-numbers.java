class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
         if(nums.length%k!=0)
        return false;
        if(k==1||k==0)
        return true;
        Arrays.sort(nums);
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            arr.add(nums[i]);
        }
        while(arr.size()>0)
        {
            int c=0;
            int a=arr.remove(0);
            c++;
            for(int j=0;j<arr.size();j++)
            {
                if(arr.get(j)==a+1)
                {
                    a=arr.remove(j);
                    j--;
                    c++;
                }
                if(c==k)
                break;
            }
            if(c!=k)
            return false;
        }
        return true;
    }
}