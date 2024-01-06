public class IterativePreOrder {
    //https://www.codingninjas.com/studio/problems/preorder-binary-tree_5948?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/1137610469/
    //class Solution {
    //    public List<Integer> preorderTraversal(TreeNode root) {
    //        List<Integer> ans = new ArrayList<>();
    //        if (root == null) return ans;
    //        Stack<TreeNode> st = new Stack<>();
    //        st.push(root);
    //        while (st.size()!=0){
    //            TreeNode temp = st.pop();
    //            ans.add(temp.val);
    //            if (temp.right!=null) st.push(temp.right);
    //            if (temp.left!=null) st.push(temp.left);
    //        }
    //        return ans;
    //    }
    //}
}
