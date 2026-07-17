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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root==null) return result;
        Queue<TreeNode> st = new LinkedList<>();
        st.offer(root);
        while(!st.isEmpty()){
            int size = st.size();
            List<Integer> li= new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp = st.poll();
                li.add(temp.val);
                if(temp.left!=null)st.offer(temp.left);
                if(temp.right!=null)st.offer(temp.right);
            }
            result.addFirst(li);
        }
        return result;
    }
}