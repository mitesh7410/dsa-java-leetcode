class Solution {
    public boolean checkValidString(String s) {
        int high=0;
        int low=0;
        int i=0;
        while(i!=s.length()){
            if(s.charAt(i)=='(')
             {
                low++;
                high++;
             }
             else if(s.charAt(i)==')'){
                low--;
                high--;
             }
             else{
                low--;
                high++;
             }
             if(high<0) return false;
             if(low<0) low = 0;

             i++;
        }
        return low==0;
    }
}