class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
       
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                      list.add(grid[i][j]);
                }
            }
            int size = list.size();
            k = k%size;
            reverse(list,0,size-1);
            reverse(list,0,k-1);
            reverse(list,k,size-1);
            int idx = 0;
            for(int i=0;i<grid.length;i++){
                List<Integer> row =new ArrayList<>();
                for(int j=0;j<grid[0].length;j++){
                       row.add(list.get(idx++));
                }
                ans.add(row);
            }
        return ans;    
        
    }
    void reverse(List<Integer> list, int left, int right){
        while(left<right){
            int temp = list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);
            left++;
            right--;
        }
    }
}