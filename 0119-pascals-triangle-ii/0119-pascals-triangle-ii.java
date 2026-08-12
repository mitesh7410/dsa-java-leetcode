class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int j=0;j<rowIndex;j++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int i=1;i<ans.size();i++){
                row.add(ans.get(i-1)+ans.get(i));
            }
            row.add(1);
            ans = row;
        }

        return ans;
    }
}