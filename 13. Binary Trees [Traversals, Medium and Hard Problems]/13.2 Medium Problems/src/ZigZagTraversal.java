public class ZigZagTraversal {
    //https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
    //class Solution {
    //    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    //        List<List<Integer>> ans = new ArrayList<>();
    //        if (root == null) return ans;
    //        Queue<TreeNode> q = new LinkedList<>();
    //        q.add(root);
    //        boolean flag = true;
    //        while (q.size()!=0){
    //            List<Integer> l = new ArrayList<>();
    //            int size  = q.size();
    //            for (int i = 0;i<size;i++){
    //                TreeNode temp = q.peek();
    //                if (temp.right!=null) q.add(temp.right);
    //                if (temp.left!=null) q.add(temp.left);
    //                l.add(q.remove().val);
    //            }
    //            flag = !flag;
    //            if (!flag) Collections.reverse(l);
    //            ans.add(l);
    //        }
    //        return ans;
    //    }
    //}
}
