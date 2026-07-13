class Solution {
    public String frequencySort(String s) {
         int n = s.length()+1;
         List<List<Character>> Buckets = new ArrayList<>();
         Map<Character,Integer> map = new HashMap<>();
         for(char ch: s.toCharArray())
         map.put(ch,map.getOrDefault(ch,0)+1);
         for(int i=0;i<=s.length();i++){
            Buckets.add(new ArrayList<>());
         }

         for(char c : map.keySet()){
            int freq = map.get(c);
            Buckets.get(freq).add(c);
         }
         StringBuilder sb = new StringBuilder();
         for(int i=Buckets.size()-1;i>=0;i--){
            for(char c : Buckets.get(i)){
                for(int j=0;j<i;j++){
                    sb.append(c);
                }
            }
         }
       return sb.toString();
    }
}