public class TopologicalSortBFSKahnAlgorithm {
    //https://www.codingninjas.com/studio/problems/topological-sorting_973003?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //see about Topological sort from DFS approach notes

//    we will use an indegree array -> indegree is the number of incoming edges at a node of a graph

    //since it is bfs we will obviously need a queue

    //step 1 insert all nodes with indegree==0 in the queue
    // step 2 take them out of  the queue and add them into the answer list and just reduce the indegree of its adjacent nodes and if indegree of someone becomes zero push it into the stack


    //import java.util.*;
    //public class Solution {
    //    public static List<Integer> topologicalSort(int[][] edges, int e, int v) {
    //        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    //        for (int i=0;i<v;i++) adj.add(new ArrayList<>());
    //        for(int i=0;i<e;i++) adj.get(edges[i][0]).add(edges[i][1]);
    //        int[] indegree = new int[v];
    //
    //        for (int i = 0;i<v;i++){
    //            for (int it:adj.get(i)) indegree[it]++;
    //        }
    //
    //       Queue<Integer> q = new LinkedList<>();
    //
    //       for (int i = 0;i<v;i++){
    //           if (indegree[i]==0) q.add(i);
    //       }
    //       List<Integer> ans = new ArrayList<>();
    //       while (q.size()!=0){
    //           int node = q.remove();
    //           ans.add(node);
    //           for(int it : adj.get(node)){
    //               indegree[it]--;
    //               if (indegree[it]==0) q.add(it);
    //           }
    //       }
    //       return ans;
    //    }
    //}
}
