class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] ans = new int [n];
        int depth = 0;
        char[] ch = seq.toCharArray();
        for(int i=0;i<n;i++){
            if(ch[i]=='('){
                depth++;
                ans[i]=depth%2;
            }
            else if(ch[i]==')'){
                ans[i]=depth%2;
                depth--;
            }
        }
        

        return ans;
    }
}