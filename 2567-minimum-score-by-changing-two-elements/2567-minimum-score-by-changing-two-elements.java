class Solution {
    public int minimizeSum(int[] nums) {
        if(nums.length==3) return 0;
        Arrays.sort(nums);
        return Math.min(nums[nums.length-3]-nums[0],Math.min(nums[nums.length-2]-nums[1],nums[nums.length-1]-nums[2]));
    }
}