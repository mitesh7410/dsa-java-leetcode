class Solution {
    public int countGroups(int[] position, int[] speed, int distance) {
        int n=speed.length, g=1, l=position[n-1];
        int gs=speed[n-1]; 
        for(int i=n-2;i>=0;i--) {
            int gap=l-position[i];
            if(gap<=distance){
                l=position[i]; continue;
            }
            if(speed[i]>gs) l=position[i];
            else {
                g++; l=position[i];
                gs=speed[i];
            }
        } return g;
    }
}