/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return " ";
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node==null){
                sb.append("n ");
                continue;
            }
            sb.append(node.val+" ");
            q.offer(node.left);
            q.offer(node.right);
        }
        return sb.toString();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals(" ")) return null;
        String[] str = data.split(" ");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(str[0]));
        q.offer(root);
        for(int i=1;i<str.length;i++){
            TreeNode parent = q.poll();
            if(!str[i].equals("n")){
                TreeNode l = new TreeNode(Integer.parseInt(str[i]));
                parent.left = l;
                q.add(l);
            }
            if(!str[++i].equals("n")){
                TreeNode r = new TreeNode(Integer.parseInt(str[i]));
                parent.right = r;
                q.add(r);
            }
        }
      return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));