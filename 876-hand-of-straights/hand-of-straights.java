class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0)
        return false;
        if(groupSize==1||groupSize==0)
        return true;
        Arrays.sort(hand);
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<hand.length; i++)
        {
            arr.add(hand[i]);
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
                if(c==groupSize)
                break;
            }
            if(c!=groupSize)
            return false;
        }
        return true;
    }
}
        