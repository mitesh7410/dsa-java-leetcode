class Solution {
    public String frequencySort(String s) {
         int[] freq = new int[256];
         for(char ch : s.toCharArray())freq[ch]++;
         PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->freq[b]-freq[a]);
         for(int i=0;i<256;i++){
            if(freq[i]>0) pq.offer(i);
         }
         StringBuilder sb = new StringBuilder();
         while(!pq.isEmpty()){
            int ch = pq.poll();
            for(int i=0;i<freq[ch];i++)
                sb.append((char)ch);
         }
         return sb.toString();
    }
}