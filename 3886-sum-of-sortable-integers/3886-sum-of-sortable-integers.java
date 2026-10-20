class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i=1;i*i<=n;i++){
              if(n%i==0){
                set.add(i);
                set.add(n/i);
              }
        }
        int ans=0;
        int[] sort = nums.clone();
        Arrays.sort(sort);
        for(int i:set){
            boolean flag = true;
             for (int s = 0; s < n; s += i) {  
                if (!compare(sort, nums, s, i)) {
                    flag = false;
                    break;
                }
            }
            if(flag)ans+=i;

        }
        return ans;
    }
    private boolean compare(int[]arr1, int[]arr2, int s, int k){
         int idx = 0;
         for (int i = 0; i < k - 1; i++) {
            if (arr2[s + i] >arr2[s + i + 1]) {
                 idx = i + 1;
                 break;
           }
          }
          for (int i = 0; i < k; i++) {
                if (arr1[s + i] != arr2[s + idx]) return false;
               idx = (idx + 1) % k;
           }
        return true;

    }
}