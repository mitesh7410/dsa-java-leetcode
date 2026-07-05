class Solution {
    public int removeElement(int[] nums, int val) {
        int[] arr = new int[nums.length];
        int count=0; 
        int j=0;
        for(int i:nums){
           if(i==val){
            count++;
            continue;
           }
           arr[j++]=i;
        }
        j=0;
       for(int k:arr){
        nums[j++]=k;
       }
       return nums.length-count;
    }
}