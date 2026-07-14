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
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null&&root.right==null)return true;
        if(root.left!=null&&root.right==null||root.right!=null&&root.left==null)return false;
        
        TreeNode temp = invert(root.left);
        return check(temp,root.right);    
    }
    private TreeNode invert(TreeNode temp){
      if(temp==null) return null;
        TreeNode t  =temp.left;
        temp.left=temp.right;
        temp.right=t;
        invert(temp.left);
        invert(temp.right);
      
        return  temp;
    }
    private boolean check(TreeNode  l, TreeNode r){
        if(l==null&&r==null)return true;
        if(l==null||r==null||l.val!=r.val) return false;
        return check(l.left,r.left)&&check(l.right,r.right);
    }
}