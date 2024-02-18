public class BellmanFordAlgorithm {
    //https://www.codingninjas.com/studio/problems/bellman-ford_2041977?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://www.geeksforgeeks.org/problems/distance-from-the-source-bellman-ford-algorithm/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=distance-from-the-source-bellman-ford-algorithm

    //dijkstra fails on negative values and it goes in infinite loop if it has a negative cycle
    //so bellman ford algorithm helps to detect negative cycles
    //It only applies on Directed Graph -> If you want to apply on undirected graph than convert it into directed graph
    //represent the undirected graph as directed graph (by 2 edges having same weights pointing to each other)

    //edges can be in any order
//    Relax all the edges N-1 times sequentially
//    Relax meaning -> if (dist[u] + wt < dist[v]) dist[v] = dist[u] + wt

//    Why only N-1
//    Since in a graph of N nodes, in worst case, you will take N-1 edges to reach from the first to the last,
//<dssilo,1,0）
//thereby we iterate for N-1 iterations.
//M
//Try drawing a graph which takes more than N-1 edges for any path, it is not



//    How to detect negative cycles --> if we do N th iterations the value will still reduce which will let us know about negative cycles
//    On N th iteration , the relaxation will be done and if the distance array gets updated then it has negative cycles

//    E * V is the time complexity
    //class Solution {
    //    static int[] bellman_ford(int n, ArrayList<ArrayList<Integer>> edges, int src) {
    //        int [] distance = new int[n];
    //        for (int i =0;i<n;i++) distance[i] = (int) 1e8 ;
    //        distance[src] = 0;
    //        for (int i=0;i<n-1;i++){
    //            for (int j=0;j<edges.size();j++){
    //                int u = edges.get(j).get(0);
    //                int v = edges.get(j).get(1);
    //                int w = edges.get(j).get(2);
    //                if (distance[u]!=1e8 && distance[u]+w<distance[v]) distance[v] = distance[u]+w;
    //            }
    //        }
    //         for (int j=0;j<edges.size();j++){
    //                int u = edges.get(j).get(0);
    //                int v = edges.get(j).get(1);
    //                int w = edges.get(j).get(2);
    //                if (distance[u]!=1e8 && distance[u]+w<distance[v]) return new int[]{-1};
    //            }
    //        return distance;
    //    }
    //}
}
