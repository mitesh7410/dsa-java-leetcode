class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] arr1 = new int[9][9];
        int[][] arr2 = new int[9][9];
        int[][] arr3 = new int[9][9];
       
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int idx = board[i][j]-'0';
                if(board[i][j]!='.'){
                  arr1[i][idx-1]++;
                  arr2[j][idx-1]++;
                  arr3[(i/3)*3+j/3][idx-1]++;
                  if(arr1[i][idx-1]>1||arr2[j][idx-1]>1||arr3[(i/3)*3+j/3][idx-1]>1)
                     return false;
                }
               
            }
        }
        return true;
    }
}