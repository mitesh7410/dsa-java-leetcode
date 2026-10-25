class Solution {
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0&&!visited[i][j]&&dfs(i,j,grid,visited)){
                    ans++;
                }
            }
        }
        return ans;
    }
    private boolean dfs(int i, int j, int[][] grid, boolean[][] visited){
        visited[i][j]=true;
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{i,j});
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        boolean flag =  true;
        while(!q.isEmpty()){
            int[] arr = q.poll();
            int r = arr[0];
            int c = arr[1]; 
            for(int[] d: dir){
               int x = r+d[0];
               int y = c+d[1];
               if(x<0||y<0||x>=grid.length||y>=grid[0].length){
                flag = false;
               }
               else if(!visited[x][y]&&grid[x][y]==0){
                q.offer(new int[]{x,y});
                visited[x][y]= true;
               }
            }
        }
        return flag;
    }
}