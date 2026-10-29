class Solution {
    void swap(char[] ch, int i, int j){
        char temp = ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
    public int nextGreaterElement(int N) {
        String str = String.valueOf(N);
        char [] ch = str.toCharArray();
        int n = ch.length-1;
        int i=n-1;
        while(i>=0&&ch[i]>=ch[i+1]){
            i--;

        }
        if(i<0)
          return -1;

        int j=n;
        while(ch[j]<=ch[i]){
            j--;
        }
        swap(ch,i,j);
        int left = i+1;
        int right = n;
        while(left<=right){
            swap(ch,left,right);
            left++;
            right--;
        }
        long ans = 0;
        for(int k=0;k<=n;k++){
            ans=ans*10+ch[k]-'0';
        }
        return ans>Integer.MAX_VALUE?-1:(int)ans;
    
        

    }
}