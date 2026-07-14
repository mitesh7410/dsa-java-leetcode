class Solution {
    public boolean exist(char[][] board, String word) {
        char[] word_arr = word.toCharArray();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word_arr[0] && exists(board, i, j, word_arr, 0)) return true;
            }
        }
        return false;
    }

    private boolean exists(char[][] board, int i, int j, char[] word_arr, int idx){

        if(idx == word_arr.length) return true;

        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == '*' || board[i][j] != word_arr[idx]) return false;

        char ch = board[i][j];
        
        board[i][j] = '*';

        boolean result = exists(board, i+1, j, word_arr, idx+1) || exists(board, i-1, j, word_arr, idx+1) || exists(board, i, j+1, word_arr, idx+1) || exists(board, i, j-1, word_arr, idx+1);
        board[i][j] = ch;

        return result;
    }
}