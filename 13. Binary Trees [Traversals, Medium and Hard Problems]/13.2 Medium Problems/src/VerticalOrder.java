public class VerticalOrder {
    //https://www.codingninjas.com/studio/problems/vertical-order-traversal_3622711?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/description/

    //easy hi hai bas todha dhyan se karo ek bar read karlo code verticals level and values ko store kiya fir uske according kam kiy hai
    //class Solution {
    //    public class Tuple{
    //        TreeNode node;
    //        int row;
    //        int col;
    //        Tuple(TreeNode node, int row, int col){
    //            this.node = node;
    //            this.row = row;//vertical
    //            this.col = col;//level
    //        }
    //    }
    //    public List<List<Integer>> verticalTraversal(TreeNode root) {
    //        //vertical, level, value of nodes at that level
    //        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> mp = new TreeMap<>();
    //        Queue<Tuple> q = new LinkedList<>();
    //        q.add(new Tuple(root,0,0));
    //        while (q.size()>0){
    //            Tuple t = q.remove();
    //            TreeNode temp = t.node;
    //            int x = t.row;
    //            int y = t.col;
    //
    //            if (!mp.containsKey(x)){
    //                mp.put(x,new TreeMap<>());
    //            }
    //            if (!mp.get(x).containsKey(y)){
    //                mp.get(x).put(y,new PriorityQueue<>());
    //            }
    //            mp.get(x).get(y).add(temp.val);
    //            if (temp.left!=null){
    //                q.add(new Tuple(temp.left, x-1,y+1));
    //            }
    //            if (temp.right!=null){
    //                q.add(new Tuple (temp.right, x+1,y+1));
    //            }
    //        }
    //        List<List<Integer>> ans = new ArrayList<>();
    //        for (TreeMap<Integer,PriorityQueue<Integer>> a : mp.values()){
    //            List<Integer> l = new ArrayList<>();
    //            for (PriorityQueue<Integer> b : a.values()){
    //                while (b.size()!=0){
    //                    l.add(b.remove());
    //                }
    //            }
    //            ans.add(l);
    //        }
    //        return ans;
    //    }
    //}
}
