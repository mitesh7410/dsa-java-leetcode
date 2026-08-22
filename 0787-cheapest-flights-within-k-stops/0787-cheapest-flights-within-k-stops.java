class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
          List<List<int[]>> adj = new ArrayList<>();
          int[] dist = new int[n];
          for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            dist[i]=Integer.MAX_VALUE;
          }
          dist[src]=0;
          for(int[] arr: flights){
            adj.get(arr[0]).add(new int[]{arr[1],arr[2]});
          }
          Queue<int[]> q = new LinkedList<>();
          q.offer(new int[]{0,src,0});
          while(!q.isEmpty()){
            int[] arr = q.poll();
            int stop = arr[0];
            int u = arr[1];
            int cost = arr[2];
            if(stop>k)continue;
            for(int[] v : adj.get(u)){
                int next = v[0];
                int c = v[1];
              if((dist[next]>cost+c)){
                 dist[next]=cost+c;
                 q.offer(new int[]{stop+1,next,cost+c});
              }   
            }
          }
        return dist[dst]==Integer.MAX_VALUE?-1:dist[dst];            
    }
}