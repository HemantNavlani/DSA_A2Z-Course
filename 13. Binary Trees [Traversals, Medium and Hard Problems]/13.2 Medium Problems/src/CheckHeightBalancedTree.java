public class CheckHeightBalancedTree {
    //https://leetcode.com/problems/balanced-binary-tree/
    //https://www.codingninjas.com/studio/problems/is-height-balanced-binary-tree_975497?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //ye maine khud kiya but isme TC O(N^2) hai isse badiya me karna hoga O(N) me
    //class Solution {
    //    public boolean isBalanced(TreeNode root) {
    //        if (root == null) return true;
    //
    //        int l = height(root.left) + 1;
    //        int r = height(root.right) + 1;
    //
    //        if (Math.abs(l-r)>1) return false;
    //        return isBalanced(root.left) && isBalanced(root.right);
    //    }
    //
    //    public int height(TreeNode root){
    //        if (root == null) return 0;
    //        return 1 + Math.max(height(root.left), height(root.right));
    //    }
    //}

    //ab ye hai O(N) solution
    //class Solution {
    //    public boolean isBalanced(TreeNode root) {
    //        return height(root) != -1;
    //    }
    //
    //    public int height(TreeNode root){
    //        if (root == null) return 0;
    //        int left = height(root.left);
    //        if (left == -1) return -1;
    //        int right = height(root.right);
    //        if (right == -1 ) return -1;
    //        if (Math.abs(left-right)>1) return -1;
    //        return 1 + Math.max(left,right);
    //    }
    //}
}
