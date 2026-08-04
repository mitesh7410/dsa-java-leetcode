class Solution {
    public boolean stoneGame(int[] piles) {
        int sum = 0;
        for(int i=0;i<piles.length;i++){
            sum += piles[i];
        }
        int[][] dp = new int[piles.length][piles.length];
        int a = dfs(piles,0,piles.length-1,true,dp);
        int b = sum - a;
        if(a > b){
            return true;
        }
        return false;
    }
    public int dfs(int[]  piles,int i,int j,boolean b,int[][] dp){
        if(i > j){
            return 0;
        }
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        if(b){
            return dp[i][j] = Math.max(dfs(piles,i+1,j,!b,dp)+piles[i],dfs(piles,i,j-1,!b,dp)+piles[j]);
        }
        return dp[i][j] = Math.min(dfs(piles,i+1,j,!b,dp),dfs(piles,i,j-1,!b,dp));
    }
}