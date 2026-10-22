class Solution {
    public int minOperations(int[] nums) {
        int idx0 = 0;
        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)idx0 = i;
            if(nums[i]<nums[(i+1)%n]){
                count1++;
            }
            else
               count2++;

        }
        if(count1>1&&count2>1) return -1;
        boolean check = false;
        if(count2==1){
            check = true;
        }
        int min = n;
        if(check){
             min = idx0;
             min = Math.min(idx0,n-idx0+2);  
        }
        else{
            min = idx0+2;
            min = Math.min(min,n-idx0);
        }
        return min;
    }
}