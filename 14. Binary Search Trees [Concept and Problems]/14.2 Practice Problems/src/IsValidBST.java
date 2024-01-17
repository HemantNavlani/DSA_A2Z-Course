public class IsValidBST {
//    https://www.codingninjas.com/studio/problems/check-bst_5975?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/validate-binary-search-tree/

    //isme hame traversal hi karna but ek range leke chalni hai agar uss range me hai number then badiya nhi toh false
    //class Solution {
    //    public boolean isValidBST(TreeNode root) {
    //        return isValid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    //    }
    //    public boolean isValid(TreeNode root, long min , long max){
    //        if (root==null) return true;
    //        if (root.val<=min || root.val>= max) return false;
    //        return isValid(root.left,min,root.val) && isValid(root.right,root.val,max);
    //    }
    //}
}
