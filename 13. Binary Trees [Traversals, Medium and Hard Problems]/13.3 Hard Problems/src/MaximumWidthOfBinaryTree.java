public class MaximumWidthOfBinaryTree {
    //https://codingninjas.com/studio/problems/maximum-width-in-binary-tree_763671?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/maximum-width-of-binary-tree/

    //isme level order traversal lagaya hai aur har ek node ki index karte gaye hai fir first and last ko minus kardiya and we got our answer
    // ans isme jo min valii cheez kari hai vo isliye hai kyunki indexing me ham 2*i+1 vagarah kar rahe hai jiski vajah se agar tree ki length jyada hui toh ye integer overflow kar skta hai

    //class Solution {
    //    class Pair{
    //        TreeNode node;
    //        int idx;
    //        Pair (TreeNode node , int idx){
    //            this.node = node;
    //            this.idx = idx;
    //        }
    //    }
    //    public int widthOfBinaryTree(TreeNode root) {
    //        if (root == null) return 0;
    //        int ans = 0;
    //        Queue<Pair> q = new LinkedList<>();
    //        q.add(new Pair(root,0));
    //        while (q.size()!=0){
    //            int first = 0;
    //            int last = 0;
    //            int size = q.size();
    //            int min = q.peek().idx;
    //            for (int i=0;i<size;i++){
    //                int currIdx = q.peek().idx - min;
    //                TreeNode temp = q.peek().node;
    //                q.remove();
    //                if (i==0) first = currIdx;
    //                if (i==size-1) last = currIdx;
    //                if (temp.left!=null) q.add(new Pair(temp.left,currIdx*2+1));
    //                if (temp.right!=null) q.add(new Pair (temp.right,currIdx*2+2));
    //            }
    //            ans  = Math.max(ans,last-first+1);
    //        }
    //        return ans;
    //    }
    //}

}
