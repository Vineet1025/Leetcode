class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        int count=0;
        int match=meetings[0][1]; 
        if(meetings[0][0]>1) 
            count+=meetings[0][0]-1;
        for(int i=1;i<meetings.length;i++){
            if(meetings[i][0]>match)  
                count+=meetings[i][0]-match-1;
            match=Math.max(match, meetings[i][1]);
        }
        if(match<days)
        count+=days-match;
        return count;
    }
}