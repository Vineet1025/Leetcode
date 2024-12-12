class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->b-a);
        long ans=0;
       for(int i=0; i<gifts.length; i++){
        pq.add(gifts[i]);
       }

       for(int i=0; i<k; i++){
        int gift=pq.poll();
         int left=(int)Math.floor(Math.sqrt(gift));
            pq.offer(left);
       }

       while(!pq.isEmpty()){
        ans+=pq.poll();
       }
      return ans;
    }
}