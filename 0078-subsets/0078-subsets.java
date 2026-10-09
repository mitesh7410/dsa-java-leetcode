class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private void powerSet(int[] nums, int i, List<Integer> li){
        if(i>=nums.length){
            ans.add(new ArrayList<>(li));
            return;
        }    
            li.add(nums[i]);
            powerSet(nums,i+1,li);
            li.remove(li.size()-1);
            powerSet(nums,i+1,li);

    }
    public List<List<Integer>> subsets(int[] nums) {
      powerSet(nums, 0, new ArrayList<>() );
      return ans;
    }
}