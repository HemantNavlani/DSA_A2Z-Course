public class StronglyConnectedComponentsKosarajuAlgorithm {
    //Strongly Connected Components --> These only valid for directed graphs
//    Kosaraju algorithm
//    step1  Sort all the edges according to finishing time
//    step2  Reverse the graph
//    step3 do the dfs

//https://www.geeksforgeeks.org/problems/strongly-connected-components-kosarajus-algo/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=strongly-connected-components-kosarajus-algo
    /*
class Solution{
    void dfs (int node,int[] visited, Stack<Integer> st,ArrayList<ArrayList<Integer>> adj){
        visited[node] = 1;
        for (int it : adj.get(node)){
            if (visited[it]!=1){
                dfs(it,visited,st,adj);
            }
        }
        st.push(node);
    }
    void dfsStep3 (int node,int[] visited,ArrayList<ArrayList<Integer>> adj){
        visited[node]=1;
        for (int it : adj.get(node)){
            if (visited[it]!=1){
                dfsStep3(it,visited,adj);
            }
        }
    }
    public int kosaraju(int n, ArrayList<ArrayList<Integer>> adj){
        int[] visited = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0;i<n;i++){
            if (visited[i]!=1){
                dfs(i,visited,st,adj);
            }
        }

        ArrayList<ArrayList<Integer>> adjRev = new ArrayList<>();
        for (int i = 0;i<n;i++){
            adjRev.add(new ArrayList<>());
        }
        for (int i = 0;i<n;i++){
            visited[i] = 0;
            for (int it : adj.get(i)){
                adjRev.get(it).add(i);
            }
        }

        int scc = 0;

        while (!st.isEmpty()){
            int node = st.pop();
            if (visited[node]==0){
                scc++;
                dfsStep3(node,visited,adjRev);
            }
        }
        return scc;
    }
}
*/
}
