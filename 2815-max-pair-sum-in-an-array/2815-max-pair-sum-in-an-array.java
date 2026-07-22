class Solution {
    public int maxSum(int[] nums) {
        int[] arr = new int[nums.length];
        int ans = -1;
        for(int i=0;i<nums.length;i++){
            int max = 0;
            int num=nums[i];
               while(num>0){
                 max=Math.max(max,num%10);
                 num/=10;
               }
            arr[i]=max;   
        }
        int max = -1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                  if(arr[i]==arr[j])
                     max = Math.max(nums[i]+nums[j],max);
            }
        }
      return max;
    }
}