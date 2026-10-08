class Solution {
    public int beautySum(String s) {
        int cnt=0;
        for(int i=0;i<s.length();i++){
            int[] fre=new int[26];
            int maxfre=0;
            for(int j=i;j<s.length();j++){
                int ind=s.charAt(j)-'a';
                fre[ind]++;
                if(fre[ind]>maxfre){
                    maxfre=fre[ind];
                }
                int minfre=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(fre[k]>0){
                        minfre=Math.min(minfre,fre[k]);
                    }
                }
                cnt+=(maxfre-minfre);
            }
        }
        return cnt;
    }
}