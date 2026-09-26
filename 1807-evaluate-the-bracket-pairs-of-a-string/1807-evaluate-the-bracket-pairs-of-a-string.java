class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
         HashMap<String,String> map = new HashMap<>();
         int n = knowledge.size();
         for(int i=0;i<n;i++){
            List<String> li = knowledge.get(i);
            map.put(li.get(0),li.get(1));
         }
         n = s.length();
         StringBuilder ans = new StringBuilder();
         for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                StringBuilder str = new StringBuilder();
                i++;
                while(s.charAt(i)!=')'){
                    str.append(s.charAt(i));
                    i++;
                }
                String key =str.toString();
                if(map.containsKey(key)){
                    ans.append(map.get(key));
                }else{
                    ans.append('?');
                }
                
            }else
            ans.append(s.charAt(i));
         }
         return ans.toString();
    }
}