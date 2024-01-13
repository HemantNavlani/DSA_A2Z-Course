public class BinaryTreeFromInorderAndPreOrder {
    //https://www.codingninjas.com/studio/problems/construct-binary-tree-from-inorder-and-preorder-traversal_920539?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/

    //yaha hamne recursion use kiya hai read the code you will get it
    //class Solution {
    //    public TreeNode solver (int []preorder,int[]inorder,int preStart, int preEnd, int inStart, int inEnd,HashMap<Integer,Integer> mp){
    //        if (preStart>preEnd || inStart>inEnd) return null;
    //
    //        TreeNode root = new TreeNode(preorder[preStart]);
    //
    //        int idx = mp.get(preorder[preStart]);
    //        int numsleft = idx - inStart;
    //
    //        root.left = solver(preorder,inorder,preStart+1,preStart+numsleft,inStart,idx-1,mp);
    //        root.right = solver(preorder,inorder,preStart+numsleft+1,preEnd,idx+1,inEnd,mp);
    //
    //        return root;
    //    }
    //    public TreeNode buildTree(int[] preorder, int[] inorder) {
    //        HashMap<Integer,Integer> mp = new HashMap<>();
    //        for(int i = 0;i<inorder.length;i++){
    //            mp.put(inorder[i],i);
    //        }
    //        return solver(preorder,inorder,0,preorder.length-1,0,inorder.length-1,mp);
    //    }
    //}
}
