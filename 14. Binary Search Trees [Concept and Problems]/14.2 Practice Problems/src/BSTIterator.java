public class BSTIterator {
//    https://leetcode.com/problems/binary-search-tree-iterator/
    //simple hai ya toh inorder kahi store karlo fir uske hissab se karlo lekin usme space jyada laga
    //aise karlo with the help of stack, stack me left vale store karate jao
    //class BSTIterator {
    //    private Stack<TreeNode> st=new Stack<>();
    //    public BSTIterator(TreeNode root) {
    //        pushAllLeft(root);
    //    }
    //
    //    public int next() {
    //        TreeNode temp = st.pop();
    //        pushAllLeft(temp.right);
    //        return temp.val;
    //    }
    //
    //    public boolean hasNext() {
    //        return !st.isEmpty();
    //    }
    //    private void pushAllLeft(TreeNode node){
    //        while(node!=null){
    //            st.push(node);
    //            node=node.left;
    //        }
    //    }
    //}
    //
}
