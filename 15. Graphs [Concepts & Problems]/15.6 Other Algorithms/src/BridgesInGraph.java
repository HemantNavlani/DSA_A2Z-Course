public class BridgesInGraph {

    //Bridge --> Any edge which if removed breaks the graph in two or more components

    //two arrays
    //tin[] time of insertion array using dfs
    //low[] minmum lowest time insertion of all adjacent nodes apart from parent

    //Samajh me toh kam aaya hai video dekhlena ek aur baar jarurat pade toh or read the code
    //class Solution {
    //    private int timer = 1;
    //    void dfs(int node,int parent, int[] visited,int[] tin,int[]low,
    //     List<List<Integer>> adj,
    //    List<List<Integer>> bridges){
    //        visited[node] = 1;
    //        tin[node] = low[node] = timer;
    //        timer++;
    //        for (int it : adj.get(node)){
    //            if (it==parent) continue;
    //            if (visited[it]==0){
    //                dfs(it,node,visited,tin,low,adj,bridges);
    //                low[node] = Math.min(low[node],low[it]);
    //                if (low[it]>tin[node]){
    //                    bridges.add(Arrays.asList(it,node));
    //                }
    //            }
    //            else{
    //                low[node] = Math.min(low[node],low[it]);
    //            }
    //        }
    //    }
    //    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
    //        List<List<Integer>> adj = new ArrayList<>();
    //        for(int i = 0;i<n;i++) adj.add(new ArrayList<>());
    //        for (List<Integer> it : connections){
    //            int u = it.get(0);
    //            int v = it.get(1);
    //            adj.get(u).add(v);
    //            adj.get(v).add(u);
    //        }
    //
    //        int[] visited = new int[n];
    //        int[] tin = new int[n];
    //        int[] low = new int[n];
    //        List<List<Integer>> bridges = new ArrayList<>();
    //        dfs(0,-1,visited,tin,low,adj,bridges);
    //        return bridges;
    //    }
    //}

}
