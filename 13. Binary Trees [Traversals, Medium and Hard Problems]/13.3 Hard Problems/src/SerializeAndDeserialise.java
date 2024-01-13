public class SerializeAndDeserialise {

    //easy hai read out the code and understand this serialise matlab tree di hai usse string banao
    //deserialise me hame string se tree return karna hai
    //https://www.codingninjas.com/studio/problems/serialize-and-deserialize-binary-tree_920328?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//    https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
    //public class Codec {
    //    // Encodes a tree to a single string.
    //    public String serialize(TreeNode root) {
    //        if (root == null) return "";
    //        Queue<TreeNode> q = new LinkedList<>();
    //        q.add(root);
    //        String str = "";
    //        while (!q.isEmpty()) {
    //            TreeNode temp = q.remove();
    //            if (temp==null){
    //                str+="n ";
    //                continue;
    //            }
    //            str += temp.val + " ";
    //            q.add(temp.left);
    //            q.add(temp.right);
    //        }
    //        return str;
    //    }
    //
    //    // Decodes your encoded data to tree.
    //    public TreeNode deserialize(String data) {
    //        if (data=="") return null;
    //        Queue<TreeNode> q = new LinkedList<>();
    //        String[] values = data.split(" ");
    //        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
    //        q.add(root);
    //        for (int i = 1;i<values.length;i++){
    //            TreeNode parent = q.remove();
    //            if (!values[i].equals("n")){
    //                parent.left = new TreeNode(Integer.parseInt(values[i]));
    //                q.add(parent.left);
    //            }
    //            if (!values[++i].equals("n")){
    //                parent.right = new TreeNode(Integer.parseInt(values[i]));
    //                q.add(parent.right);
    //            }
    //        }
    //        return root;
    //    }
    //}
}
