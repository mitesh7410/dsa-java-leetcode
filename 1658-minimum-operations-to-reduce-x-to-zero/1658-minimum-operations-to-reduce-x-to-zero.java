class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = 0;
        for(int i: nums){
            
            sum+=i;
        }
        int find = sum-x;
        if (find < 0) return -1;
        sum = 0;
        int left = 0;
        int ans=-1;
        for(int i=0;i<n;i++){
 
             sum+=nums[i];

             while(left<=i&&sum>find){
                sum-=nums[left++];
             }
            if(sum==find&&ans<i-left+1)
                ans = i-left+1;
        }
        return ans==-1?-1:n-ans;
    }
}