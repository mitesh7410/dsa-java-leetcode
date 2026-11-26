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
    private int Max = Integer.MIN_VALUE;
    int inorder(TreeNode root){
        if(root==null) return 0;
        int left = inorder(root.left);
        int right = inorder(root.right);
        Max = Math.max(root.val+left+right, Max);
        return Math.max(Math.max(left,right)+root.val, 0);
    }
    public int maxPathSum(TreeNode root) {
       inorder(root);
       return Max;
    }
}