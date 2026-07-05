class Solution {
    public String longestPalindrome(String s) {
        int maxleft=0,maxright=0;
        int n = s.length();
        for(int i=0;i<n;i++){
            int left=i;int right=i;
            while((left>=0&&right<n)&&(s.charAt(left)==s.charAt(right))){
                left--;
                right++;
            }
            left++;
            right--; 
            if((right)-(left)>maxright-maxleft)
            {   
                maxleft=left;
                maxright=right;
            }
              left=i;right=i+1;
            while((left>=0&&right<n)&&(s.charAt(left)==s.charAt(right))){
                left--;
                right++;
            }
            left++;
            right--; 
            if((right)-(left)>maxright-maxleft)
            {   
                maxleft=left;
                maxright=right;
            }
            
        }
        return s.substring(maxleft,maxright+1);
    }
}