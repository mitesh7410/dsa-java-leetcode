class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
   
         int n = s.length();
         int cnt = 0;
         int left=0;
         String ans ="";
         char[] ch = s.toCharArray();
         for(int i=0;i<n;i++){
            if(ch[i]=='1')cnt++;
            while(cnt>k){
                if(ch[left]=='1')cnt--;
                left++;
            }
            if(cnt==k){
                while(left<i&&ch[left]=='0')left++;

                String cur = s.substring(left,i+1);

                if(ans.isEmpty()||ans.length()>cur.length()||(cur.length()==ans.length()&&cur.compareTo(ans)<0))
                ans=cur;
            }
         }

         return ans; 
    }
}