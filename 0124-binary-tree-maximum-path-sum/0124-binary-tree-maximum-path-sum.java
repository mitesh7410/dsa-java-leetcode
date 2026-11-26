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
        if(root.left==null&&root.right==null){
            Max = Math.max(root.val, Max);
            return root.val;
        }
        int val = root.val;
        int left = root.left!=null?inorder(root.left):0;
        int right = root.right!=null?inorder(root.right):0;
        left = Math.max(0, left);
        right = Math.max(0, right);
        Max = Math.max(val,Math.max(val+left+right, Max));
        return Math.max(left+val,right+val);
    }
    public int maxPathSum(TreeNode root) {
       inorder(root);
       return Max;
    }
}