class Solution {
    public String longestCommonPrefix(String[] str) {
        StringBuilder prefix = new StringBuilder(str[0]);
        for(int i=1;i<str.length;i++){
            while(!str[i].startsWith(prefix.toString())){
                prefix.deleteCharAt(prefix.length()-1);
            }
            if(prefix.isEmpty())
            return "";
        }
        return prefix.toString();

    }
}