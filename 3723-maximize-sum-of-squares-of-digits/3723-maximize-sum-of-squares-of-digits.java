class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) return "";
        char[] a = new char[num];
        Arrays.fill(a, '0');
        int n = sum / 9;
        Arrays.fill(a, 0, n, '9');
        if (n < num) a[n] = (char) ('0' + sum % 9);
        return new String(a);
    }
}