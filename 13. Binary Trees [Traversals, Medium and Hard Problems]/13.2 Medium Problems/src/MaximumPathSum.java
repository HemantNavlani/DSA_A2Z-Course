public class MaximumPathSum {
    //https://leetcode.com/problems/binary-tree-maximum-path-sum/
    //https://www.codingninjas.com/studio/problems/maximum-sum-path-of-a-binary-tree._1214968?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //isme bhi kara toh height vale concept ka hi use hai bas todha root.val bhi jod diya hai isme just read the code once
    //class Solution {
    //    public int maxPathSum(TreeNode root) {
    //        int [] max = new int [1];
    //        max[0] = Integer.MIN_VALUE;
    //        solver(root,max);
    //        return max[0];
    //    }
    //    int solver(TreeNode root , int[] max){
    //        if (root==null) return 0;
    //        int left = Math.max(0,solver(root.left,max));
    //        int right = Math.max(0,solver(root.right,max));
    //        max[0] = Math.max(max[0],left+right+root.val);
    //        return root.val + Math.max(left,right);
    //    }
    //}
}
