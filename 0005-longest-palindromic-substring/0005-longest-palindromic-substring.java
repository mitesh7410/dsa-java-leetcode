class Solution {
    public String longestPalindrome(String s) {
        // Transform s into t with separators
        // "bab" → "^#b#a#b#$"
        StringBuilder sb = new StringBuilder("^#");
        for (char c : s.toCharArray()) {
            sb.append(c);
            sb.append('#');
        }
        sb.append('$');
        String t = sb.toString();
        int n = t.length();

        int[] p = new int[n];  // p[i] = radius of palindrome at i
        int center = 0, right = 0;

        for (int i = 1; i < n - 1; i++) {
            int mirror = 2 * center - i;

            if (i < right)
                p[i] = Math.min(right - i, p[mirror]);

            // expand around i
            while (t.charAt(i + p[i] + 1) == t.charAt(i - p[i] - 1))
                p[i]++;

            // update center and right boundary
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }

        // find max in p
        int maxLen = 0, centerIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }

        int start = (centerIndex - maxLen - 1) / 2;
        return s.substring(start, start + maxLen);
    }
}