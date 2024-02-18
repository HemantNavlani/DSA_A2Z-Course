import java.util.*;

public class PrintShortestPath {
    //isme hame Djisktra hi lagana hai bas sath me ek extra array bhi rakhna hoga jo ye dhyan rakhega ki ham aaye kaha se hai
    //fir vo array mil jayega fir destination se source tak aate hue uss array pe traverse karte hue aa jao bas itna hi karna hai

    //is problem ki jo link mili toh vo gfg pe abhi available nhi hai isliye i am coding it here
    //https://www.geeksforgeeks.org/problems/shortest-path-in-weighted-undirected-graph/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=shortest-path-in-weighted-undirected-graph
    //ho skta hai kabhi vapis active ho jaye

    static class Pair {
        int node;
        int weight;
        Pair (int node,int weight){
            this.node = node;
            this.weight = weight;
        }
    }
    static class PairComparator implements Comparator<Pair>{
        public  int compare (Pair p1,Pair p2){
            return Integer.compare(p1.weight,p2.weight);
        }
    }
   static ArrayList<Integer> shortestPath (int v, int e, int [][] edges){
       ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
       for (int i =0;i<v;i++) adj.add(new ArrayList<>());
       for (int i= 0;i<e;i++){
           int u = edges[i][0];
           int ve = edges[i][1];
           int dis = edges[i][2];
           adj.get(u).add(new Pair(ve,dis));
           adj.get(ve).add(new Pair(u,dis));
       }

       int [] distance = new int[v];
       int [] parent = new int[v];

       for (int i= 0;i<v;i++) distance[i] = (int)1e7;
       for (int i= 0;i<v;i++)  parent[i] = i;

       int src = 0;
       distance[src] = 0;
       parent[src] = src;

       PriorityQueue<Pair> pq = new PriorityQueue<>(new PairComparator());
       pq.add(new Pair(src,distance[src]));

       while (pq.size()!=0){
           Pair p = pq.remove();
           int papa = p.node;
           int weight = p.weight;

           for(Pair it : adj.get(p.node)){
               int dist = weight+it.weight;
               if (dist<distance[it.node]){
                   distance[it.node] = dist;
                   parent[it.node] = papa;
                   pq.add(new Pair(it.node,dist));
               }
           }
       }
       if (distance[v-1] ==(int)1e7) return new ArrayList<>();
       ArrayList<Integer> ans = new ArrayList<>();
       int dest = v-1;
       while (parent[dest]!=dest){
           ans.add(dest);
           dest = parent[dest];
       }
       ans.add(src);
       Collections.reverse(ans);
       return ans;
    }

    public static void main(String[] args) {
       int [][] edges = {{0,1,2},{0,3,1},{3,2,3},{1,4,5},{1,2,4},{2,4,1}};
        ArrayList<Integer> ans = shortestPath(5,6,edges);
        System.out.println(ans);
    }
}
