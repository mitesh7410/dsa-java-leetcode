class Solution {
    List<String>ans = new ArrayList<>();
    String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    private void combination(String str, int i, StringBuilder curr){
        if(i==str.length()){
         ans.add(curr.toString());
         return;
         }

        for(char ch:map[str.charAt(i)-'0'].toCharArray()){
            curr.append(ch);
            combination(str,i+1,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {

        combination(digits,0,new StringBuilder());
        return ans;
        
    }
}