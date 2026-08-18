class Solution {
    public int[] findOrder(int numCourse, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourse];
        for(int i=0;i<numCourse;i++) adj.add(new ArrayList<>());
        for(int [] pair : prerequisites){
            int course = pair[0];
            int pre = pair[1];
            adj.get(pre).add(course);
            indegree[course]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourse;i++){
            if(indegree[i]==0)
            q.offer(i);
        }
        int[] order = new int[numCourse];
        int completed = 0;
        while(!q.isEmpty()){
           int num = q.poll();
          order[completed++]=num;
           for(int next: adj.get(num)){
            indegree[next]--;
            if(indegree[next]==0)q.offer(next);
           }
        }
        return completed ==numCourse? order : new int[0];
    }
}