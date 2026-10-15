import java.util.*;

class Solution {
    static final long MOD = 1_000_000_007L;
    long[] s, q, t;   // s = sum of d, q = sum of d^2, t = tag on node (never pushed down)

    void upd(int o, int l, int r, int ql, int qr) {
        if (ql <= l && r <= qr) {
            long ln = r - l + 1;
            q[o] += 2 * s[o] + ln;   // (x+1)^2 = x^2 + 2x + 1
            s[o] += ln;
            t[o]++;
            return;
        }
        int m = (l + r) >>> 1;
        if (ql <= m) upd(2 * o, l, m, ql, qr);
        if (qr > m) upd(2 * o + 1, m + 1, r, ql, qr);
        long cs = s[2 * o] + s[2 * o + 1];
        long cq = q[2 * o] + q[2 * o + 1];
        long c = t[o], ln = r - l + 1;
        s[o] = cs + c * ln;
        q[o] = cq + 2 * c * cs + c * c * ln;
    }

    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        s = new long[4 * n];
        q = new long[4 * n];
        t = new long[4 * n];

        Map<Integer, Integer> last = new HashMap<>();
        long ans = 0;
        for (int j = 0; j < n; j++) {
            int x = nums.get(j);
            int p = last.getOrDefault(x, -1);
            upd(1, 0, n - 1, p + 1, j);
            ans = (ans + q[1]) % MOD;
            last.put(x, j);
        }
        return (int) ans;
    }
}