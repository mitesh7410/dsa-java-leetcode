class Solution {
    public int minChanges(String s) {
        int n = s.length();
        int count = 0;
        // sorry guys mera phone thoda kharab ho gya hai and laptop pe whatsapp chal nhi rha
        for(int i=0;i<n;i=i+2){
            if(s.charAt(i)!=s.charAt(i+1))count++;
        }
        return count;
    }
}