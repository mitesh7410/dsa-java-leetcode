class Solution {
    class Pair{
        int x;
        int y;
        Pair(int i, int j){
            x = i;
            y = j;
        }
    }

    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                 q.offer(new Pair(i,j));
                }
                if(grid[i][j]==1) c=1;

            }
        }
        if(q.isEmpty()&&c==0) return 0;
        int ans =-1;
        while(!q.isEmpty()){
            int size = q.size();
            ans++;
            for(int k=0;k<size;k++){
                Pair p = q.poll();
                int i =p.x;
                int j=p.y;
        
        
           if(j-1>=0&&grid[i][j-1]==1){
              grid[i][j-1]=2;
              q.offer(new Pair(i,j-1));
            }
           if(i-1>=0&&grid[i-1][j]==1){
              grid[i-1][j]=2;
              q.offer(new Pair(i-1,j));

            }
           if(j+1<grid[0].length&&grid[i][j+1]==1){
              grid[i][j+1]=2;
              q.offer(new Pair(i,j+1));

            }
           if(i+1<grid.length&&grid[i+1][j]==1){
              grid[i+1][j]=2;
              q.offer(new Pair(i+1,j));

            }

            }

        }
                
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                return -1;
                }
            }
        } 
        return ans;
    }
}