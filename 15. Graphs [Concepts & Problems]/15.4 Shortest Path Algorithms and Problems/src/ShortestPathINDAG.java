public class ShortestPathINDAG {
    //DAG --> Directed Acyclic graph

//    https://www.codingninjas.com/studio/problems/shortest-path-in-dag_8381897?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //Step 1 //here phle hame topological sort karna hai

    //Step 2 Take the nodes out of stack and relax the edges
    //make the distance array
//Finding the shortest path to a vertex is easy if you already know the shortest paths to all the vertices that can precede it. Processing the vertices in topological order ensures that by the time you get to a vertex, you’ve already processed all the vertices that can precede it which reduces the computation time significantly. In this approach, we traverse the nodes sequentially according to their reachability from the source.
//
//Dijkstra’s algorithm is necessary for graphs that can contain cycles because they can’t be topologically sorted. In other cases, the topological sort would work fine as we start from the first node, and then move on to the others in a directed manner.
//    read the code to understand more
//import java.util.*;
//public class Solution {
//    static class Pair {
//        int node;
//        int weight;
//        Pair(int node,int weight){
//            this.node = node;
//            this.weight = weight;
//        }
//    }
//    static void dfs(int node,Stack<Integer> st,ArrayList<ArrayList<Pair>> adj,int[] visited){
//        visited[node]=1;
//        for (Pair p : adj.get(node)){
//            int it = p.node;
//            if (visited[it]!=1) dfs(it,st,adj,visited);
//        }
//        st.push(node);
//    }
//    public static int[] shortestPathInDAG(int n, int m, int [][]edges) {
//        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
//        for (int i = 0;i<n;i++) adj.add(new ArrayList<>());
//        for(int i = 0;i<m;i++){
//            int u = edges[i][0];
//            int v = edges[i][1];
//            int dis = edges[i][2];
//            adj.get(u).add(new Pair(v,dis));
//        }
//        int[] visited = new int[n];
//        Stack<Integer> st = new Stack<>();
//        for (int i = 0;i<n;i++){
//            if (visited[i]!=1) dfs(i,st,adj,visited);
//        }
//        int[] distance = new int[n];
//        for (int i=0;i<n;i++) distance[i] =(int) 1e6;
//        int src = 0;
//        distance[src]=0;
//
//        //2 1 0
//        //i i i
//        while (st.size()!=0){
//            int node = st.pop();//0
//            for (Pair p : adj.get(node)){//1,2
//                int dis = distance[node] +p.weight;//0+2=2
//                distance[p.node] = Math.min(distance[p.node],dis);
//            }
//        }
//
//        for (int i = 0;i<n;i++){
//            if (distance[i] ==(int) 1e6) distance[i]=-1;
//        }
//        return distance;
//    }
//}

}

