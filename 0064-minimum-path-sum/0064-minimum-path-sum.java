class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(i==0&&j==0){
                    ans[i][j]=grid[i][j];
                    continue;
                    }
                int top = i>0?ans[i-1][j]:10000000;
                int left = j>0?ans[i][j-1]:100000000;

                ans[i][j] = grid[i][j]+Math.min(top,left);

            }
        }

        return ans[m-1][n-1];
    }
}