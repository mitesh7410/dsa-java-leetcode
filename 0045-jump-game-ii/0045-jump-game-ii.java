class Solution {
    public int jump(int[] nums) {
        int count=0,currEnd = 0, farthest = 0;
        for(int i=0;i<nums.length-1;i++){
            farthest = Math.max(farthest, nums[i]+i);
            if(i==currEnd){
                count++;
                currEnd = farthest;
            }
        }
        return count;
    }
}