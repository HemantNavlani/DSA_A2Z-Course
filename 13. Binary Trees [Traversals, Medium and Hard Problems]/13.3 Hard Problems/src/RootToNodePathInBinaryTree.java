public class RootToNodePathInBinaryTree {
    //https://www.codingninjas.com/studio/problems/all-root-to-leaf-paths-in-binary-tree._983599?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
    //question easy tha confusion ho gaya tha todha
    //import java.util.*;
    //public class Solution {
    //    public static List<String> allRootToLeaf(BinaryTreeNode root) {
    //        List<String> ans = new ArrayList<>();
    //        solver(root,"",ans);
    //        return ans;
    //    }
    //    static void solver(BinaryTreeNode root,String str, List<String> ans){
    //        if (root == null) return;
    //        str = str + root.data+" ";
    //        solver(root.left,str,ans);
    //        if (root.left == null && root.right==null){
    //            ans.add(str);
    //            str = str.substring(0,str.length()-1);
    //            return;
    //        }
    //        solver(root.right,str,ans);
    //    }
    //}
}
