class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int bitwise=nums[0];
        int zero = nums[0]==0?1:0;
        for(int i=1;i<n;i++){
            if(nums[i]==0)zero++;
            bitwise=bitwise^nums[i];
        }
        if(zero==n)
        return 0;

        return bitwise==0?n-1:n;

    }
}