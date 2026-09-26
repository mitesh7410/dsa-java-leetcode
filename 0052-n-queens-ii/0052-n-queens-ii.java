class Solution {
    private int ans = 0;
    public int totalNQueens(int n) {
        char[][] arr = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='.';
            }
        }
        placeQueen(0,arr);
        return ans;
    }
    private void placeQueen(int row, char[][] arr){
        if(row==arr.length){
            ans=ans+1;
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(isSafe(arr,row,i)){
               arr[row][i]='Q';
               placeQueen(row+1,arr);
               arr[row][i]='.';
            }
        }
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
