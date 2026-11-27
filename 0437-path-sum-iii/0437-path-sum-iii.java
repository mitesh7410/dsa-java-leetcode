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
    private int sum = 0;
    void inorder(TreeNode root, int targetSum, long Sum){
        if(root==null) return;
        Sum+=root.val;
        if(Sum==targetSum){
            sum++;
        }
        inorder(root.left, targetSum, Sum);
        inorder(root.right, targetSum, Sum);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        Stack<TreeNode> q = new Stack<>();
        q.push(root);
        while(!q.isEmpty()){
            TreeNode temp = q.pop();
            inorder(temp, targetSum, 0);
            if(temp.left!=null)q.push(temp.left);
            if(temp.right!=null)q.push(temp.right);
        }
        return sum;
    }
}