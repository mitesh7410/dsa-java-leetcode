class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j] == word.charAt(0)){
                if(search(board,word,0,i,j))
                 return true;
                } 
            }
        }
        return false;
    }
   private boolean search(char[][] board,String word, int idx, int r, int c){
        if(idx==word.length()) return  true;
        if(r<0||r>=board.length||c<0||c>=board[0].length||word.charAt(idx)!=board[r][c])
        return false;

        char temp = board[r][c];
        board[r][c]='#';
        boolean found=search(board,word,idx+1,r,c+1)||search(board,word,idx+1,r+1,c)||search(board,word,idx+1,r,c-1)||search(board,word,idx+1,r-1,c);
        
        board[r][c] =temp;
        return found;
    }
}