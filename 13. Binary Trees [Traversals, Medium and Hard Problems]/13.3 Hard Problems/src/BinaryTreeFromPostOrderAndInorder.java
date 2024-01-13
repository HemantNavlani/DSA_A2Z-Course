public class BinaryTreeFromPostOrderAndInorder {
    //https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

    //https://www.codingninjas.com/studio/problems/construct-binary-tree-from-inorder-and-postorder-traversal_1266106?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM


    //class Solution {
    //    TreeNode solver(int[] inorder,int inStart,int inEnd,int[]postorder,int poStart,int poEnd,HashMap<Integer,Integer>mp){
    //        if (inStart>inEnd || poStart<poEnd) return null;
    //
    //        TreeNode root = new TreeNode (postorder[poStart]);
    //
    //        int idx = mp.get(root.val);
    //        int numsRight = inEnd-idx;
    //
    //        root.left = solver(inorder,inStart,idx-1,postorder,poStart-numsRight-1,poEnd,mp);
    //        root.right = solver(inorder,idx+1,inEnd,postorder,poStart-1,poStart-numsRight,mp);
    //        return root;
    //    }
    //    public TreeNode buildTree(int[] inorder, int[] postorder) {
    //        HashMap<Integer,Integer> mp = new HashMap<>();
    //        for (int i = 0;i<inorder.length;i++) mp.put(inorder[i],i);
    //        return solver(inorder,0,inorder.length-1,postorder,postorder.length-1,0,mp);
    //    }
    //}
}
