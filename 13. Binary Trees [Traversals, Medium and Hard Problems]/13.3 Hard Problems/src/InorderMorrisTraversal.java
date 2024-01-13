public class InorderMorrisTraversal {
    //https://www.codingninjas.com/studio/problems/inorder-traversal_3839605?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //https://leetcode.com/problems/binary-tree-inorder-traversal/
    //class Solution {

    //read the code isme last right most vale ko root se attach karte jate jai
    //    public List<Integer> preorderTraversal(TreeNode root) {
    //        List<Integer> ans = new ArrayList<>();
    //        TreeNode curr = root;
    //        while (curr!=null){
    //            if (curr.left==null){
    //                ans.add(curr.val);
    //                curr = curr.right;
    //            }
    //            else{
    //            TreeNode prev = curr.left;
    //            while (prev.right!=null && prev.right!=curr){
    //                prev=prev.right;
    //            }
    //            if (prev.right==null){
    //                prev.right = curr;
    //                curr=curr.left;
    //            }
    //            else{
    //                prev.right = null;
    //                ans.add(curr.val);
    //                curr=curr.right;
    //            }
    //            }
    //        }
    //        return ans;
    //    }
    //}
}
