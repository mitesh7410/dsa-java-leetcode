class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = 0;
        int mid = nums.length;
        if(nums.length%2==0){
            int sum = nums[mid/2]+nums[mid/2-1];
            median = sum/2;
        }
        else{
            median = nums[mid/2];
        }
        int ans = 0;
        for(int i: nums){
            ans+=Math.abs(i-median);
        }
        return ans;
    }
}