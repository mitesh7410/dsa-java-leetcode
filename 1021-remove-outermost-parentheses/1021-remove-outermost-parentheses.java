class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans= new StringBuilder();
        int n=s.length();
        int  depth = 0;
        for(int i=0;i<n;i++){
             if(s.charAt(i)=='('){
                if(depth>0){
                  ans.append('(');
                }
                depth++;
             }else{
                depth--;
                if(depth>0){
                    ans.append(')');
                }
             }
        }
        return ans.toString();
    }
}