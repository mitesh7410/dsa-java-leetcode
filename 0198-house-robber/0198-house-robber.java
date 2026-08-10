class Solution {
    public int rob(int[] num) {
        int m  = num.length;
        if(m==1) return num[0];
        if(m==2) return Math.max(num[0],num[1]);
        if(m==3){
            if(num[0]+num[2]>num[1]) return num[0]+num[2];
            else return num[1];
        }



        int[]dp = new int[m];
        dp[0]=num[0];
        dp[1]=num[1];
        dp[2]=num[0]+num[2];
        for(int i=3;i<m;i++){
           dp[i]=num[i]+Math.max(dp[i-2],dp[i-3]);
        }

        return Math.max(dp[m-1],dp[m-2]);
    }
}