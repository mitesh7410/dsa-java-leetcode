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
     List<Integer> result = new ArrayList<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(k==0){
            result.add(target.val);
            return result;
        }
        depthfirstSearch1(root,target,k);
        return result;
    }
    public int depthfirstSearch1(TreeNode root, TreeNode target, int k){
        if(root==null)  return 0;
        if(root==target){
             depthfirstSearch2(root.left,target,1,k);
             depthfirstSearch2(root.right,target,1,k);
             return 1;
        }
        int left = depthfirstSearch1(root.left,target,k);
        if(left>0){
            if(left==k)
            result.add(root.val);
            depthfirstSearch2(root.right,target,left+1,k);
            return left+1;
        }
        int right = depthfirstSearch1(root.right,target,k);
            if(right>0){
            if(right==k)
            result.add(root.val);
            depthfirstSearch2(root.left,target,right+1,k);
            return right+1;
        }
        return 0;
    }
    public void depthfirstSearch2(TreeNode root, TreeNode target, int count, int k){
        if(root==null) return;
        if(count==k){
            result.add(root.val);
            return;
        } 
        depthfirstSearch2(root.left,target,count+1,k);
        depthfirstSearch2(root.right,target,count+1,k);


    }
}