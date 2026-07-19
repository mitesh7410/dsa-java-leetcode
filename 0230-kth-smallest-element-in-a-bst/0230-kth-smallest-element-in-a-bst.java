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
    private int ans = 0;
    private  int count = 0;
    void small(TreeNode root){
        if(root.left!=null) small(root.left);
        count--;
        if(count==0){
        ans = root.val;
        return;
        }
        if(root.right!=null)small(root.right);
             
    }
    public int kthSmallest(TreeNode root, int k) {
         count = k;
         small(root);
         return ans;
        
    }
}