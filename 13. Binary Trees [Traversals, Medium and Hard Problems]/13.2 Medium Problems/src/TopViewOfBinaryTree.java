public class TopViewOfBinaryTree {
//    https://www.codingninjas.com/studio/problems/top-view-of-binary-tree_799401?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
    //pichle jaise hai but usse easy hi hai

    //import java.util.*;
    //
    //public class Solution {
    //    static class Pair{
    //        TreeNode node;
    //        int x;
    //        Pair(TreeNode node,int x){
    //            this.node = node;
    //            this.x = x;
    //        }
    //    }
    //    public static List<Integer> getTopView(TreeNode root) {
    //        List<Integer> ans = new ArrayList<Integer>();
    //        if (root == null) return ans;
    //        TreeMap<Integer,Integer> mp = new TreeMap<>();
    //        Queue<Pair> q = new LinkedList<Pair>();
    //        q.add(new Pair (root,0));
    //        while (q.size()>0){
    //            Pair p = q.remove();
    //            TreeNode temp = p.node;
    //            int x = p.x;
    //            if (!mp.containsKey(x)) mp.put(x,temp.data);
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
