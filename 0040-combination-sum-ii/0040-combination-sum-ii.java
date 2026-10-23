class Solution {
    private void comb(List<List<Integer>> ans,List<Integer> li, int i, int sum, int target, int[] candidate){
        if(sum==target){
            ans.add(new ArrayList<>(li));
            return;
        }
        if(i==candidate.length) return;
        if(sum>target) return;
        li.add(candidate[i]);
        comb(ans,li,i+1,sum+candidate[i],target,candidate);
        li.remove(li.size()-1);
        int next = i + 1;
        while (next < candidate.length && candidate[next] == candidate[i]) next++;
        comb(ans,li,next,sum,target,candidate);
        return;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        comb(ans,new ArrayList<>(),0,0,target,candidates);
        return ans;
    }
}