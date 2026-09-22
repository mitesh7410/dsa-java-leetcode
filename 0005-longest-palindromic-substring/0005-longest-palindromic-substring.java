class Solution {
    public String longestPalindrome(String s) {
        int left = 0;
        int right = 0;
        int n = s.length();
        for(int i = 0; i<n; i++){
            int l = i;
            int r = i;
            while(l>=0&&r<n&&s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            l++;
            r--;
            if(r-l>right-left){
                right = r;
                left = l;
            }
            l=i;
            r=i+1;
            while(l>=0&&r<n&&s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            l++;
            r--;
            if(r-l>right-left){
                right = r;
                left = l;
            }

        }
        return s.substring(left,right+1);
    }

}