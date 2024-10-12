class Solution {
    public int minGroups(int[][] intervals) {
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        for (int i = 0;i<intervals.length;i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int x = 0;
        int y = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        while (x<start.length && y<end.length) {
            if (start[x] <= end[y]) {
                count++;
                x++;
            }
            else {
                count--;
                y++;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}
