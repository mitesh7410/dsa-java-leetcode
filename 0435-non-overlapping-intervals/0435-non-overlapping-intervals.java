class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int nonOverlap = 0;
        int []prev = intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(prev[1]>intervals[i][0])
                nonOverlap++;
            else    
            prev = intervals[i];    
        }

        return nonOverlap;
    }
}