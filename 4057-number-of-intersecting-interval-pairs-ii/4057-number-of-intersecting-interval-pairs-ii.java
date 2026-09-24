class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        int n = intervals.length;
        int count = 0 ;
        int start[] = new int[n];
        int end[] = new int[n];
        for(int i=0;i<n;i++){
            start[i]=intervals[i][0];
            end[i]=intervals[i][1];
        } 
        Arrays.sort(start);
        Arrays.sort(end);
        int idx = 0;
        long ans=0;
        for(int i=0;i<n;i++){
             while(end[idx]<start[i]){
                idx++;
             }
             ans +=i-idx;
             
        }
        
        return ans;
    }
}