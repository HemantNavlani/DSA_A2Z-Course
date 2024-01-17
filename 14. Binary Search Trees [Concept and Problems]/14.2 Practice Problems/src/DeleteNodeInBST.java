public class DeleteNodeInBST {
    //https://www.codingninjas.com/studio/problems/delete-node-in-bst_920381?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
//    https://leetcode.com/problems/delete-node-in-a-bst/
    //class Solution {
    //    public TreeNode deleteNode(TreeNode root, int key) {
    //        if (root == null) return null;
    //        if (root.val == key) return helper(root);
    //        TreeNode temp = root;
    //        while (temp != null) {
    //            if (temp.val > key) {
    //                if (temp.left != null && temp.left.val == key) {
    //                    temp.left = helper(temp.left);
    //                    break;
    //                } else {
    //                    temp = temp.left;
    //                }
    //            }
    //            else {
    //                if (temp.right!=null && temp.right.val == key){
    //                    temp.right = helper(temp.right);
    //                    break;
    //                }
    //                else{
    //                    temp=temp.right;
    //                }
    //            }
    //        }
    //        return root;
    //    }
    //    public TreeNode helper(TreeNode node){
    //        if (node.left==null) return node.right;
    //        else if (node.right == null) return node.left;
    //        TreeNode rightChild = node.right;
    //        TreeNode lr = lastRight(node.left);
    //        lr.right = rightChild;
    //        return node.left;
    //    }
    //    public TreeNode lastRight(TreeNode node){
    //        if (node.right == null) return node;
    //        return lastRight(node.right);
    //    }
    //}
}

