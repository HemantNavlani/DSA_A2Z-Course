public class RightViewOfBinaryTree {
    //https://leetcode.com/problems/binary-tree-right-side-view/
    //isme level order laga ke kar rahe hai
    //class Solution {
    //    public List<Integer> rightSideView(TreeNode root) {
    //        List<Integer> ans = new ArrayList<>();
    //        helper(root,0,ans);
    //        return ans;
    //    }
    //    void helper(TreeNode root, int level, List<Integer> ans){
    //        if (root == null) return;
    //        if (level == ans.size()) ans.add(root.val);
    //        helper(root.right,level+1,ans);
    //        helper(root.left,level+1,ans);
    //    }
    //}
}
