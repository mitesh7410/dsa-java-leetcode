class Solution {
    public int minOperations(String s) {
        if(s.length()==1) return 0;
        char mn = 'z';
        char mx = 'a';
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            mn = (char)Math.min(mn,s.charAt(i));
            mx = (char)Math.max(mx,s.charAt(i));
            if(i>0&&s.charAt(i-1)>s.charAt(i))
             flag = false;
        }
        if(flag) return 0;
        if(s.length()==2) return -1;
        if(s.charAt(0)==mn||s.charAt(s.length()-1)==mx)return 1;
         
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)==mn||s.charAt(i)==mx)
             return 2;
        }
       return 3;  
    }
}