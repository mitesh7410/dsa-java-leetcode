class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr = new int[n*2];
        boolean b = true;
        arr[0]=nums[0];
        for(int i=1;i<n;i++){
            arr[i*2]=nums[i];
        }
        int j =1;
        for(int i = n;i<2*n;i++){
            arr[j]=nums[i];
            j=j+2;
        }
        return arr;
    }
}