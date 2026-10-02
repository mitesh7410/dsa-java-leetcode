class Solution {
    public int myAtoi(String str) {
        int n = str.length();
        if(n==0){
            return 0;
        }
        Map<Character,Integer> map = new HashMap<>();
        map.put('0',0);
        map.put('1',1);
        map.put('2',2);
        map.put('3',3);
        map.put('4',4);
        map.put('5',5);
        map.put('6',6);
        map.put('7',7);
        map.put('8',8);
        map.put('9',9);

        int i = 0;
        boolean sub  = false;
        //check for first char
         while(i<n&&str.charAt(i)==' '){
            i++;
        }
        if(i<n&&str.charAt(i)=='+'){
            i++;
        }
       else if(i<n&&str.charAt(i)=='-'){
            sub=true;
            i++;
        }
        long ans = 0;
       
        while(i<n&&map.containsKey(str.charAt(i))){
            ans=ans*10+map.get(str.charAt(i));
            i++;
            if(ans>Integer.MAX_VALUE) break;
        }
       if(sub) ans = -ans;
       if(ans > Integer.MAX_VALUE) ans = Integer.MAX_VALUE;
       if(ans < Integer.MIN_VALUE) ans = Integer.MIN_VALUE;

    return (int) ans;

    }
}