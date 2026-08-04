class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = 0;
        int min = 101;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            max = Math.max(nums[i],max);
            min = Math.min(nums[i],min);
        } 
        List <Integer> ans = new ArrayList<>();
        
        for(int i=min;i<=max;i++){
            if(!set.contains(i))
            ans.add(i);
        }

        return ans;
    }
}