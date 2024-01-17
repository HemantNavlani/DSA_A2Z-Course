public class MergeTwoBSt {
    //https://www.codingninjas.com/studio/problems/merge-two-bsts_920474?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //import java.util.*;
    //public class Solution {
    //    public static List<Integer> inorder(TreeNode root){
    //        Stack<TreeNode> st = new Stack<>();
    //        List<Integer> ans = new ArrayList<>();
    //        TreeNode node = root;
    //        while (true){
    //            if (node!=null){
    //                st.push(node);
    //                node = node.left;
    //            }
    //            else{
    //                if (st.size()==0) break;
    //                TreeNode t = st.pop();
    //                ans.add(t.data);
    //                node = t.right;
    //            }
    //        }
    //        return ans;
    //    }
    //    public static List<Integer> mergeBST(TreeNode root1, TreeNode root2) {
    //        List<Integer> l1 = inorder(root1);
    //        List<Integer> l2 = inorder(root2);
    //        List<Integer> ans = new ArrayList<>();
    //        int i = 0;
    //        int j = 0;
    //        while (i<l1.size() && j<l2.size()){
    //            if (l1.get(i)<l2.get(j)){
    //                ans.add(l1.get(i));
    //                i++;
    //            }
    //            else{
    //                ans.add(l2.get(j));
    //                j++;
    //            }
    //        }
    //        while(i<l1.size()){
    //            ans.add(l1.get(i));
    //            i++;
    //        }
    //        while(j<l2.size()){
    //            ans.add(l2.get(j));
    //            j++;
    //        }
    //        return ans;
    //    }
    //}
}
