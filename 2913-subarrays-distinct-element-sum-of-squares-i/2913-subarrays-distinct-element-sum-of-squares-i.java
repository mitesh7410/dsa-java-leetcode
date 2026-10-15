class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int ans = 0, count =0;
        for(int i=0;i<n;i++){
            int [] arr = new int[101];
            count=0;
            for(int j=i;j<n;j++){
                if(arr[nums.get(j)]==0){
                    arr[nums.get(j)]++;
                    count++;
                }
                ans+=count*count;
            }
        }
        return ans;
    }
}