class Solution {
    int mod = 1000000007;
    public int uniquePaths(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return dfs(grid,0,0,n,m,dp);
    }
    public int dfs(int[][] grid,int i,int j,int n,int m,int[][] dp){
        if(i == n || j == m ){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        if(dp[i][j] != -1) return dp[i][j];
        int ans = 0;
        int r = i;
        int c = j;
        int flag = 0;
        if(r+1 < n && grid[r+1][c] == 1){
            r++;
            c++;
            flag = 1;
            while(r < n && c < m && grid[r][c] == 1){
                if(flag == 0){
                    c++;
                    flag = 1;
                }
                else{
                    r++;
                    flag = 0;
                }
            }
            ans = (ans + dfs(grid,r,c,n,m,dp))%mod;
        }
        else{
            ans = (ans + dfs(grid,i+1,j,n,m,dp))%mod;
        }

        r = i;
        c = j;
        flag = 1;
        if(j+1 < m && grid[i][j+1] == 1){
            r++;
            c++;
            flag = 0;
            while(r < n && c < m && grid[r][c] == 1){
                if(flag == 0){
                    c++;
                    flag = 1;
                }
                else{
                    r++;
                    flag = 0;
                }
            }
            ans = (ans + dfs(grid,r,c,n,m,dp))%mod;
        }
        else{
            ans = (ans + dfs(grid,i,j+1,n,m,dp))%mod;
        }
        return dp[i][j] = ans;
    }
}