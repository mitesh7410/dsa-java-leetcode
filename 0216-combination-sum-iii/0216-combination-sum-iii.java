class Solution {
    private void comb(List<List<Integer>> ans, List<Integer>li, int i, int target, int k){
        if(target==0&&li.size()==k){
            ans.add(new ArrayList<>(li));
            return;
        }
        if(target<0||i>9) return;
        li.add(i);
        comb(ans,li,i+1,target-i,k);
        li.remove(li.size()-1);
        comb(ans,li,i+1,target,k);
        return;

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        comb(ans,new ArrayList<>(),1,n,k);
        return ans;
    }
}