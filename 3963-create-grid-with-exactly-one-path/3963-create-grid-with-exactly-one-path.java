class Solution {
    public String[] createGrid(int m, int n) {
        char[][] arr = new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='#';
            }
        }
        for(int i=0;i<n;i++){
            arr[0][i]='.';
        }
        for(int i=0;i<m;i++){
            arr[i][n-1]='.';
        }
        String [] ans = new String[m];
        for(int i=0;i<m;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(arr[i][j]);
            }
            ans[i]=sb.toString();
        }

        return ans;
    }
}