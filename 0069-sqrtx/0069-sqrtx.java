class Solution {
    public int mySqrt(int x) {
        for(int i=0;i<Integer.MAX_VALUE;i++){
            if((double)i*i>(double)x) return i-1;
        }
        return 1;
    }
}