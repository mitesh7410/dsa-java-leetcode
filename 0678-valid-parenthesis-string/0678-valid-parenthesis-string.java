class Solution {
    public boolean checkValidString(String s) {
        int high = 0;
        int low = 0;
        char[] chr = s.toCharArray();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(chr[i]=='('){
                high++;
                low++;
            }else if(chr[i]==')'){
                high--;
                low--;
            }
            else{
                high++;
                low--;
            }
            if(high<0) return false;
            if(low<0) low = 0;

        }
        return low==0;
    }
}