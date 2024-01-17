public class TwoSumInBST {
    //isme ek toh simple method hai ki inorder lao tree ka and two pointer se two sum question solve karlo and ye todha badiya method hai

    //next and before vale iterators bana liye hai and uske use se two pointer vala tareeka kar liya hai
    //public class BSTIterator {
    //    private Stack<TreeNode> st = new Stack<>();
    //    private boolean reverse;//true -> next false before
    //
    //    public BSTIterator(TreeNode root,boolean reverse) {
    //        this.reverse  = reverse;
    //        pushAll(root);
    //    }
    //
    //    public int next() {
    //        TreeNode temp = st.pop();
    //        if (reverse) pushAll(temp.right);
    //        else pushAll(temp.left);
    //        return temp.val;
    //    }
    //    public boolean hasNext() {
    //        return !st.isEmpty();
    //    }
    //    private void pushAll(TreeNode node){
    //        while(node!=null){
    //            st.push(node);
    //            if (reverse) node=node.left;
    //            else node = node.right;
    //        }
    //    }
    //}
    //class Solution {
    //    public boolean findTarget(TreeNode root, int k) {
    //        if (root==null) return false;
    //        BSTIterator next = new BSTIterator(root,true);
    //        BSTIterator before = new BSTIterator(root,false);
    //        int i = next.next();
    //        int j = before.next();
    //        while (i<j){
    //            if (i+j==k) return true;
    //            else if (i+j<k) i=next.next();
    //            else j=before.next();
    //        }
    //        return false;
    //    }
    //}
}
