public class LargestBSTInBinaryTree {
    //isme aisa kiya hai ki postorder me traverse kiya hai aur check karte hue gaye hai ki hai valid ki nhi aur size bhi sath rakhte hue chale hai
    //read the code and do dry to understand better
    //public class Solution {
    //   public static class NodeValue{
    //        int maxNode,minNode,maxSize;
    //        NodeValue(int maxNode,int minNode,int maxSize){
    //            this.maxSize = maxSize;
    //            this.maxNode = maxNode;
    //            this.minNode = minNode;
    //        }
    //    }
    //    public static int largestBST(TreeNode root) {
    //        return solver(root).maxSize;
    //    }
    //    public static NodeValue solver(TreeNode root){
    //        if (root==null) return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,0);
    //        NodeValue left = solver(root.left);
    //        NodeValue right = solver(root.right);
    //        if (left.maxNode<root.data && right.minNode>root.data){
    //            return new NodeValue(Math.max(root.data,right.maxNode),Math.min(root.data,left.minNode),left.maxSize+right.maxSize+1);
    //        }
    //        return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,Math.max(left.maxSize,right.maxSize));
    //    }
    //}
}
