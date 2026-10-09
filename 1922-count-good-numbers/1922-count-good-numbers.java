class Solution {
    private long mod = 1000000007;
    private long pow(long base, long power){
        long result = 1;
        base%=mod;
        while(power>0){
            if((power&1)==1) result = result*base%mod;
            base = base*base%mod;
            power>>=1;
        }
        return result;
    }
    public int countGoodNumbers(long n) {
        long odd = n/2;
        long even = (n+1)/2;
        return (int)(pow(5,even)*pow(4,odd)%mod);
    }
}