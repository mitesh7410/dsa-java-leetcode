class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = 0;
        int max = Math.max(start,goal);
        int min = Math.min(start,goal);
        while(max>0){
            if((min&1)!=(max&1)){
                ans++;
            }
            min=min>>1;
            max=max>>1;
        }
        return ans;
    }
}