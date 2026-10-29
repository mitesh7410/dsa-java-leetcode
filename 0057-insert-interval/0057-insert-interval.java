class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int m = intervals.length;
        List<int[]> ans = new ArrayList<>();
        int row1 = m;
        for(int i =0; i<m; i++){
            if(intervals[i][1]>=newInterval[0]){
                row1 = i;
                break;
            } 
        }

        int row2=-1;
        for(int i=0;i<m;i++){
            if(intervals[i][0]<=newInterval[1]){
                row2=i;
               
            }
        }
        int merged[] ;

        if(row1>row2) merged = newInterval;
        else{
            int b = Math.min(intervals[row1][0],newInterval[0]);
            int a = Math.max(intervals[row2][1],newInterval[1]);
            merged =  new int[]{b,a};
        }
                
        for(int i = 0;i<row1;i++){
            ans.add(intervals[i]);
        }   
        ans.add(merged);     
        for(int i=row2+1;i<m;i++){
            ans.add(intervals[i]);
        }
            
        
        int n = ans.size();
        int[][] arr = new int[n][2];
        int j=0;
        for(int[] i : ans){
            arr[j]=i;
            j++;
        } 
        return arr;
    }
}