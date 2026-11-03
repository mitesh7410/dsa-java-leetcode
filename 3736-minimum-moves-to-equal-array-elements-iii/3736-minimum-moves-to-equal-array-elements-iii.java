class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        int sum = 0;
        for(int i:nums){
            max = Math.max(i,max);
            sum+=i;
        }
        return max*nums.length-sum;
    }
}