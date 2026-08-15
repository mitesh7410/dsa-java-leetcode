class Solution {
    public int longestSubsequence(int[] nums) {
        int bitwise=0;
        int zero = 0;
        for(int num: nums){
            if(num==0)zero++;
            bitwise=bitwise^num;
        }
        if(bitwise!=0) return nums.length;
        else if(zero==nums.length) return 0;
        else return nums.length-1;
    }
}