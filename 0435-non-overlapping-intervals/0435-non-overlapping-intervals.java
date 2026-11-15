class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int n = intervals.length;
        int overlap = 0;

        int prev2 = intervals[0][1];
        for(int i=1;i<n;i++){
            if(prev2>intervals[i][0]){
                overlap++;
                if(prev2>intervals[i][1])
                    prev2 = intervals[i][1];
            }
            else {
                prev2 = intervals[i][1];
            }

        }
        return overlap;
    }
}