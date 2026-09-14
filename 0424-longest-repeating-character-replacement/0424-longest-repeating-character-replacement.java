class Solution {
    public int characterReplacement(String s, int k) {
       int[] freq = new int[26];
       int maxfreq= 0,left =0,ans=0;
       for(int i=0;i<s.length();i++){
        freq[s.charAt(i)-'A']++;
        maxfreq = Math.max(maxfreq,freq[s.charAt(i)-'A']);
        if((i-left+1)-maxfreq>k)
        freq[s.charAt(left++)-'A']--;

        ans = Math.max(ans,i-left+1);
       }
     return ans;
    }
}