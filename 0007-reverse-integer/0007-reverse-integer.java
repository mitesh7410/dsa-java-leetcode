class Solution {
    public int reverse(int x) {
     
        int rem = 0;
        long rev = 0;
        if(x<0){
            x=x*(-1);
            while(x>0){
                rem = x%10;
                rev=rev*10+rem;
                x/=10;   
            }
            rev = (-1)*rev;
        }
        else{
            while(x>0){
                rem = x%10;
                rev=rev*10+rem;
                x/=10;   
            }
        }
        return (rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE)? 0: (int)rev;
        
    }
}