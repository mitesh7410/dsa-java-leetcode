class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        int[][] dist = new int[n][m]; 
        int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,0,0});
        while(!pq.isEmpty()){
            int[]arr = pq.poll();
            int dis = arr[0];
            int row = arr[1];
            int col = arr[2];
            if(row==n-1&&col==m-1) return dis;

            if (dis > dist[row][col]) {
                continue;
            }
            for(int[] d : dir){
                int newr = row+d[0];
                int newc = col+d[1];
                if(newr>=0&&newc>=0&&newr<n&&newc<m){
                    int effort = Math.max(Math.abs(heights[row][col]-heights[newr][newc]),dis);
                    if(effort<dist[newr][newc]){
                        dist[newr][newc]=effort;
                        pq.add(new int[]{effort,newr,newc});
                    }
                }
            }
        }
      return 0;   
     
    }
}