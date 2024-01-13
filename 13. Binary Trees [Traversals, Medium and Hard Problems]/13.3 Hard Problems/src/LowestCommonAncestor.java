public class LowestCommonAncestor {
    //https://www.codingninjas.com/studio/problems/lca-of-binary-tree_920541?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

    //bht simple hai agar left me mil gaya hai toh usse return karo nhi toh null return karo  aise hi karte karte jab agar dono side se mil gaya hoga toh vohi answer aa jayega
    //class Solution {
    //    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //        if (root == null || root == p || root == q) return root;
    //        TreeNode left = lowestCommonAncestor(root.left,p,q);
    //        TreeNode right = lowestCommonAncestor(root.right,p,q);
    //        if (left == null) return right;
    //        else if (right == null) return left;
    //        else return root;
    //    }
    //}
}
