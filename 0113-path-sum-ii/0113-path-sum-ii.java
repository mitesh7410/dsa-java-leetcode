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
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetsum) {
         sum(root,targetsum,0,new ArrayList<>());
         return res;
    }
    private void sum(TreeNode root, int targetsum , int curr, List<Integer> temp){
        if(root==null)  return;
        curr+=root.val;
        temp.add(root.val);
        if(root.left==null&&root.right==null&&curr==targetsum)
        res.add(new ArrayList<>(temp));
        
        sum(root.left,targetsum,curr,temp);
        sum(root.right,targetsum,curr,temp);
        temp.remove(temp.size()-1);
    }
}