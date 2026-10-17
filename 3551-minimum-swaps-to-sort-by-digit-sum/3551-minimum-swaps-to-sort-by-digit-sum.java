class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            int temp = nums[i];
            int sum = 0;
            while(temp > 0){
                sum += temp%10;
                temp /= 10;
            }
            arr[i][0] = sum;
            arr[i][1] = i;
        }
        Arrays.sort(arr,(a,b) ->{
            if(a[0]!=b[0]) return Integer.compare(a[0],b[0]);
            return Integer.compare(nums[a[1]],nums[b[1]]);
        } );
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i][1] != i){
                count++;
            }
        }
        int cycle = 0;
        for(int i=0;i<n;i++){
            if(arr[i][1] != i){
                cycle++;
                int temp = arr[i][1];
                while(temp != i){
                    int val = arr[temp][1];
                    arr[temp][1] = temp;
                    temp = val;
                }
            }
        }
        return count - cycle;
    }
}