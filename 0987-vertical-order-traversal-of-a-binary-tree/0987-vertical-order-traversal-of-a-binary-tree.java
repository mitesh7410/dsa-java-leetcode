/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Map<Integer,List<int[]>> map = new HashMap<>();
        dfs(root,0,0,map);
             List<Integer> cols = new ArrayList<>(map.keySet());
             Collections.sort(cols);

        for (int col : cols) {
            List<int[]> entries = map.get(col);
            entries.sort((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
    
             List<Integer> colList = new ArrayList<>();
              for (int[] pair : entries) {
                  colList.add(pair[1]); 
              }
             result.add(colList);
         }

     return result;

    }
    private void dfs(TreeNode node, int row, int col, Map<Integer, List<int[]>> map) {
    if (node == null) return;
    map.computeIfAbsent(col, k -> new ArrayList<>()).add(new int[]{row, node.val});
    dfs(node.left, row + 1, col - 1, map);
    dfs(node.right, row + 1, col + 1, map);
}
}