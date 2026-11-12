class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=1;i<=32;i++){
            int cnt = 0;
            for(int j:nums){
                cnt +=(j>>i)&1;
            }
            if(cnt%3!=0){
                ans=ans|1<<i;
            }
        }
        return ans;
    }
}