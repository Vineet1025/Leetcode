class Solution {
    public boolean canArrange(int[] arr, int k) {
         int map[]=new int[k];
        for(int i:arr)
        {
            int rem=((i%k)+k)%k;
            map[rem]++;
        }
        if(map[0]%2!=0)
        return false;
        for(int i=1;i<=k/2;i++)
        {
            int comp=k-i;
            if(map[i]!=map[comp])return false;
        }
        return true;
    }
}