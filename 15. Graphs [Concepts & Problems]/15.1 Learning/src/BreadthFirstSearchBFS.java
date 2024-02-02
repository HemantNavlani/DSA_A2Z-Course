public class BreadthFirstSearchBFS {

    //kuch nhi bas queue me dalte nikalte jao nikalte time usko print kardo aur uske neighbours ko queue me dal do if vo visited nhi hai toh bas visited array maintain rakhna padega iske liye sath me

    //https://www.codingninjas.com/studio/problems/bfs-in-graph_973002?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
    //import java.util.*;
    //public class Solution {
    //    public static List<Integer> bfsTraversal(int n, List<List<Integer>> adj){
    //        ArrayList<Integer> bfs = new ArrayList<>();
    //
    //        Queue<Integer> q = new LinkedList<>();
    //
    //        int[] visited = new int[n];
    //
    //        q.add(0);
    //        visited[0]=1;
    //        while(!q.isEmpty()){
    //            int front = q.remove();
    //            bfs.add(front);
    //            for (int it : adj.get(front)){
    //                if (visited[it]==0){
    //                    q.add(it);
    //                    visited[it]=1;
    //                }
    //            }
    //        }
    //        return bfs;
    //    }
    //}
}
