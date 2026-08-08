class Solution {
    private void dfs(int[][] image, int i, int j, int a,int color){
        if(image[i][j]!=a||image[i][j]==color) return;
        else
        image[i][j]=color;

        if(i-1>=0)dfs(image,i-1,j,a,color);
        if(i+1<image.length)dfs(image,i+1,j,a,color);
        if(j-1>=0)dfs(image,i,j-1,a,color);
        if(j+1<image[0].length)dfs(image,i,j+1,a,color);

        return;

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int a = image[sr][sc];
        if(color==a) return image;
        image[sr][sc]=color;

        if(sr-1>=0)dfs(image,sr-1,sc,a,color);
        if(sr+1<image.length)dfs(image,sr+1,sc,a,color);
        if(sc-1>=0)dfs(image,sr,sc-1,a,color);
        if(sc+1<image[0].length)dfs(image,sr,sc+1,a,color);

        return image;

    }
}