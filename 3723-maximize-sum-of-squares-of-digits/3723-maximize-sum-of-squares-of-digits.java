class Solution {
    public String maxSumOfSquares(int num, int sum) {
         if(sum>9*num) return "";
         StringBuilder str = new StringBuilder();
         for(int i=0;i<num;i++){
            int j = 9;
                while(j>sum&&j>=0){
                    j--;
                }
                sum-=j;
                str.append(j);

         }
         return str.toString();
    }
}