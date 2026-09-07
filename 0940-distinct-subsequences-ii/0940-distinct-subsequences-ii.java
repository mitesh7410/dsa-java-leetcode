class Solution {
    public int distinctSubseqII(String s) {
        int n = s.length();
        int[] dup = new int[256];
        int[] dp = new int[n+1];
        Arrays.fill(dup,-1);
        dp[0]=1;
        int MOD = 1000000007;
        for(int i=1;i<=n;i++){
            char ch = s.charAt(i-1);
            dp[i]=(2*dp[i-1])%MOD;

            if(dup[ch]!=-1){
                dp[i]=(dp[i]-dp[dup[ch]-1]+MOD)%MOD;
            }
            dup[ch]=i;
        }
        return (dp[n]-1+MOD)%MOD;
    }
}