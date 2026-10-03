class Solution {
    public boolean checkValid(int[][] matrix) {
        int sum = 0;
        int n=  matrix.length;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        for(int i=0;i<n;i++){
            int s = 0;
            Set<Integer> set = new HashSet<>();
            for(int j=0;j<n;j++){
                if(!set.contains(matrix[i][j])){
                s+=matrix[i][j];
                set.add(matrix[i][j]);
                }
                else
                return false;
            }
            if(sum!=s)
             return false;
        }
         for(int i=0;i<n;i++){
            int s = 0;
            Set<Integer> set = new HashSet<>();
            for(int j=0;j<n;j++){
                if(!set.contains(matrix[j][i])){
                s+=matrix[j][i];
                set.add(matrix[j][i]);
                }
                else 
                return false;
            }
            if(sum!=s)
             return false;
        }
        return true;
    }
}