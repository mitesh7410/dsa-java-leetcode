class Solution {
    public boolean checkValidString(String s) {
        int left = 0;
        int right = 0;
        char[] chr = s.toCharArray();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(chr[i]=='('){
                left++;
                right++;
            }else if(chr[i]==')'){
                left--;
                right--;
            }
            else{
                left++;
                right--;
            }
            if(left<0) return false;
            if(right<0) right = 0;

        }
        return right==0;
    }
}