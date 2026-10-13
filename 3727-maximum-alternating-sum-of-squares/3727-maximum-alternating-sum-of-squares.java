class Solution {
    public long maxAlternatingSum(int[] nums) {
       for(int i=0;i<nums.length;i++){
        nums[i]=nums[i]*nums[i];
       }
       Arrays.sort(nums);
       long ans = 0;
       int i = 0, j = nums.length-1;
       while(i<j){
        ans-=nums[i];
        ans+=nums[j];
        i++;
        j--;
       }
       if(i==j) ans+=nums[i];
       return ans;
    }
}