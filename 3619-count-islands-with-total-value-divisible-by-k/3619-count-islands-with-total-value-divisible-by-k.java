class Solution {
    public int countIslands(int[][] grid, int k) {
        int m= grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]&&grid[i][j]!=0){
                    long sum = dfs(grid,visited,i,j);
                    if(sum%k==0)
                    count++;
                }
            }
        }
        return count;
    }
    long dfs(int [][] grid, boolean[][] visited, int i, int j){
        if(i==grid.length||j==grid[0].length||i<0||j<0||visited[i][j]||grid[i][j]==0){
            return 0;
        }
        visited[i][j]=true;
        long sum = grid[i][j]+dfs(grid, visited, i+1,j)+dfs(grid, visited, i,j+1)+dfs(grid, visited, i-1,j)+dfs(grid, visited, i,j-1);

        return sum;
    }
}