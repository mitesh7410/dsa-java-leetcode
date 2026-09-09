class Solution {
     List<List<Integer>> ans = new ArrayList<>();
     boolean[] used ;
     Set<List<Integer>> set = new HashSet<>();
        private void backtrack(int[] nums, List<Integer> curr, boolean[] used) {
        if (curr.size() == nums.length&&!set.contains(curr)) {
            set.add(curr);
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            curr.add(nums[i]);
            backtrack(nums, curr, used);
            curr.remove(curr.size() - 1); 
            used[i] = false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), used);
        return ans;
    }
}