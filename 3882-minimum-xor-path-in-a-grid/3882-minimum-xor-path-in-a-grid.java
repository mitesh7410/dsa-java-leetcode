class Solution {
    public int minCost(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int x = 1023;
        boolean[][][] dp = new boolean[n+1][m+1][x+1];
        int xor = 0;
        for(int i=0;i<n;i++){
            xor ^= grid[i][0];
            dp[i][0][xor] = true;
        }
        xor = 0;
        for(int i=0;i<m;i++){
            xor ^= grid[0][i];
            dp[0][i][xor] = true;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                int val = grid[i][j];
                for(int k=0;k<=x;k++){
                    dp[i][j][k^val] = dp[i-1][j][k] || dp[i][j-1][k];
                }
            }
        }
        for(int i=0;i<=x;i++){
            if(dp[n-1][m-1][i]) return i;
        }
        return 0;
    }
}