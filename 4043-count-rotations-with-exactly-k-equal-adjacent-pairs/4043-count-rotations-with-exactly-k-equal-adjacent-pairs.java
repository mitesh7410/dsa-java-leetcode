class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int count=0;
        for(int i = 0; i<n; i++){
            if(s.charAt(i)==s.charAt((i+1)%n)){
                count++;
            }            
             
        }
        if(count==k)
        return n- count;
        if(count-1==k)
        return count;

        return 0;
    }
}