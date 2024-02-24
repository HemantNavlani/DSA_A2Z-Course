public class PrimsAlgorithm {
//    initially we require a priority queue(min heap) storing weight,node,parent  and a visited array
// its just a kind of greedy approach minimum path ko lete ja rahe hai baaki read the code once to understand
//    TC -> E log E + E log E
//    SC -> V + E
    //import java.util.*;
    //public class Solution {
    //	static class Pair{
    //		int node;
    //		int dist;
    //		Pair(int node,int dist){
    //			this.node = node;
    //			this.dist = dist;
    //		}
    //	}
    //	static class Tuple{
    //		int node;
    //		int parent;
    //		int distance;
    //		Tuple(int node, int parent,int distance){
    //			this.node= node ;
    //			this.parent = parent;
    //			this.distance = distance;
    //		}
    //	}
    //	public static int minimumSpanningTree(ArrayList<ArrayList<Integer>> edges, int n) {
    //		ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
    //		for (int i = 0;i<n;i++) adj.add(new ArrayList<>());
    //			for (ArrayList<Integer> it : edges){
    //				int u = it.get(0);
    //				int v = it.get(1);
    //				int w = it.get(2);
    //				adj.get(u).add(new Pair(v,w));
    //				adj.get(v).add(new Pair(u,w));
    //		}
    //		// since we do not have to written the array of answer of MST we can avoid storing the parent also in the priority queue
    //		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    //		// storing mst here, for this question there is no need to do it  I am doing it to make good notes also
    //		int[] visited = new int[n];
    //		PriorityQueue<Tuple> pq = new PriorityQueue<>((x,y)->x.distance-y.distance);
    //		pq.add(new Tuple(0,-1,0));
    //		int sum = 0;
    //		while (pq.size()!=0){
    //			Tuple t = pq.remove();
    //			int node = t.node;
    //			int dist = t.distance;
    //			int parent = t.parent;
    //
    //			if (visited[node]!=1){
    //				visited[node] = 1;
    //				ArrayList<Integer> toAdd = new ArrayList<>();
    //				toAdd.add(node);
    //				toAdd.add(parent);
    //				ans.add(toAdd);
    //				sum+=dist;
    //
    //				for (Pair it : adj.get(node)){
    //					if (visited[it.node]!=1){
    //						pq.add(new Tuple(it.node,node,it.dist));
    //					}
    //				}
    //			}
    //		}
    //		return sum;
    //	}
    //}
}
