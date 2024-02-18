public class ShortestPathInUndirectedGraphWithUnitWeight {

    //kuch nhi easy hi hai isme bhi hamne simple bfs hi lagaya hai aur sath me distance array rakha for shortest distance baki read the code once to understand
    //import java.util.*;
    //public class Solution {
    //    static class Pair{
    //        int node;
    //        int distance;
    //        Pair(int node, int distance){
    //            this.node = node;
    //            this.distance = distance;
    //        }
    //    }
    //    public static int[] shortestPath(int n, int [][]edges, int src) {
    //        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    //        for (int i = 0;i<n;i++) adj.add(new ArrayList<>());
    //        int m = edges.length;
    //        for (int i = 0;i<m;i++){
    //            int u = edges[i][0];
    //            int v = edges[i][1];
    //            adj.get(u).add(v);
    //            adj.get(v).add(u);
    //        }
    //        int[] distance = new int[n];
    //        for (int i = 0;i<n;i++) distance[i] = Integer.MAX_VALUE;
    //        distance[src] = 0;
    //        Queue<Integer> q = new LinkedList<>();
    //        q.add(src);
    //        while (q.size()!=0){
    //            int node = q.remove();
    //            for (int it : adj.get(node)){
    //                if (distance[node]+1<distance[it]){
    //                    distance[it] = distance[node]+1;
    //                    q.add(it);
    //                }
    //            }
    //        }
    //
    //        for (int i = 0;i<distance.length;i++){
    //            if (distance[i]==Integer.MAX_VALUE) distance[i]=-1;
    //        }
    //        return distance;
    //    }
    //}
}
