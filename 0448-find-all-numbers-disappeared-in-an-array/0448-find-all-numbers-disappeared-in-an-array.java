class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                int temp =nums[i]-1;
                while(nums[temp]!=0){
                    int val = nums[temp]-1;
                    nums[temp]=0;
                    temp=val;
                    
                }
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=0)ans.add(i+1);
        }
        return ans;
    }
}