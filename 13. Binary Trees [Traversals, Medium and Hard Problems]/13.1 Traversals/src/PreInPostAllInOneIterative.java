public class PreInPostAllInOneIterative {
    //https://www.codingninjas.com/studio/problems/tree-traversals_981269?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //import java.util.*;
    //public class Solution {
    //    static class Pair {
    //        TreeNode node;
    //        int cnt;
    //        Pair(TreeNode node,int cnt){
    //            this.node= node;
    //            this.cnt = cnt;
    //        }
    //    }
    //    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
    //        List<List<Integer>> ans = new ArrayList<>();
    //        if (root == null) return ans;
    //        List<Integer> pre = new ArrayList<>();
    //        List<Integer> in = new ArrayList<>();
    //        List<Integer> post = new ArrayList<>();
    //
    //        Stack <Pair> st = new Stack<>();
    //        st.push(new Pair (root,1));
    //        while (st.size()!=0){
    //            Pair p = st.pop();
    //            if (p.cnt == 1){
    //                pre.add(p.node.data);
    //                p.cnt++;
    //                st.push(p);
    //
    //                if (p.node.left!=null){
    //                    st.push(new Pair(p.node.left,1));
    //                }
    //            }
    //            else if (p.cnt == 2){
    //                in.add(p.node.data);
    //                p.cnt++;
    //                st.push(p);
    //
    //                if (p.node.right!=null){
    //                    st.push(new Pair(p.node.right,1));
    //                }
    //            }
    //            else {
    //                post.add(p.node.data);
    //            }
    //        }
    //        ans.add(in);
    //        ans.add(pre);
    //        ans.add(post);
    //        return ans;
    //    }
    //}

}
