class Solution {
    private List<List<String>> ans = new ArrayList<>();
    boolean palindrome(String s ,int l ,int i){
        int left = l, right = i;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public void part(String s, List<String> list, int l){
        if(l==s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=l;i<s.length();i++){
            
            if(palindrome(s,l, i)){
                list.add(s.substring(l, i+1));
                part(s,list,i+1);
                list.remove(list.size()-1);
            }
            
        }
    }
    public List<List<String>> partition(String s) {
        part(s,new ArrayList<>(), 0);
        return ans;
    }
}