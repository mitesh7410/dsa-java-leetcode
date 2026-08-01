class Solution {
    public boolean stoneGame(int[] piles) {
        int alice =0;
        boolean al = true;
       
        int bob =0;
        int left=0,right = piles.length-1;
        while(left<right){
              if(al){
                if(piles[left]>=piles[right])
                  alice+=piles[left++];
                else
                  alice+=piles[right--];
              }
              else{
                if(piles[left]<piles[right])
                  bob+=piles[left++];
                else
                  bob+=piles[right--];
              }
        }
        return alice>bob;
    }
}