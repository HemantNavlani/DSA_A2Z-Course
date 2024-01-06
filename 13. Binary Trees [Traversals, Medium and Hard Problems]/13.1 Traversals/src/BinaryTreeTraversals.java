public class BinaryTreeTraversals {
    //https://www.codingninjas.com/studio/problems/tree-traversal_981269?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    ///*********************************************************
    //
    // Following is the TreeNode structure:
    //
    // class TreeNode {
    //     int data;
    //     TreeNode left;
    //     TreeNode right;
    //     TreeNode() {
    //         this.data = 0;
    //         this.left = null;
    //         this.right = null;
    //     }
    //     TreeNode(int data) {
    //         this.data = data;
    //         this.left = null;
    //         this.right = null;
    //     }
    //     TreeNode(int data, TreeNode left, TreeNode right) {
    //         this.data = data;
    //         this.left = left;
    //         this.right = right;
    //     }
    // };
    // ********************************************************/
    //
    //import java.util.*;
    //public class Solution {
    //    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
    //        List<List<Integer>> ans = new ArrayList<>();
    //        List<Integer> pre = new ArrayList<>();
    //        List<Integer> in = new ArrayList<>();
    //        List<Integer> post = new ArrayList<>();
    //        helper(root,pre,in,post);
    //        ans.add(in);
    //        ans.add(pre);
    //        ans.add(post);
    //        return ans;
    //    }
    //
    //    public static void helper(TreeNode root,List<Integer> pre,List<Integer> in,List<Integer> post) {
    //        if(root==null) return;
    //        pre.add(root.data);
    //        helper(root.left,pre,in,post);
    //        in.add(root.data);
    //        helper(root.right,pre,in,post);
    //        post.add(root.data);
    //    }
    //}
}
