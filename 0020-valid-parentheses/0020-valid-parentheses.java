class Solution {
    public boolean isValid(String str) {
      Stack<Character> ans = new Stack<>();
      for(int i=0;i<str.length();i++) {
        if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{')
        ans.push(str.charAt(i));
        else if(ans.isEmpty()) return false;
        else if(str.charAt(i)==')'&& ans.peek()=='(')
        ans.pop();
        else if(str.charAt(i)=='}'&& ans.peek()=='{')
        ans.pop();
        else if(str.charAt(i)==']'&& ans.peek()=='[')
        ans.pop();
        else return false;
         
      } 
      return ans.isEmpty();
    }
}