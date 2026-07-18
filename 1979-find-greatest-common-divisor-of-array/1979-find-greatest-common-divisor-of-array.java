class Solution {
    public int findGCD(int[] nums) {
        int max = 0;
        int min = 10001;
        for(int i:nums){
           max = Math.max(i,max);
           min = Math.min(i,min);
        }
        while(max%min>0){
           int temp = min;
           min =max%min;
           max = temp;
        }
        return min;
        
    }
}