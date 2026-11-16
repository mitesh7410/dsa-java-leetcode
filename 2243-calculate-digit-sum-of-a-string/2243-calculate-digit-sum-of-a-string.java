class Solution {
    public String digitSum(String s, int k) {
        int n = s.length();
        while(s.length()>k){
            StringBuilder st = new StringBuilder();
            int i=0;
            while(i<s.length()){
                int val = 0;
                for(int j=i;j<i+k&&j<s.length();j++){
                    val+=s.charAt(j)-'0';
                }
                st.append(val);
                i=i+k;
            }
            s = st.toString();    
        }
        return s;
    }
}