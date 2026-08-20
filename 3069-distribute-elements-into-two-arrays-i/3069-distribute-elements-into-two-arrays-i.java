class Solution {
    public int[] resultArray(int[] nums) {
        int n  = nums.length;
        int num1[] = new int[n];
        int num2[] = new int[n];
        num1[0]=nums[0];
        num2[0]=nums[1]; 
        int j=0,k=0;
        for(int i=2;i<n;i++){
            if(num1[j]>num2[k]){
                j++;
                num1[j]=nums[i];
            }
            else{
                k++;
                num2[k]=nums[i];
            }
        }
        int i=0;j=0;
        while(num1[i]!=0){
           nums[i]=num1[i];
           i++;
        }
        while(num2[j]!=0){
            nums[i]=num2[j];
            j++;
            i++;
        }

        return nums;
    }
}