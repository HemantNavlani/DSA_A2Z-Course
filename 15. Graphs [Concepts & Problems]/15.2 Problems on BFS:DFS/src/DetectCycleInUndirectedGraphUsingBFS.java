public class DetectCycleInUndirectedGraphUsingBFS {
//https://www.codingninjas.com/studio/problems/detect-cycle-in-an-undirected-graph-_758967?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //isme hamne normal bfs lagaya fir dekhte gaye ki iska parent kaun sirf vo hi visited ho skta hai agar hamne travel kiya aur koi node pe phle se visited mila toh matlab ye hai ki vaha phle hi koi aur aaya hoga that is why cycle thi

    //TC (N+2E) + O(N)
//    SC => O(N) +O(N)
    //import java.util.*;
    //public class Solution {
    //    static class Pair{
    //        int node;
    //        int parent;
    //        Pair(int node, int parent){
    //            this.node = node;
    //            this.parent = parent;
    //        }
    //    }
    //    static class Graph {
    //         boolean detect(int V, List<List<Integer>> adj,int[] visited,int src) {
    //            Queue<Pair> q = new LinkedList<>();
    //            visited[src]=1;
    //            q.add(new Pair(src,-1));
    //            while (q.size()!=0){
    //                Pair p = q.remove();
    //                int node = p.node;
    //                int parent = p.parent;
    //                for (int i : adj.get(node)){
    //                    if (i==node) return true;
    //                    if (visited[i]!=1){
    //                        q.add(new Pair(i,node));
    //                        visited[i]=1;
    //                    }
    //                    else if (parent!=i) return true;
    //                }
    //            }
    //            return false;
    //        }
    //        boolean detectCycle(int V, List<List<Integer>> adj) {
    //            int[] visited = new int[V];
    //           for (int i =0;i<V;i++){
    //               if (visited[i]==0) if (detect(V,adj,visited,i)) return true;
    //           }
    //           return false;
    //        }
    //    }
    //}
}
