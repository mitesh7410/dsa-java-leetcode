class Solution {
    private void dfs(char[][] grid, boolean[][] visited, int i, int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||visited[i][j]==true||grid[i][j]=='0')
        return;

        visited[i][j]=true;

        dfs(grid,visited,i+1,j);
        dfs(grid,visited,i-1,j);
        dfs(grid,visited,i,j+1);
        dfs(grid,visited,i,j-1);

    }
    public int numIslands(char[][] grid) {
        int island = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean visited[][] = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'&&visited[i][j]==false){
                    dfs(grid,visited,i,j);
                    island++;
                }
            }
        }
        return island;
    } 
}