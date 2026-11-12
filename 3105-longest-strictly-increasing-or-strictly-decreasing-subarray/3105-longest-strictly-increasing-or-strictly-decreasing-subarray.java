class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1,min=1,n=nums.length;
        int ans = 0;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                max++;
                ans=Math.max(ans,max);
            }
            else{
                max = 1;
            }
        }
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                min++;
                ans=Math.max(ans,min);
            }
            else{
                min = 1;
            }
        }

        return ans==0?1:ans;
    }
}