class Solution {
    public int numTrees(int n) {
        int dp[] = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
            int leftsubtree= dp[j-1];
            int rightsubtree= dp[i-j];
            dp[i]+=leftsubtree*rightsubtree;
            }
        }
      return dp[n];  
    }
}