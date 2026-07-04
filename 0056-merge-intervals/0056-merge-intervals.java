class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list=new ArrayList<>();
        int start1=intervals[0][0];
        int end1=intervals[0][1];
        int n=intervals.length;
        for(int i=1;i<n;i++)
        {
            int start2=intervals[i][0];
            int end2=intervals[i][1];
            if(end1>=start2) 
            {
                end1=Math.max(end1,end2);
            }
            else{ 
                list.add(new int[]{start1,end1});
                start1=start2;
                end1=end2;
            }
        }
        list.add(new int[]{start1,end1});
        return list.toArray(new int[list.size()][]);
    }
}