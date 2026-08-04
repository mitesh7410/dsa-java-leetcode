class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = 0;
        int min = 101;
        boolean arr[] = new boolean[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=true;
            max = Math.max(nums[i],max);
            min = Math.min(nums[i],min);
        } 
    
        List <Integer> ans = new ArrayList<>();
        
        for(int i=min;i<=max;i++){
            if(!arr[i])
            ans.add(i);
        }

        return ans;
    }
}