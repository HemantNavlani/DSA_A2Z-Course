import java.util.Stack;

public class IterativePostOrderSingleStack {
    //https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/1138329475/
    //https://www.codingninjas.com/studio/problems/postorder-traversal_2035933?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //class Solution {
    //    public List<Integer> postorderTraversal(TreeNode root) {
    //        List<Integer> ans = new ArrayList<Integer>();
    //        Stack<TreeNode> st = new Stack<>();
    //        TreeNode curr = root;
    //        while (curr!=null || st.size()!=0){
    //            if (curr!=null){
    //                st.push(curr);
    //                curr = curr.left;
    //            }
    //            else{
    //                TreeNode temp = st.peek().right;
    //                if (temp==null){
    //                    temp=st.pop();
    //                    ans.add(temp.val);
    //                    while (st.size()!=0 && temp == st.peek().right){
    //                        temp = st.pop();
    //                        ans.add(temp.val);
    //                    }
    //                }
    //                else{
    //                    curr = temp;
    //                }
    //            }
    //        }
    //        return ans;
    //    }

    //}
}
