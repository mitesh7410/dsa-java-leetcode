class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
       
        long sum1 = 0;
        long sum2 = 0;
        for(int i=0;i<n/2;i++){
            sum1+=nums[i];
            sum2+=nums[i+n/2];     
        }
        int ans=0;
        int j=0;
        for(int i=0;i<n;i++){
            if(sum1>sum2) ans++;
            int k=(j+n/2)%n;
            sum1=(sum1-nums[j])+nums[k];
            sum2=(sum2-nums[k])+nums[j];
            j++;
   
            
        }
        return ans;
    }
}