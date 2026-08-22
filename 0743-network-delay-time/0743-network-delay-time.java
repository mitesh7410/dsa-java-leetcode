class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> list = new ArrayList<>();
        int dist[] = new int[n+1];
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<>());
            dist[i]=Integer.MAX_VALUE;
        }
        dist[0]=0;
        dist[k]=0;
        
        for(int[] arr: times){
            list.get(arr[0]).add(new int[]{arr[1],arr[2]});
        }
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{k,0});
        int ans = 0;
        while(!q.isEmpty()){
             int[] arr = q.poll();
             int u = arr[0];
             int w = arr[1];
             for(int[] i : list.get(u)){
                int next = i[0];
                int weight = i[1];
                if(dist[next]>w+weight){
                    dist[next]=w+weight;
                    q.offer(new int[]{next,dist[next]});
                }
             }
        }
        int max = 0;
        for(int i:dist){
            if(i==Integer.MAX_VALUE) return -1;
            max = Math.max(max,i);
        }
        return max;
    }
}