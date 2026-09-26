class Solution {
    public int totalNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] arr = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='.';
            }
        }
        placeQueen(0,ans,arr);
        return ans.size();
    }
    private void placeQueen(int row, List<List<String>> ans, char[][] arr){
        if(row==arr.length){
            ans.add(construct(arr));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(isSafe(arr,row,i)){
               arr[row][i]='Q';
               placeQueen(row+1,ans,arr);
               arr[row][i]='.';
            }
        }
    }
    private List<String> construct(char[][]arr){
        List<String> str = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            String row = new String(arr[i]);
            str.add(row);
        }
        return str;
    }
    private boolean isSafe(char[][]arr,int row, int col){
        
        for(int i=0;i<row;i++){
            if(arr[i][col]=='Q')
             return false;
        }
        int left = Math.min(row,col);
        for(int i=1;i<=left;i++){
            if(arr[row-i][col-i]=='Q')
            return false;
        }
        int right = Math.min(row,arr.length-1-col);

        for(int i=1;i<=right;i++){
            if(arr[row-i][col+i]=='Q')
            return false;
        }
        return true;
    }
}
