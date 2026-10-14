class Solution {

    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) {
            return "";
        }
       int s  = sum%9;
       sum-=s;
       StringBuilder sb = new StringBuilder();
       while(sum/9!=0){
          sb.append(9);
          sum-=9;
       }
       if (sb.length() < num) sb.append(s);   
        while (sb.length() < num) sb.append(0);

       return sb.toString();
       
    }
}