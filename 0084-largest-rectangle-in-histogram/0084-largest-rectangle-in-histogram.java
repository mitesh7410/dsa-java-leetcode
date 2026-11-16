class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        int max  = 0;
        for(int i=0;i<=n;i++){
            int curr = i==n?0:heights[i];
            while(!st.isEmpty()&&heights[st.peek()]>=curr){
                int length = heights[st.pop()];
                int width = st.isEmpty()?i:i-st.peek()-1;
                max  = Math.max(max,length*width);
            }
            st.push(i);
        }
        return max;
    }
}