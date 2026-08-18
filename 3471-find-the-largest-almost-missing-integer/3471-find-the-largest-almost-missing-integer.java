class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if(n==1) return nums[0];
        
        int max = 0, min = 51;
        for(int i=0;i<n;i++){
           max = Math.max(max,nums[i]);
           min = Math.min(min,nums[i]);
        }
        if(n==k) return max;
        int [] arr = new int[max+1];

        for(int i = 0; i<=n-k ; i++){
            int j = i;
            while(j<i+k){
             
                 arr[nums[j]]++;
            
              j++;  
            }     
        }
        for(int i = max; i >=min ; i-- ){
            if(arr[i]==1)
            return i;
        }
        return -1;
    }
}