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
    private Map<Integer,Integer> map = new HashMap<>();
    private int len;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
          len = inorder.length-1;
          for(int i=0;i<inorder.length;i++){
               map.put(inorder[i],i);
          }
          return build(postorder,0,len);
    }
    private TreeNode build(int[] postorder, int start, int last){
        if(start>last) return null;
        int val = postorder[len--];
        TreeNode Node = new TreeNode(val);
        int mid = map.get(val);
        Node.right = build(postorder,mid+1,last);
        Node.left = build(postorder,start,mid-1);

        return Node;
    }
}