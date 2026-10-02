class Solution {
    public int myAtoi(String s) {
        int n = s.length(), i = 0, sign = 1;

        while (i < n && s.charAt(i) == ' ') i++;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        int ans = 0;
        while (i < n) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') break;
            int d = c - '0';

            if (ans > (Integer.MAX_VALUE - d) / 10)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            ans = ans * 10 + d;
            i++;
        }
        return ans * sign;
    }
}