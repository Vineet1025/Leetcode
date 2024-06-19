class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min = 0;
        int max = 0;
        for(int i = 0; i< bloomDay.length; i++){
            min = Math.min(min , bloomDay[i]);
            max = Math.max(max , bloomDay[i]);
            }
        int res = -1;
        if(bloomDay.length < m*k) return res;
        
        int low = min;
        int high = max;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low)/2;
            if(isvalid(bloomDay , mid , k , m)){
                res = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return res;
    }
    public static boolean isvalid(int [] bloomDay, int mid , int k , int m){
        int flower=0;
        int bouquet=0;
        for(int i=0;i<bloomDay.length;i++)
        {
            if(bloomDay[i]<=mid)
            {
                flower++;
                if(flower==k)
                {
                    bouquet++;
                    flower=0;
                }
            }
            else
            {
                flower=0;
            }
        }
        return bouquet>=m;
    }
}