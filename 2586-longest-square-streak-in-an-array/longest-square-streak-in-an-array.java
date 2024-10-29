class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Long> set=new HashSet<>();
          int maxcnt=-1;

          int n=nums.length;
          for(int num:nums)
          {
            set.add((long)num);
          }
          for(int num:nums)
          {
            long curr=num;
            int cnt=1;
            while(set.contains(curr*curr))
            {
                curr=curr*curr;
                cnt++;
            }
            if(cnt>=2)
              maxcnt=Math.max(cnt,maxcnt);
            
          }
        return maxcnt;
    }
}