class LRUCache {
    private int max;
    ArrayList<Integer> list = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>(); 
    public LRUCache(int capacity) {
        max = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            list.remove(Integer.valueOf(key));
            list.add(key);
            return map.get(key);
        }

        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            list.remove(Integer.valueOf(key));
        }	
        else if(list.size()==max){

            int k = list.removeFirst();
            map.remove(k);
        }
        map.put(key,value);
        list.add(key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */