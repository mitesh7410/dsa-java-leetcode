/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
        TreeNode ans;
    boolean flag = true;

    int dfs(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return 0;

        int left = dfs(root.left,p,q);
        int right = dfs(root.right,p,q);
        int a =left + right;
        if(root==p||root==q)
        a++;
        if(a==2&&flag){
            ans=root;
            flag = false;
        }

        return a;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         dfs(root,p,q);
         return ans;
    }
}