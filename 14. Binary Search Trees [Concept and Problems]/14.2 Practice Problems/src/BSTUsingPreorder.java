public class BSTUsingPreorder {

    //https://www.codingninjas.com/studio/problems/construct-bst-from-preorder-traversal_2689307?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=DISCUSS
    //https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/

    //phle toh ye hi ki insert karte jao aur repeatedly check karte hue jao using recursion ki kaha insert hona hai aur vahi pe insert kardo
    //isme aur bhi methods ek toh basic ye hi hai ki inorder le aoo by sorting the array and jaise inorder and preorder se binary tree banaya tha vo karlo and ye hai recursion se and ek upper bound rakhte hai aur uski help se karte hai


    //class Solution {
    //    public TreeNode bstFromPreorder(int[] preorder) {
    //        return bst(preorder,new int[1],Integer.MAX_VALUE);
    //    }
    //    public TreeNode bst(int[] preorder,int[] i,int bound){
    //        if (i[0]>=preorder.length || preorder[i[0]]>bound) return null;
    //        TreeNode root = new TreeNode (preorder[i[0]++]);
    //        root.left = bst(preorder,i,root.val);
    //        root.right = bst(preorder,i,bound);
    //        return root;
    //    }
    //
    //}
}
