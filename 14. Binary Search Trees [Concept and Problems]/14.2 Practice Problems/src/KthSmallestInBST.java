import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class KthSmallestInBST {
    //https://www.codingninjas.com/studio/problems/kth-smallest-node-in-bst_920441?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/kth-smallest-element-in-a-bst/

    //isme bas inorder lagao count ke sath morris lagao it has least Time complexity
    //class Solution {
    //    public int kthSmallest(TreeNode root, int k) {
    //        int cnt = 0;
    //        TreeNode curr = root;
    //        while (curr!=null){
    //            if (curr.left==null){
    //                if (++cnt==k) return curr.val;
    //                curr=curr.right;
    //            }
    //            else{
    //                TreeNode prev = curr.left;
    //                while (prev.right!=null && prev.right!=curr) prev = prev.right;
    //                if (prev.right == null) {
    //                    prev.right = curr;
    //                    curr=curr.left;
    //                }
    //                if (prev.right== curr){
    //                    prev.right = null;
    //                    if (++cnt==k) return curr.val;
    //                    curr = curr.right;
    //                }
    //            }
    //        }
    //        return -1;
    //    }
    //}
}
