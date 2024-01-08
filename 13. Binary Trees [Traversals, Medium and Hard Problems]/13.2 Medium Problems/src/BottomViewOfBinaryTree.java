public class BottomViewOfBinaryTree {
    //https://www.codingninjas.com/studio/problems/bottom-view-of-binary-tree_893110?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //top view kla same code bas ab map me har bar add karo top view sirf tab karte the jab map mme item na ho
    //import java.util.*;
    //
    //public class Solution {
    //    static class Pair{
    //        TreeNode node;
    //        int x;
    //        Pair(TreeNode node, int x){
    //            this.node = node;
    //            this.x = x;
    //        }
    //    }
    //    public static List<Integer> bottomView(TreeNode root) {
    //        List<Integer> ans = new ArrayList<>();
    //        if(root==null) return ans;
    //        TreeMap<Integer,Integer> mp = new TreeMap<>();
    //        Queue<Pair> q = new LinkedList<>();
    //        q.add(new Pair(root,0));
    //        while (q.size()>0){
    //            Pair p = q.remove();
    //            TreeNode temp = p.node;
    //            int x = p.x;
    //            mp.put(x,temp.val);
    //            if (temp.left!=null) q.add(new Pair(temp.left,x-1));
    //            if (temp.right!=null) q.add(new Pair(temp.right,x+1));
    //        }
    //        for (int a : mp.values()){
    //            ans.add(a);
    //        }
    //        return ans;
    //    }
    //}

}
