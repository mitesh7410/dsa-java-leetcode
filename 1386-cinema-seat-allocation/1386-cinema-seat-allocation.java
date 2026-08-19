class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
      Map<Integer,Set<Integer>> map = new HashMap<>();
      for(int[] seat : reservedSeats){
          int row = seat[0];
          int col = seat[1];
          map.putIfAbsent(row,new HashSet<>());
          map.get(row).add(col);
      }

      int family = (n-map.size())*2;

      for(Set<Integer>res: map.values()){
        boolean left = !res.contains(2)&&!res.contains(3)&&!res.contains(4)&&!res.contains(5);
        boolean middle = !res.contains(4)&&!res.contains(5)&&!res.contains(6)&&!res.contains(7);
        boolean right = !res.contains(6)&&!res.contains(7)&&!res.contains(8)&&!res.contains(9);

        if(left && right){
            family+=2;
        }
        else if(left||right||middle){
            family+=1;
        }
      }
       return family;    
    }
}