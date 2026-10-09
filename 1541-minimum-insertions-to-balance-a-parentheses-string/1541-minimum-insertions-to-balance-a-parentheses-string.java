class Solution {
    public int minInsertions(String s) {
        int open = 0;
        int close = 0;
        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
                if (i + 1 == n || s.charAt(i + 1) == '(') {  
                    int pairs = close / 2;
                    if (close % 2 != 0) {  
                        ans++;
                        pairs++;
                    }
                    if (open >= pairs) {
                        open -= pairs;
                    } else {
                        ans += pairs - open;   
                        open = 0;
                    }
                    close = 0;
                }
            }
        }

        ans += 2 * open;  
        return ans;
    }
}