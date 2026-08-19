
class Solution {
    class Check{
    int i;
    int j;
    int dis;
    Check(int i, int j, int dis){
        this.i= i;
        this.j= j;
        this.dis = dis;
    }
}
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0]!=0)return -1;
        if(grid[0].length==1) return 1;
        Queue<Check> q =  new LinkedList<>();
        q.offer(new Check(0,0,1));
        int[][] dir = {{0,1},{1,0},{1,1},{-1,0},{0,-1},{-1,-1},{-1,1},{1,-1}};
        boolean visited[][] = new boolean[n][n];
        visited[0][0]= true;
        while(!q.isEmpty()){
            Check p = q.poll();
            int i = p.i;
            int j = p.j;
            int dis = p.dis;
            if(i==n-1&&j==n-1) return dis;
            for(int k=0;k<8;k++){
                int row = dir[k][0];
                int col = dir[k][1];
                if(i+row>=0&&j+col>=0&&i+row<=n-1&&j+col<=n-1&&grid[i+row][j+col]==0&&!visited[i+row][j+col])
                {  
                    visited[i+row][j+col]=true;
                    q.offer(new Check(i+row,j+col,dis+1));
                }
            }
            
        }
        return -1;
    }
}