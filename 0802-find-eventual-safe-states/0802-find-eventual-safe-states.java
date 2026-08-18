class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        int[] indegree = new int[n];
        for(int i=0;i<n;i++){
             list.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j : graph[i]){
                list.get(j).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n ; i ++){
            if(indegree[i]==0){
            q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int num =q.poll();
            for(int i : list.get(num)){
                indegree[i]--;
                if(indegree[i]==0){
                 q.offer(i);

                }
            }
        } 
        for(int i=0;i<n;i++){
            if(indegree[i]==0) ans.add(i);
        }
        return ans;
    }
}