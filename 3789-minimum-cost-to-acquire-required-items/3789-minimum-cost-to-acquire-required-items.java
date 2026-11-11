class Solution {
    public long minimumCost(int c1, int c2, int costBoth, int n1, int n2) {
        long need1=n1,need2=n2,cost1=c1,cost2=c2;
        long min = Math.min(need1, need2);
        long max = Math.max(need1, need2);

        long alone = need1*cost1+need2*cost2;
        long both = min*costBoth+(need1-min)*cost1+(need2-min)*cost2;
        long accmax = max*costBoth;

        return Math.min(alone,Math.min(both,accmax));  
    }
}