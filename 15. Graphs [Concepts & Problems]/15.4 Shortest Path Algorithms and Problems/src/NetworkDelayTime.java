public class NetworkDelayTime {
//https://leetcode.com/problems/network-delay-time/
    //https://www.codingninjas.com/studio/problems/network-delay-time_1382215?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //simple dijkstra algorithm

    //class Solution {
    //    class Pair {
    //        int node;
    //        int dist;
    //        Pair(int node,int dist){
    //            this.node= node;
    //            this.dist = dist;
    //        }
    //    }
    //    public int networkDelayTime(int[][] times, int n, int k) {
    //        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
    //        for(int i = 0;i<n;i++) adj.add(new ArrayList<>());
    //        for(int i= 0;i<times.length;i++){
    //            int u = times[i][0]-1;
    //            int v = times[i][1]-1;
    //            int dist = times[i][2];
    //            adj.get(u).add(new Pair(v,dist));
    //        }
    //        int[] distance = new int[n];
    //        for (int i = 0;i<n;i++) distance[i] = (int) 1e7;
    //
    //        distance[k-1]=0;
    //        PriorityQueue<Pair> q= new PriorityQueue<>((x,y)->x.dist-y.dist);
    //        q.add(new Pair(k-1,0));
    //
    //        while (!q.isEmpty()){
    //            Pair p = q.remove();
    //            int node = p.node;
    //            int dist = p.dist;
    //
    //            for (Pair it : adj.get(node)){
    //                if (dist+it.dist<distance[it.node]){
    //                    distance[it.node]=dist+it.dist;
    //                    q.add(new Pair(it.node,dist+it.dist));
    //                }
    //            }
    //        }
    //        int ans = 0;
    //        for (int i= 0;i<n;i++){
    //            if(distance[i]==(int)1e7) return -1;
    //            else ans=Math.max(ans,distance[i]);
    //        }
    //        return ans;
    //    }
    //}
}
