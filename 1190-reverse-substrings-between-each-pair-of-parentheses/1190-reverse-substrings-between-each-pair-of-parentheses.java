class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        int[] pair = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else if (s.charAt(i) == ')') {
                int j = st.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }
        
        StringBuilder ans = new StringBuilder();
        int curr = 0;
        int dir = 1;
        
        while (curr < n) {
            if (s.charAt(curr) == '(' || s.charAt(curr) == ')') {
                curr = pair[curr]; 
                dir = -dir;        
            } else {
                ans.append(s.charAt(curr));
            }
            curr += dir; 
        }
        
        return ans.toString();
    }
}