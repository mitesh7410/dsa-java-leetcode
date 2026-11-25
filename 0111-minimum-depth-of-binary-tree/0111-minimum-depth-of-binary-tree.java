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
    int inorder(TreeNode  root){
        if(root==null) return 0;
        int left = inorder(root.left);
        int right = inorder(root.right);
        return 1+Math.min(left==0?right:left, right==0?left:right);
    }
    public int minDepth(TreeNode root) {
        return inorder(root);
    }
}