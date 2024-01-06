public class IterativePostorder2Stacks {
    //https://leetcode.com/problems/binary-tree-postorder-traversal/
    //https://www.codingninjas.com/studio/problems/postorder-traversal_2035933?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
    //    public List<Integer> postorderTraversal(TreeNode root) {
    //        List<Integer> ans = new ArrayList<>();
    //        if(root == null) return ans;
    //        Stack<TreeNode> st1 = new Stack<>();
    //        Stack<TreeNode> st2 = new Stack<>();
    //        st1.add(root);
    //        while (st1.size()!=0){
    //            TreeNode temp = st1.pop();
    //            st2.push(temp);
    //            if (temp.left!=null) st1.push(temp.left);
    //            if (temp.right!=null) st1.push(temp.right);
    //        }
    //        while (st2.size()!=0){
    //            ans.add(st2.pop().val);
    //        }
    //        return ans;
    //    }
    //}
}
