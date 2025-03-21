class Solution {
    public int longestConsecutive(int[] nums) {
   
      if (nums.length == 1) {
            return 1; 
        }
       int max=0;
        HashSet<Integer> a = new HashSet<>(); 
        
        for (int n: nums) {
            a.add(n); 
        }
        HashSet<Integer> b = new HashSet<>();
        for (int num : a) {
            if (!a.contains(num -1)) {
              int h=num;
              int c=1;
            
            while(a.contains(h+1))
            {
                h++;
                c++;
            }
            max=Math.max(max,c);
            }
        }

        
        return max;
  
    }
}