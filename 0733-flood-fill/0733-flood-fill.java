class Solution {
     class Pair{
        int x;
        int y;
        Pair(int i, int j){
            x = i;
            y = j;
        }
    }
    public int[][] floodFill(int[][] grid, int sr, int sc, int colour) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int c=0;
        int color = -1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==sr&&j==sc){
                 q.offer(new Pair(i,j));
                 color = grid[i][j];
                }
             

            }
        }
        if(colour==color) return grid;
        grid[sr][sc]=colour;
        while(!q.isEmpty()){
            int size = q.size();
            for(int k=0;k<size;k++){
                Pair p = q.poll();
                int i =p.x;
                int j=p.y;
        
        
           if(j-1>=0&&grid[i][j-1]==color){
              grid[i][j-1]=colour;
              q.offer(new Pair(i,j-1));
            }
           if(i-1>=0&&grid[i-1][j]==color){
              grid[i-1][j]=colour;
              q.offer(new Pair(i-1,j));

            }
           if(j+1<grid[0].length&&grid[i][j+1]==color){
              grid[i][j+1]=colour;
              q.offer(new Pair(i,j+1));

            }
           if(i+1<grid.length&&grid[i+1][j]==color){
              grid[i+1][j]=colour;
              q.offer(new Pair(i+1,j));

            }

            }

        }
                
        
        return grid;

        
    }
}