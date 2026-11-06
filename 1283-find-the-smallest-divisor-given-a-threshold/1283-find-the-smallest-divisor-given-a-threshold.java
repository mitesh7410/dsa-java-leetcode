class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int left = 1, right=0;
        for(int i: nums){

            right = Math.max(right, i);
        }
        while(left<=right){
            int sum = 0;
            int mid = left+(right-left)/2;
            for(int i:nums){
                sum+=(i+mid-1)/mid;
            }
            if(sum<=threshold){
                right = mid-1;
            }
            else{
               left = mid+1;
            }
        }
        return left;
    }
}