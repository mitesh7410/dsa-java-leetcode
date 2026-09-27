class Solution {
    public String reverseParentheses(String s) {
        Deque<Integer> st = new ArrayDeque<>(); 
        int n = s.length();
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='(')
             st.push(i);
            else if (str.charAt(i)==')'){ 
                int left = st.pop();
                int right = i;
                while(left<=right){
                    char ch = str.charAt(left);
                    str.setCharAt(left,str.charAt(right));
                    str.setCharAt(right,ch);
                    left++;
                    right--;
                }
            }

        }
        String ans = "";
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=')'&&str.charAt(i)!='('){
                ans+=str.charAt(i);
            }
        }
        return ans;
    }
}