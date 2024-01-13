public class PrintAllNodesAtAdistanceOfK {
    //step 1 make the parent hashmap ready by using level order traversal, this will help us to travel upwards also in the tree
    //step 2 Traverse in each direction and increment the distance and when distance ==k break and print the element present in the queue

    //https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
    //https://www.codingninjas.com/studio/problems/print-nodes-at-distance-k-from-a-given-node_842560?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //class Solution {
    //    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    //        HashMap<TreeNode,TreeNode> mp = new HashMap<>();
    //        markParent(root,mp);
    //        HashSet<TreeNode> visited = new HashSet<>();
    //        Queue<TreeNode> q = new LinkedList<>();
    //        q.add(target);
    //        visited.add(target);
    //        int dist = 0;
    //        while (q.size()!=0){
    //            int size = q.size();
    //            if (dist == k) break;
    //            dist++;
    //            for (int i = 0;i<size;i++){
    //                TreeNode temp = q.remove();
    //                if (temp.left!=null && !visited.contains(temp.left)){
    //                    q.add(temp.left);
    //                    visited.add(temp.left);
    //                }
    //                if (temp.right!=null && !visited.contains(temp.right)){
    //                    q.add(temp.right);
    //                    visited.add(temp.right);
    //                }
    //                if (mp.get(temp)!=null && !visited.contains(mp.get(temp))){
    //                    q.add(mp.get(temp));
    //                    visited.add(mp.get(temp));
    //                }
    //            }
    //        }
    //
    //        List<Integer> ans = new ArrayList<>();
    //        while (q.size()!=0){
    //            ans.add(q.remove().val);
    //        }
    //        return ans;
    //    }
    //    void markParent(TreeNode root, HashMap<TreeNode,TreeNode> mp ){
    //        Queue<TreeNode> q = new LinkedList<>();
    //        q.add(root);
    //        while (q.size()!=0){
    //            TreeNode temp = q.remove();
    //            if (temp.left!=null){
    //                mp.put(temp.left,temp);
    //                q.add(temp.left);
    //            }
    //            if (temp.right!=null){
    //                mp.put(temp.right,temp);
    //                q.add(temp.right);
    //            }
    //        }
    //    }
    //}
}
