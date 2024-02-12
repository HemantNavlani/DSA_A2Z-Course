public class DetectCycleInADirectedGraph {
    //on the same path, the node has to be visited again, yaha pe hamne simple dfs hi lagaya hai but sath hi me visited and path visited rakha hai kyunki yaha par directed graph ki bat ho rhi hai
    // path visisted array ko chahe toh hata bhi skte hai
    //dono solution ye likhe hue hai

//    https://www.codingninjas.com/studio/problems/detect-cycle-in-a-directed-graph-_920545?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
    //https://leetcode.com/problems/course-schedule/
    //import java.util.*;

    //public class Solution {
    //    static Boolean dfs(int node,   ArrayList<ArrayList<Integer>> adj,int[] visited,int[]pathVisited){
    //        visited[node] = 1;
    //        pathVisited[node] = 1;
    //
    //
    //        //traverse for adjacent nodes
    //        for (int it:adj.get(node)){
    //            //when node is not visited
    //            if (visited[it]!=1){
    //                if (dfs(it,adj,visited,pathVisited)) return true;
    //            }
    //            // if thr node has been previously visited
    //            //but it has to be on the same path
    //            else if (pathVisited[it]==1) return true;
    //        }
    //        pathVisited[node]=0;
    //        return false;
    //    }
    //    public static Boolean isCyclic(int[][] edges, int v, int e){
    //        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    //        for (int i = 0;i<v;i++) adj.add(new ArrayList<>());
    //        for (int i = 0;i<e;i++) adj.get(edges[i][0]).add(edges[i][1]);
    //
    //        int [] visited = new int[v];
    //        int [] pathVisited = new int[v];
    //
    //        for (int i=0;i<v;i++){
    //            if (visited[i]!=1) {
    //                if (dfs(i,adj,visited,pathVisited)) return true;
    //            }
    //        }
    //        return false;
    //	}
    //}

    //class Solution {
    //    boolean dfs (int node, int[]visited, ArrayList<ArrayList<Integer>> adj){
    //        visited[node] = 2;
    //
    //        for (int it : adj.get(node)){
    //            if(visited[it]==0){
    //                if (dfs(it,visited,adj)==false) return false;
    //            }
    //            else if (visited[it]==2) return false;
    //        }
    //        visited[node] = 1;
    //        return true;
    //    }
    //    public boolean canFinish(int numCourses, int[][] prerequisites) {
    //        int v = numCourses;
    //        int e = prerequisites.length;
    //        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    //        for (int i = 0;i<v;i++) adj.add(new ArrayList<>());
    //        for (int i = 0;i<e;i++) adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
    //        int [] visited = new int[v];
    //        for (int i = 0;i<v;i++){
    //            if (visited[i]==0) {
    //                if (dfs(i,visited,adj)==false) return false;
    //            }
    //        }
    //        return true;
    //    }
    //}
}
