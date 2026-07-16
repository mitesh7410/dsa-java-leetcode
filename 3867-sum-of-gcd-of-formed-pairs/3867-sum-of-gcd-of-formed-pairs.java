class Solution {
    public static int gcd(int a,int b)
    {
        while (b != 0) {
        int t = b;
        b = a % b;
        a = t;
    }
    return a;
    }
    public long gcdSum(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
           nums[i]= gcd(max,nums[i]);
        }
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        long ans = 0;
        while(left<right){
                ans+=gcd(nums[left],nums[right]);
                left++;
                right--;
        }
        return ans;
    }
}