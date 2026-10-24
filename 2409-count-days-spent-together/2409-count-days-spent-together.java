class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int prefix[] = new int[13];  
        for(int i=0;i<12;i++){
            prefix[i+1]=prefix[i]+months[i];
        }
        int aAd = days(arriveAlice, prefix);
        int lAd = days(leaveAlice, prefix);
        int aBd = days(arriveBob, prefix);
        int lBd = days(leaveBob, prefix);
        return Math.max(0,Math.min(lAd,lBd)-Math.max(aAd,aBd)+1);
    }
    private int days(String day, int[] prefix){
        int month = Integer.parseInt(day.substring(0,2));
        int date = Integer.parseInt(day.substring(3));
        return prefix[month-1]+date;
    }
}