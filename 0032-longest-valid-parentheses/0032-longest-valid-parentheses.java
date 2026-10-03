class Solution {
    public int longestValidParentheses(String s) {
        Deque<Integer> st = new ArrayDeque<>();
        st.addFirst(-1);
        int n = s.length();
        int max = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.addFirst(i);
            }else{
                st.removeFirst();
                if(st.isEmpty()){
                    st.addFirst(i);
                }
                else
                max = Math.max(max, i-st.peekFirst());
            }
        }
        return max;
    }
}