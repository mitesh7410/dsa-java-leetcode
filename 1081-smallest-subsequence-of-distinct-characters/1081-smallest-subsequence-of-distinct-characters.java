class Solution {
    public String smallestSubsequence(String s) {
        int[] lastidx = new int[26];
        for(int i = 0;i<s.length();i++){
            lastidx[s.charAt(i)-'a'] = i ;
        }
        Deque<Character> st = new ArrayDeque<>();
        boolean[] instack = new boolean[26];

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(instack[ch-'a']) continue;
            while(!st.isEmpty()&&st.peek()>ch&&lastidx[st.peek()-'a']>i){
                instack[st.pop()-'a']=false;
            }
            st.push(ch);
            instack[ch-'a']=true;
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) sb.append(st.pop());
        return sb.reverse().toString();
    }
}