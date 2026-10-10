class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int k = k1+k2;
        int max = 0;
        for(int i=0;i<nums1.length;i++){
            max = Math.max(max, Math.abs(nums1[i]-nums2[i]));
        }
        int[] diff = new int[max+1];

       for(int i=0;i<nums1.length;i++){
        diff[Math.abs(nums1[i]-nums2[i])]++;
       }
       for(int i = max;i>0&&k>0;i--){
        if(diff[i]==0) continue;
        long t= Math.min(diff[i],k);
        diff[i]-=t;
        diff[i-1]+=t;
        k-=t;

       }
       long ans = 0;
       for(int i=0;i<diff.length;i++){
        ans+=(long)diff[i]*i*i;
       }

       return ans;
    }
}