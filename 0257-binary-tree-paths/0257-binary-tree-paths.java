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
    private List<String> ans = new ArrayList<>();;
    public void dfs(TreeNode root, String str){
        if(root.left==null&&root.right==null){
            str =str + Integer.toString(root.val);
            ans.add(str);
            return;
        }
        str = str+Integer.toString(root.val)+"->";
        if(root.left!=null)dfs(root.left,str);
        if(root.right!=null)dfs(root.right,str);
    }
    public List<String> binaryTreePaths(TreeNode root) {
         dfs(root,"");
         return ans;
        
    }
}