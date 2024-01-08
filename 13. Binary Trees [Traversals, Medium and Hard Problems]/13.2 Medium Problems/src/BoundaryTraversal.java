public class BoundaryTraversal {
    //https://www.codingninjas.com/studio/problems/boundary-traversal-of-binary-tree_790725?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //isme phle left tree karke lao fir leave nodes and right side reverse me
    //import java.util.*;
    //
    //public class Solution {
    //    static boolean isLeaf(TreeNode root){
    //        if (root.left == null && root.right==null) return true;
    //        return false;
    //    }
    //    static void addLeft(TreeNode root,List<Integer> ans){
    //        TreeNode curr = root.left;
    //        while (curr!=null){
    //            if (!isLeaf(curr)) ans.add(curr.data);
    //            if (curr.left!=null) curr=curr.left;
    //            else curr = curr.right;
    //        }
    //    }
    //    static void addLeave(TreeNode root,List<Integer> ans){
    //        if (isLeaf(root)){
    //            ans.add(root.data);
    //            return;
    //        }
    //        if (root.left!=null) addLeave(root.left,ans);
    //        if (root.right!=null) addLeave(root.right,ans);
    //    }
    //    static void addRight(TreeNode root,List<Integer> ans){
    //        TreeNode curr = root.right;
    //        List<Integer> res = new ArrayList<>();
    //        while (curr!=null){
    //            if (!isLeaf(curr)) res.add(curr.data);
    //            if (curr.right!=null) curr = curr.right;
    //            else curr = curr.left;
    //        }
    //        for (int i = res.size()-1;i>=0;i--){
    //            ans.add(res.get(i));
    //        }
    //    }
    //    public static List<Integer> traverseBoundary(TreeNode root){
    //        List<Integer> ans = new ArrayList<>();
    //        if (root == null) return ans;
    //        if (!isLeaf(root)) ans.add(root.data);
    //        addLeft(root,ans);
    //        addLeave(root,ans);
    //        addRight(root,ans);
    //        return ans;
    //    }
    //}
}
