public class LevelOrderTraversal {
    //https://leetcode.com/problems/binary-tree-level-order-traversal/
    //https://www.codingninjas.com/studio/problems/zigzag-binary-tree-traversal_920532?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
    //    public List<List<Integer>> levelOrder(TreeNode root) {
    //        List<List<Integer>> ans = new ArrayList<>();
    //        Queue<TreeNode> q = new LinkedList<>();
    //        if (root==null) return ans;
    //        q.add(root);
    //        while (q.size()!=0){
    //            int size = q.size();
    //            List<Integer> list = new ArrayList<>();
    //            for (int i = 0;i<size;i++){
    //                TreeNode temp = q.peek();
    //                if (temp.left!=null) q.add(temp.left);
    //                if (temp.right!=null) q.add(temp.right);
    //                list.add(q.remove().val);
    //            }
    //            ans.add(list);
    //        }
    //        return ans;
    //    }
    //}
}
