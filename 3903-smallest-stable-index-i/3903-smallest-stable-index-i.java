class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int nums1[] = new int[n];
        int min  = Integer.MAX_VALUE;
        for(int i = n-1 ; i>=0; i--){
           min=Math.min(nums[i],min); 
           nums1[i]= min;
        }
        int max = 0;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            if((max-nums1[i])<=k){
            return i;
            }
        }

        return -1;
    }
}