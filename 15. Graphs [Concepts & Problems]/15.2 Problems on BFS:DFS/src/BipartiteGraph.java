public class BipartiteGraph {
    //https://leetcode.com/problems/is-graph-bipartite/
    //https://www.codingninjas.com/studio/problems/check-bipartite-graph-_920551?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //if a graph has odd length cycle then it can never be bipartite graph and if it has even cycle then it can be bipartite graph
    //linear length graph is bipartite graph
    //Bipartite graph matlab do colours se hi poora graph color ho jana chahiye


    //dfs lagaya hai aur color mark karte chale hai if do adjacent ke pass same color aayega toh false
    //class Solution {
    //     boolean dfs(int node,int c, int[]color,int[][]graph){
    //        color[node] = c;
    //        for (int i : graph[node]){
    //            if (color[i]==-1){
    //                if (c==0) if (dfs(i,1,color,graph)==false) return false;
    //                if (c==1) if (dfs(i,0,color,graph)==false) return false;
    //            }
    //            else if (color[i]==c) return false;
    //        }
    //        return true;
    //    }
    //    public boolean isBipartite(int[][] graph) {
    //        int v = graph.length;
    //        int [] color = new int [v];
    //        for (int i = 0;i<v;i++) color[i]=-1;
    //
    //        for(int i = 0;i<v;i++){
    //            if (color[i]==-1){
    //                if (dfs(i,0,color,graph)==false) return false;
    //            }
    //        }
    //        return true;
    //    }
    //}


    //bfs
    //class Solution {
    //    boolean check (int start, int[] color, int[][]graph){
    //        Queue<Integer> q = new LinkedList<>();
    //        q.add(start);
    //        color[start] = 0;
    //        while (!q.isEmpty()){
    //            int node = q.remove();
    //            for (int it:graph[node]){
    //                if (color[it]==-1){
    //                    if (color[node] == 0) color[it] = 1;
    //                    if (color[node] == 1) color[it] = 0;
    //                    q.add(it);
    //                }
    //                else if (color[it]==color[node]) return false;
    //            }
    //        }
    //        return true;
    //    }
    //    public boolean isBipartite(int[][] graph) {
    //           int v = graph.length;
    //       int[] color = new int [v];
    //        for (int i= 0;i<v;i++) color[i]=-1;
    //        for (int i = 0;i<v;i++){
    //            if (color[i]==-1) if (check(i,color,graph)==false) return false;
    //        }
    //        return true;
    //    }
    //}
}
