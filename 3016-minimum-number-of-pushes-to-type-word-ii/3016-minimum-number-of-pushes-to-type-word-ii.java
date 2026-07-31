class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        for(char ch: word.toCharArray()){
            arr[ch-'a']++;
        }int j=0;
        int ans=0;
        Arrays.sort(arr);
        for(int i=25;i>=0;i--){
              if(arr[i]>0){
                  ans+=(j/8+1)*arr[i];
                  j++;
              }
        }
            return ans;
    }
}