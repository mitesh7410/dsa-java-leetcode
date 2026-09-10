class Solution {
    public void rotate(int[] nums, int k) {
     
       k%=nums.length;

      int[] sub1=Arrays.copyOfRange(nums, 0, nums.length-k);
      int[] sub2=Arrays.copyOfRange(nums, nums.length-k, nums.length);
      for(int i = 0; i < sub2.length; i++)
          nums[i] = sub2[i];

      for(int i = 0; i < sub1.length; i++)
          nums[sub2.length + i] = sub1[i];        
    }
}