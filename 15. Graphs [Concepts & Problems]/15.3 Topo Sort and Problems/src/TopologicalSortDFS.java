public class TopologicalSortDFS {
    //https://www.codingninjas.com/studio/problems/topological-sorting_973003?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //it only exists on DAG (directed acyclic graph)
    //Topological sort => linear ordering of vertices such that if there is an edge between u and v, u appears before v in that ordering

    //undirected me toh ye kar hi nhi skte because let there is a edge betweeen 1 and 2 so there will be edge from 1 to 2 and from 2 to 1 so  how will you write 1 before 2 and 2 before 1 at the same time

    //similarly agar directed me cyclic me bhi nhi hoga ghoom ke vo vapis aa jayega toh nhi likh payenge

    //intuition --> the people whose dfs is completed, we are storing in the stack
    //baaki read the code


    //import java.util.*;
    //public class Solution {
    //    static void dfs(int node,Stack<Integer> st,ArrayList<ArrayList<Integer>> adj,int[]visited){
    //        visited[node] = 1;
    //        for (int it : adj.get(node)){
    //            if (visited[it]!=1) dfs(it,st,adj,visited);
    //        }
    //        st.push(node);
    //    }
    //    public static List<Integer> topologicalSort(int[][] edges, int e, int v) {
    //        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    //        for (int i=0;i<v;i++) adj.add(new ArrayList<>());
    //        for(int i=0;i<e;i++) adj.get(edges[i][0]).add(edges[i][1]);
    //        int[] visited = new int[v];
    //        Stack<Integer> st = new Stack<>();
    //        for (int i = 0;i<v;i++){
    //            if (visited[i]!=1) dfs(i,st,adj,visited);
    //        }
    //
    //        List<Integer> ans = new ArrayList<>();
    //        while (st.size()!=0){
    //            ans.add(st.pop());
    //        }
    //        return ans;
    //    }
    //}
}
