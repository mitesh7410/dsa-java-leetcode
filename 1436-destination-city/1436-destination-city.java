class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for(List<String> path: paths){
               set.add(path.get(0));  
        }
        for(List<String> dist : paths){
            if(!set.contains(dist.get(1))){
                return dist.get(1);
            }
        }
        return "";
    }
}