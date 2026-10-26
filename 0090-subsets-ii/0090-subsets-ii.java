class Solution {
    private void set(List<List<Integer>>ans,List<Integer>li, int i, int[] nums){
        if(i>nums.length-1){
            ans.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[i]);
        set(ans,li,i+1,nums);
        li.remove(li.size()-1);
        int j=i+1;
        while(j<nums.length&&nums[i]==nums[j]) j++;
        set(ans,li,j,nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        set(ans,new ArrayList<>(),0,nums);
        return ans;
    }
}