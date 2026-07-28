class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1) return s;
        int len = s.length()/2;
        String str = s.substring(0,len);
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        StringBuilder st = new  StringBuilder();
        for(char c:ch)
               st.append(c);
        if(s.length()%2!=0) 
          st.append(s.charAt(len));     
        for(int i=ch.length-1;i>=0;i--)
          st.append(ch[i]);
        
        return st.toString();  
    }
}