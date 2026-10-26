class Solution {
    int m,n;
    public int countIslands(int[][] grid, int k) {
        m= grid.length;
        n = grid[0].length;
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    long sum = dfs(grid,i,j);
                    if(sum%k==0)
                    count++;
                }
            }
        }
        return count;
    }
    long dfs(int [][] grid, int i, int j){
        if(i==m||j==n||i<0||j<0||grid[i][j]==0){
            return 0;
        }
        
        long sum = grid[i][j];
        grid[i][j]=0;
        sum+=dfs(grid, i+1,j)+dfs(grid, i,j+1)+dfs(grid, i-1,j)+dfs(grid, i,j-1);

        return sum;
    }
}