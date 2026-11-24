class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int n = nums.length;
        int freq[]  = new int[n];
        for(int i=0;i<n;i++){
           freq[nums[i]-1]++;
        }
        for(int i= 0;i<n;i++){
            if(freq[i]==0) arr[1]=i+1;
            if(freq[i]==2) arr[0]=i+1;
        }
        return arr;
    }
}