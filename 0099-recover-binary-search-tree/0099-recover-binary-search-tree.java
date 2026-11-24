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
    int val1;
    int val2;
    List<Integer> li =  new ArrayList<>();
    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        li.add(root.val);
        inorder(root.right);
    }
    void inorderT(TreeNode root){
        if(root==null) return;
        
        inorderT(root.left);
        if(root.val==val1) root.val= val2;
        else if(root.val==val2) root.val= val1;
        inorderT(root.right);
    }
    public void recoverTree(TreeNode root) {
        inorder(root);
        List<Integer> s =  new ArrayList<>(li);
        Collections.sort(s);
        int len = s.size();
        for(int i=0;i<len;i++){
            if(li.get(i)!=s.get(i)){
                val1=li.get(i);
                val2=s.get(i);
                break;
            }
        }
        inorderT(root);
        return; 
    }
}