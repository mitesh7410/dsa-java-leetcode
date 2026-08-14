class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        List<List<int[]>> graph = new ArrayList<>();
        for(int i=0;i<n;i++)graph.add(new ArrayList<>());
        for(int[] edge:  edges){
            int u = edge[0],v=edge[1],w=edge[2];
            graph.get(u).add(new int[]{v,w});
            graph.get(v).add(new int[]{u,w});
        }
        int bestcity = -1;
        int mincount = Integer.MAX_VALUE;

        for(int src = 0; src < n ; src++){
            int[] dist = dijikstra(graph,src,n);

            int count = 0;
            for(int i = 0; i<n; i++ ){
                if(i!=src&&dist[i]<=distanceThreshold) count++;
            }

            if(count<=mincount){
                mincount = count;
                bestcity = src;
            }
        } 

        return bestcity;
    }
    private int[] dijikstra(List<List<int[]>> graph, int src, int n){
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;
         
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{src,0});
        boolean visited[] = new boolean[n];

        while(!pq.isEmpty()){
            int curr[] = pq.poll();
            int u = curr[0];

            if(visited[u]) continue;
            visited[u]=true;
            for(int[] neighbour: graph.get(u)){
                int v = neighbour[0], w=neighbour[1];
                if(!visited[v] && dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                    pq.offer(new int[]{v,dist[v]});
                }
            }
        } 
        return dist;
    }
}