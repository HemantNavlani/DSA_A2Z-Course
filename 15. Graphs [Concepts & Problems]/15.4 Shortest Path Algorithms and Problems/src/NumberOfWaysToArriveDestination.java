import java.util.PriorityQueue;

public class NumberOfWaysToArriveDestination {
    //https://www.codingninjas.com/studio/problems/number-of-ways_8360639?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/description/

    //aise nhi hoga ki phle minimum nikal liya fir us tak ke ways nikal rahe hai ho skta hai pichli node pe pahuchne ke bht sare tareeke ho aur vaha se ek single tareeka ho destination tak ka toh vo sare tareeke lene padenge

    //vo hi djisktra hi hai bas sath hi me ek ways array bhi sath leke chalna hai aur usko bhi update karna hai dekho kaise kiya read the code
    //class Solution {
    //    class Pair {
    //        int node;
    //        int dist;
    //        Pair(int node,int dist){
    //            this.node=node;
    //            this.dist=dist;
    //        }
    //    }
    //    public int countPaths(int n, int[][] roads) {
    //        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
    //        for (int i = 0;i<n;i++) adj.add(new ArrayList<>());
    //        for (int i = 0;i<roads.length;i++){
    //            int u = roads[i][0];
    //            int v = roads[i][1];
    //            int w = roads[i][2];
    //            adj.get(u).add(new Pair(v,w));
    //            adj.get(v).add(new Pair(u,w));
    //        }
    //
    //        int[] ways = new int[n];
    //        long[] distance = new long[n];
    //        for (int i = 0;i<n;i++) distance[i]=Long.MAX_VALUE;
    //        int src = 0;
    //        distance[src] = 0;
    //        ways[src]=1;
    //        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)->x.dist-y.dist);
    //        pq.add(new Pair(src,0));
    //        int mod =(int)(1e9+7);
    //        while(!pq.isEmpty()){
    //            Pair p = pq.remove();
    //            int node = p.node;
    //            long dist = (long)p.dist;
    //            for (Pair it : adj.get(node)){
    //                if (dist+(long)it.dist<distance[it.node]){
    //                    distance[it.node] = dist+(long)it.dist;
    //                    pq.add(new Pair(it.node,(int)dist+it.dist));
    //                    ways[it.node]=ways[node];
    //                }
    //                else if (dist+(long)it.dist==distance[it.node]){
    //                    ways[it.node] = (ways[it.node] + ways[node]) % mod;
    //                }
    //            }
    //        }
    //        return ways[n-1]%mod;
    //    }
    //}
}
