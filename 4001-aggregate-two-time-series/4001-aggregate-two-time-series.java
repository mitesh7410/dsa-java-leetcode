class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
           List<List<Integer>> ans = new ArrayList<>();
           int len1 = series1.length,len2= series2.length;
           int left = 0;
           int right =0;
           
            while(left<len1||right<len2){
                int temp;
                if(left==len1)
                temp=series2[right][0];
                else if(right==len2)
                temp=series1[left][0];
                else
                temp = Math.min(series1[left][0],series2[right][0]);

                int l1=0;
                if(left<len1) l1=series1[left][1];
                int r1=0;
                if(right<len2) r1=series2[right][1];

                ans.add(Arrays.asList(temp,l1+r1));

                if(left<len1&&temp==series1[left][0])
                left++;
                if(right<len2&&temp==series2[right][0])
                right++;
                
            }
           return ans;

    } 
}