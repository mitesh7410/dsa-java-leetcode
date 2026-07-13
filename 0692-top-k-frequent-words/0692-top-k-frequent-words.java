class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b)->{
            if(!a.getValue().equals(b.getValue()))
              return a.getValue()-b.getValue();
            else 
            return b.getKey().compareTo(a.getKey());
        });
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            pq.offer(entry);
            if(pq.size()>k)
            pq.poll();
        }
        List<String> ans = new ArrayList<>(k);
        while(!pq.isEmpty()){
            ans.add(pq.poll().getKey());
        }
         Collections.reverse(ans);
         return ans;
    }
}