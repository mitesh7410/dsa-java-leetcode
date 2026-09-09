class Solution {
    List<List<Integer>> ans =  new ArrayList<>();
    private void check(int [] candidate,int remaining, int i,  List<Integer> li){
             if(remaining==0){
                ans.add(new ArrayList<>(li));
                return;
             }
            if(remaining<0) return;
            for(int j= i ;j<candidate.length;j++){

            if (j > i && candidate[j] == candidate[j - 1]) {
                continue;
            }
            
            if (candidate[j] > remaining) {
                break;
            }

            li.add(candidate[j]);
            check(candidate,remaining-candidate[j], j+1 , li);
            li.remove(li.size()-1);
          }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        check(candidates,target,0, new ArrayList<>());

        return ans; 

        
    }
}