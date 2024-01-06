public class IterativeInorder {
    //https://www.codingninjas.com/studio/problems/inorder-traversal_3839605?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/binary-tree-inorder-traversal/
    //class Solution {
    //    public List<Integer> inorderTraversal(TreeNode root) {
    //        List<Integer> ans = new ArrayList<>();
    //        Stack<TreeNode> st = new Stack<>();
    //        TreeNode node = root;
    //        while (true) {
    //            if (node != null) {
    //                st.push(node);
    //                node = node.left;
    //            } else {
    //                if (st.size() == 0)
    //                    break;
    //                TreeNode temp = st.pop();
    //                ans.add(temp.val);
    //                node = temp.right;
    //            }
    //        }
    //        return ans;
    //    }
    //}
}
