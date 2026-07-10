class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        } 
        int length = 0;
        for(int i:freq){
            length += (i/2)*2;
        }
        if(length<s.length())
         length++;
         return length;
    }
}