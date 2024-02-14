public class CourseSchedule1 {

    //same as detect a cycle


    //By BFS -> Kahn's Algorithm (Topological sort)
    //class Solution {
    //    public boolean canFinish(int numCourses, int[][] prerequisites) {
    //        int v = numCourses;
    //        int e = prerequisites.length;
    //        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    //        for (int i = 0;i<v;i++) adj.add(new ArrayList<>());
    //        for (int i = 0;i<e;i++) adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
    //
    //        int[] indegree = new int[v];
    //        for (int i = 0;i<v;i++){
    //            for (int it :adj.get(i)) indegree[it]++;
    //        }
    //        Queue<Integer> q = new LinkedList<>();
    //        for (int i = 0;i<v;i++){
    //            if (indegree[i]==0) q.add(i);
    //        }
    //        int cnt = 0;
    //        while (q.size()!=0){
    //            int node = q.remove();
    //            cnt++;
    //
    //            for (int it: adj.get(node)){
    //                indegree[it]--;
    //                if (indegree[it]==0) q.add(it);
    //            }
    //        }
    //        if (cnt == v) return true;
    //        return false;
    //
    //    }
    //}


    //By DFS
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
