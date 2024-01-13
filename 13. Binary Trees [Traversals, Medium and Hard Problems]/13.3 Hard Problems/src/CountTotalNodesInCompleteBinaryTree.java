public class CountTotalNodesInCompleteBinaryTree {

    //hai toh easy ham simple recursion se bhi kar skte the but we need time less than O(N)
    // so here we have did if the tree is fully filled then apply the formula 2^n-1 else use recursion
    //read the code you will get it
    //class Solution {
    //    public int countNodes(TreeNode root) {
    //        if (root == null) return 0;
    //        int lh = getLeftHeight(root);
    //        int rh = getRightHeight(root);
    //        if (lh == rh) return (1<<lh)-1;
    //        return countNodes(root.left) + countNodes(root.right)+1;
    //    }
    //    public int getLeftHeight(TreeNode root){
    //        TreeNode temp = root;
    //        int cnt = 0;
    //        while (temp!=null){
    //            cnt++;
    //            temp=temp.left;
    //        }
    //        return cnt;
    //    }
    //    public int getRightHeight(TreeNode root){
    //        TreeNode temp = root;
    //        int cnt = 0;
    //        while (temp!=null){
    //            cnt++;
    //            temp=temp.right;
    //        }
    //        return cnt;
    //    }
    //}
}
