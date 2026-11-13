class Solution {
    public long countNonDecreasingSubarrays(int[] arr, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        long ans = 0;
        long cost = 0;
        int n = arr.length;
        int right = n-1;
       
       for(int i=right;i>=0;i--){
        int val = arr[i];
        while(!q.isEmpty()&&arr[q.peekLast()]<val){
            int  l = q.pollLast();
            int r = q.isEmpty()?right+1:q.peekLast();

            cost+=(long) (r - l) * (val - arr[l]);
        }
            
         q.addLast(i);

         while(cost>k){
            cost-=arr[q.peekFirst()]-arr[right];
            if (q.peekFirst() == right) {
                    q.pollFirst();
            }

            
            right--;
         }
         ans += right - i + 1;
       }
    
       return ans;
    }
}