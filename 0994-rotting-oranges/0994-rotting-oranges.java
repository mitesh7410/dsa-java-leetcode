class Solution {
    class Pair{
        int x;
        int y;
        Pair(int i, int j){
            x = i;
            y = j;
        }
    }

    private boolean check(int i,int j, Queue<Pair> q, int[][] grid){
        if(i<0||j<0||i>grid.length||j>grid[0].length) return false;
        boolean flag = false;
        if(j-1>=0&&grid[i][j-1]==1){
            grid[i][j-1]=2;
            q.offer(new Pair(i,j-1));
            flag  = true;
        }
        if(i-1>=0&&grid[i-1][j]==1){
            grid[i-1][j]=2;
            q.offer(new Pair(i-1,j));
            flag  = true;

        }
        if(j+1<grid[0].length&&grid[i][j+1]==1){
            grid[i][j+1]=2;
            q.offer(new Pair(i,j+1));
            flag  = true;

        }
        if(i+1<grid.length&&grid[i+1][j]==1){
            grid[i+1][j]=2;
            q.offer(new Pair(i+1,j));
            flag  = true;

        }
        return flag;

    }
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                 q.offer(new Pair(i,j));
                }
            }
        }
        int ans =0;
        while(!q.isEmpty()){
            int size = q.size();
            boolean b = false;
            for(int i=0;i<size;i++){
                Pair p = q.poll();
               if(check(p.x,p.y,q,grid)){
                   b = true;
                }
            }
            if(b) ans++;    
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