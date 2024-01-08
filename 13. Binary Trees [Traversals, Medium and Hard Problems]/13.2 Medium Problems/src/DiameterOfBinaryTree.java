public class DiameterOfBinaryTree {

    //ye solution hai O(N) isme bas hamne height vale function ko hi todha change karna padega

    //https://leetcode.com/problems/diameter-of-binary-tree/submissions/1138436587/
    //https://www.codingninjas.com/studio/problems/diameter-of-binary-tree_920552?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION


    //class Solution {
    //    public int diameterOfBinaryTree(TreeNode root) {
    //        int [] max = new int [1];
    //        solver(root,max);
    //        return max[0];
    //    }
    //    public int solver (TreeNode root,int[] max){
    //        if(root==null) return 0;
    //        int lh = solver(root.left,max);
    //        int rh = solver(root.right,max);
    //        max[0] = Math.max(max[0],lh+rh);
    //        return 1 + Math.max(lh,rh);
    //    }
    //}
}

