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
     TreeNode BST(TreeNode root,int val){
        if(root==null){
           return new TreeNode(val);
        }
        if(root.val>val) root.left = BST(root.left,val);
        else root.right = BST(root.right,val);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
            TreeNode root = null;
        for(int i:preorder){
            root = BST(root,i);
        }
        return root;
    }
}