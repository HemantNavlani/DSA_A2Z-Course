public class CheapestFlightsWithinKsteps {
    //yaha pe djisktra lagayenge but phle ham number of stops ka dhyan rakhenge
//    and since yaha stops hamsha 1 se hi badh rahe hai toh ham normal queue bhi use kar skte hai usme bhi sorted way me hi saaman padha hoga
//https://www.codingninjas.com/studio/problems/saving-money_1171195?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//    https://leetcode.com/problems/cheapest-flights-within-k-stops/
    //TC = E = flights.length

    //class Solution {
    //    class Pair {
    //        int node;
    //        int dist;
    //        Pair(int node,int dist){
    //            this.node= node;
    //            this.dist =dist;
    //        }
    //    }
    //    class Tuple{
    //        int stops;
    //        int node;
    //        int distance;
    //        Tuple(int stops,int node,int distance){
    //            this.stops = stops;
    //            this.node = node;
    //            this.distance = distance;
    //        }
    //    }
    //    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
    //        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
    //        for (int i=0;i<n;i++) adj.add(new ArrayList<>());
    //        for(int i=0;i<flights.length;i++){
    //            int u = flights[i][0];
    //            int v = flights[i][1];
    //            int dist = flights[i][2];
    //            adj.get(u).add(new Pair(v,dist));
    //        }
    //        int [] distance = new int[n];
    //        for (int i = 0;i<n;i++) distance[i] = (int)1e7;
    //        distance[src]=0;
    //        Queue<Tuple> q = new LinkedList<>();
    //        q.add(new Tuple(0,src,0));
    //        while (q.size()!=0){
    //            Tuple t = q.remove();
    //            int stops= t.stops;
    //            int node = t.node;
    //            int dist = t.distance;
    //            if (stops> k) continue;
    //            for (Pair p : adj.get(node)){
    //                if (dist+p.dist<distance[p.node]){
    //                    distance[p.node] = dist+p.dist;
    //                    if (stops<=k) q.add(new Tuple(stops+1,p.node,dist+p.dist));
    //                }
    //            }
    //        }
    //        if (distance[dst]==(int)1e7) return -1;
    //        else return distance[dst];
    //    }
    //}
}

