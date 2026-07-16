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
    public int widthOfBinaryTree(TreeNode root) {
         int max = Integer.MIN_VALUE;
         Queue<TreeNode> node = new LinkedList<>();
         Queue<Integer> nodeidx = new LinkedList<>();
         node.offer(root);
         nodeidx.offer(0);
         while(!node.isEmpty()){
            int size = node.size();
            int first = 0, last = 0;
            for(int i=0;i<size;i++){
                TreeNode curr = node.poll();
                int idx = nodeidx.poll();
                if(i==0) first = idx;
                if(i==size-1) last =idx;
                if(curr.left!=null){
                     node.offer(curr.left);
                     nodeidx.offer(2*idx);
                }
                if(curr.right!=null){
                    node.offer(curr.right);
                    nodeidx.offer(2*idx+1);
                }   
            }
            max = Math.max(max,last-first+1);
         }

       return max;
    }
}