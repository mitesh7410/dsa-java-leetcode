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
    private int preindex=0;
    private Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
           for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
           }
           return build(preorder,0,inorder.length-1);
    }
    private TreeNode build(int[] preorder, int start, int last){
         if(start>last) return null;
         int val = preorder[preindex++];
         TreeNode Node = new TreeNode(val);

         int mid = map.get(val);
         Node.left = build(preorder,start,mid-1);
         Node.right = build(preorder,mid+1,last);
         return Node;    
    }
}