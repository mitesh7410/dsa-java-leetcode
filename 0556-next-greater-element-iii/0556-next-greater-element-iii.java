class Solution {
    public int nextGreaterElement(int n) {
        List<Integer> li = new LinkedList<>();
        int num = n;
        while(num>0){
        int rem = num%10;
          li.addFirst(rem);
          num/=10;
        }
        int len = li.size()-2;
        while(len>=0&&li.get(len)>=li.get(len+1))
        len--;
        if(len==-1) return -1;
        for(int i=li.size()-1;i>len&&len>=0;i--){
            if(li.get(i)>li.get(len)){
             swap(li,len,i);
             break;
            }
        }
          return reverse(li,len+1,li.size()-1);
      
    }
    private static void swap(List<Integer> li,int i, int j){
        int temp = li.get(i);
        li.set(i,li.get(j));
        li.set(j,temp);
    }
    private static int reverse(List<Integer> li,int i, int j){
        while(i<j){
            swap(li,i,j);
            i++;
            j--;
        }
        int a =0;
        long num=0;
        while(a<li.size()){
           num = num*10 + li.get(a);
           a++;
        }
        return num>Integer.MAX_VALUE? -1:(int)num;
    }
}