class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int n=s.length();
        int flrow = numRows+(numRows-2);
        StringBuilder str = new StringBuilder() ;
        for(int i=0;i<n;){
            str.append(s.charAt(i));
            i+=flrow;
        }
        int row = 1;
        int diff = 2;
        while(row<=numRows-2){
            boolean f = true;
            int i = row;
            int j = flrow-diff;
            int k = diff;
            while(i<n){
                if(f){
                    str.append(s.charAt(i));
                    i=i+j;
                    f=false;   
                }else{
                    str.append(s.charAt(i));
                    i+=k;
                    f=true;
                }
            }

            row++;
            diff+=2;
        }
        for(int i=row;i<n;){
            str.append(s.charAt(i));
            i+=flrow;
        }
        return str.toString();
    }
}