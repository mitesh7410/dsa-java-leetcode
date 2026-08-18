class Solution {
    private boolean dfs(int[][] graph,int []colour,int i, int color){
        colour[i]=color;
        for(int j : graph[i]){
             if(colour[j]==0){
                if(!dfs(graph, colour, j, -color))
                return false;
             }
             else if(colour[j]==colour[i])
                return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int m=graph.length;
        int colour[] = new int[m];
        for(int i = 0 ; i < m ; i++){
            if(colour[i]==0){
                if(!dfs(graph,colour,i, 1))
                    return false;
            }
        }
        return true;
    }
}