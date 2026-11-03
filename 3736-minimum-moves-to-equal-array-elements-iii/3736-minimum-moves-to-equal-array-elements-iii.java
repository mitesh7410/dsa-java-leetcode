class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int i:nums){
            max = Math.max(i,max);
        }
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans=ans+(max-nums[i]);
        }
        return ans;
    }
}