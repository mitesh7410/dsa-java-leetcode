class Solution {
    private int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }

    public int maxLength(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i =0;i<n-1; i++){
            int pro = nums[i];
            int g = nums[i];
            int lcm = nums[i];
            for(int j=i+1;j<n;j++){
                pro*=nums[j];
                g = gcd(g, nums[j]);
                lcm = (lcm/gcd(lcm,nums[j]))*nums[j];
                if(pro==lcm*g){
                    if(ans<j-i+1){
                        ans = j-i+1;
                    }
                }
            }
        }
        return ans;
    }
}