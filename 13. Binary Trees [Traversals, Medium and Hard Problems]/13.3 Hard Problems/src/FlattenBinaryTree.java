public class FlattenBinaryTree {
    //https://www.codingninjas.com/studio/problems/flatten-binary-tree-to-linked-list_1112615?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //https://leetcode.com/problems/flatten-binary-tree-to-linked-list/submissions/1145168672/

    //phle recursion se easy hai just read the code

    //class Solution {
    //    public void flatten(TreeNode root) {
    //        TreeNode[] prev = new TreeNode[1];
    //        prev[0]=null;
    //        solver(root,prev);
    //    }
    //    public void solver(TreeNode root,TreeNode[] prev){
    //        if (root==null) return;
    //        solver(root.right,prev);
    //        solver(root.left,prev);
    //        root.right = prev[0];
    //        root.left = null;
    //        prev[0] = root;
    //    }
    //}


    //fir iterative using stack


    //class Solution {
    //    public void flatten(TreeNode root) {
    //        if (root==null) return;
    //        Stack<TreeNode> st = new Stack<>();
    //        st.push(root);
    //        while (st.size()!=0){
    //            TreeNode curr = st.pop();
    //            if (curr.right!=null) st.push(curr.right);
    //            if (curr.left!=null) st.push(curr.left);
    //            if(st.size()!=0) curr.right = st.peek();
    //            curr.left = null;
    //        }
    //    }
    //}


    //and then morris traversal without extra space

    //class Solution {
    //    public void flatten(TreeNode root) {
    //          TreeNode curr = root;
    //          while (curr!=null){
    //              if (curr.left!=null){
    //                  TreeNode prev = curr.left;
    //                  while (prev.right!=null) prev=prev.right;
    //                  prev.right = curr.right;
    //                  curr.right = curr.left;
    //                  curr.left = null;
    //              }
    //              curr = curr.right;
    //          }
    //    }
    //}
}
