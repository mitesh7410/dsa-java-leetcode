class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int ans  = 0;
        for(int i=0;i<n;i++){
            int[] arr = new int[26];
            for(int j=i;j<n;j++){
                arr[s.charAt(j)-'a']++;
                 int max = 0; int min = Integer.MAX_VALUE;
                 for(int k=0;k<26;k++){
                     if(arr[k]>0){
                        max = Math.max(arr[k],max);
                        min = Math.min(arr[k],min);
                     }
                 }
                 ans+=max-min;
            }      
        }
        return ans;
    }
}