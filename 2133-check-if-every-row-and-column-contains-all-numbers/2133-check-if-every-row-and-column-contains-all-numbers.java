class Solution {
    public boolean checkValid(int[][] matrix) {
        int[] seen=new int[matrix.length+1];
        Arrays.fill(seen,0);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                int a=matrix[i][j];
                if(seen[a]==1){
                    return false;
                }
                seen[a]=1;

            }
            Arrays.fill(seen,0);
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                int a=matrix[j][i];
                if(seen[a]==1){
                    return false;
                }
                seen[a]=1;

            }
            Arrays.fill(seen,0);
        }

        return true;
    
        
    }
}