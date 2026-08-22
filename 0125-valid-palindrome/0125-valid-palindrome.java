class Solution {
    public boolean isPalindrome(String s) {

       char[] str = s.toLowerCase().toCharArray();
       int left=0;
       int right = str.length-1;
       while(left<right){
        if (!Character.isLetterOrDigit(str[left])) { left++; continue; }
        if (!Character.isLetterOrDigit(str[right])) { right--; continue; }
        if (str[left] != str[right]) return false;
        left++;
        right--;
       }
       return true;
    }
}