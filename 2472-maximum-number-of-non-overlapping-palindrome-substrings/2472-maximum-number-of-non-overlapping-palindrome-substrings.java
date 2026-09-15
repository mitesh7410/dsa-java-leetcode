class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        if(k==1) return n;

        int res = 0;

        for(int i=0;i<=n-k;i++){
            if(check(i,i+k-1,s)){
                res++;
                i+=k-1;
            }
            else if(i<n-k&&check(i,i+k,s)){
                res++;
                i+=k;
            }
        }

        return res;
    }
    private boolean check(int i, int j, String s){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
}