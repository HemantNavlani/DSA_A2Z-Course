public class RecoverBST {
    //https://leetcode.com/problems/recover-binary-search-tree/

    //https://www.codingninjas.com/studio/problems/fix-bst_873137?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //isme simple methode toh ye hai ki phle tum inorder store karo ek list me fir list me ek pointer ke thru iterate karte raho aur sath me hi tree me inorder se iterate karo jaha value galat dikh rahi hai usko shi karte jao
    // better way ye hai ki inorder ke samay hi dekho ki value kaha galat hai ek prev banao agar adjacent me galti nhi hai toh do galatiya milengi nhi toh ek hi milegi aise karte jaao anmd read the code to get it
    //class Solution {
    //    TreeNode prev;
    //    TreeNode first;
    //    TreeNode mid;
    //    TreeNode last;
    //    public void inorder(TreeNode root){
    //        if (root==null) return;
    //        inorder(root.left);
    //        if (prev!=null && (root.val<prev.val)){
    //            if (first==null){
    //                first  = prev;
    //                mid = root;
    //            }
    //            else last = root;
    //        }
    //        prev = root;
    //        inorder(root.right);
    //    }
    //    public void recoverTree(TreeNode root) {
    //        first = mid = last = null;
    //        prev = new TreeNode(Integer.MIN_VALUE);
    //        inorder(root);
    //        if (first!=null && last!=null){
    //            int t = first.val;
    //            first.val = last.val;
    //            last.val = t;
    //        }
    //        else if(first!=null && mid!=null) {
    //             int t = first.val;
    //            first.val = mid.val;
    //            mid.val = t;
    //        }
    //    }
    //}
}
