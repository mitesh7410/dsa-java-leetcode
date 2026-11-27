class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n = rain.length;
        String[] str = new String[n];
        int A=0, B=0;
        for(int i=0;i<n;i++){
            if(rain[i]==0){
                str[i]="None";
                continue;
            }
            boolean need= (i+1<n&&rain[i+1]==1);
            if(need&& A<=B){
                str[i]="Alice";
                A++;
            }
            else{
                str[i]="Bob";
                B++;
            }
        }

        return str;
    }
}