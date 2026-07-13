class Solution {
    public int firstMissingPositive(int[] nums) {
        int max = 0;
        for(int i:nums)
        max= Math.max(max,i);
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<max;i++){
            if(!set.contains(i))
            return i;
        }
        return max+1;
    }
}