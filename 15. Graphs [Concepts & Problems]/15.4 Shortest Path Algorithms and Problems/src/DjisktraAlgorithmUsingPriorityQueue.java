public class DjisktraAlgorithmUsingPriorityQueue {
    //https://www.codingninjas.com/studio/problems/dijkstra's-shortest-path_985358?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //There are three ways to do it
    //1 using queue
    //2 using priority queue(heaps)
    //   3 using set
    //1 takes a lot of time so not used
    //2  and 3 are used 3rd is the most optimised
    // this algo does not work with negative values as the algorithm goes in infinite value

    //Method 3 shayad java me nhi ho skta hai, similar hai kafi method2 ke smjh me rhna chahiye interviewer ko smjhane ke liye

    //Method 1 ek tareeke se brute force hai usme ham sare rakh rahe hai jabardasti priority queue me ham todhe se greedy ho rahe hai aur miniomum vale ko hi consider kar rahe hai toh jyada faltu cheeze nhi aa rahi hai

    // Method 2
    //Time complexity is E log V (E-> edges) (V-> vertices)
    //See its derivation from the video or the screenshot stored in this folder
//    https://youtu.be/3dINsjyfooY?si=Tn3q9b2OWDX5xu-9





    //Start with keeping a distance array mark all entries with Infinity
    // then make a min heap and source vertex in it with distance zero and mark distance[src] = 0 and then keep going in min heap read the code once

    //import java.util.*;
    //public class Solution {
    //    static class Pair{
    //        int node;
    //        int weight;
    //        Pair (int node, int weight){
    //            this.node = node;
    //            this.weight = weight;
    //        }
    //    }
    //     static class PairComparator implements Comparator<Pair>{
    //        public int compare (Pair p1,Pair p2){
    //            int weightCompare = Integer.compare(p1.weight,p2.weight);
    //            if (weightCompare == 0) return Integer.compare(p1.node,p2.node);
    //            else return weightCompare;
    //        }
    //
    //    }
    //    public static List<Integer> dijkstra(int[][] edge,int vertices, int edges,int source){
    //        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
    //        for (int i = 0;i<vertices;i++) adj.add(new ArrayList<>());
    //
    //        for (int i = 0;i<edges;i++){
    //            int u = edge[i][0];
    //            int v = edge[i][1];
    //            int dis = edge[i][2];
    //            adj.get(u).add(new Pair(v,dis));
    //            adj.get(v).add(new Pair(u,dis));
    //        }
    //        int [] distance = new int[vertices];
    //        for (int i =0;i<vertices;i++) distance[i] = (int) 1e6;
    //
    //        PriorityQueue<Pair> pq = new PriorityQueue<>(new PairComparator());
    //        pq.add(new Pair (source,0));
    //        distance[source] = 0;
    //        while (pq.size()!=0){
    //            Pair pair = pq.remove();
    //            int node = pair.node;
    //            int weight = pair.weight;
    //            for (Pair p : adj.get(node)){
    //                int dist = weight+p.weight;
    //                if (dist<distance[p.node]){
    //                    distance[p.node] = dist;
    //                    pq.add(new Pair(p.node,dist));
    //                }
    //
    //            }
    //        }
    //        ArrayList<Integer> ans = new ArrayList<>();
    //        for (int i = 0;i<vertices;i++) ans.add(distance[i]);
    //        return ans;
    //    }
    //}
}
