class Pair{
    String word;
    int n;
    Pair(String word, int n){
        this.word = word;
        this.n = n;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
         if (!set.contains(endWord)) return 0;
        Queue<Pair> q = new LinkedList<>();
        set.remove(beginWord);
        q.offer(new Pair(beginWord,1));

        while(!q.isEmpty()){
            String w = q.peek().word;
            int step = q.peek().n;
            q.poll();
            if(w.equals(endWord)) return step;
            for(int i=0;i<w.length();i++){
                char[] c = w.toCharArray();
                for(char ch='a';ch<='z';ch++){
                 c[i]=ch;
                 String st = new String(c);
                 if(set.contains(st)){
                    set.remove(st);
                    q.offer(new Pair(st,step+1));
                 }
                }
            }
        }
        return 0;
    }
}