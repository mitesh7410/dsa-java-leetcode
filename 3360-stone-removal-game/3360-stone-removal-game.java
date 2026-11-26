class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int  init = 10;
        int turn = 0;

        while(n>=init){
            if(turn==0){
                n-=init;
                init-=1;
                turn=1;
            }else{
                n-=init;
                init-=1;
                turn=0;
            }
        }
        return turn==0&&n>=0?false:true;
        
    }
}