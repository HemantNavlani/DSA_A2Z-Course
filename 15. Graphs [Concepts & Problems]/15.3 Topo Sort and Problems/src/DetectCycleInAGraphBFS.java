public class DetectCycleInAGraphBFS {
    //https://www.codingninjas.com/studio/problems/detect-cycle-in-a-directed-graph_1062626?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //we will use Kahn's Algorithm here also which is used for finding topological sort
    //we know that Topological sort can only be found if the graph is Directed Acyclic Graph
    //so we will still apply this algorithm here which help to detect whether there is a cycle or not
    //agar topological sort lagane ke bad answer list me number of elements equal hogaye number of verices ke toh matlab cycle nhi this otherwise cycle thi

    //import java.util.*;
    //public class Solution {
    //  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
    //    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    //    for (int i = 0;i<n;i++) adj.add(new ArrayList<>());
    //    for(int i = 0;i<edges.size();i++) {
    //      int u = edges.get(i).get(0)-1;
    //      int v = edges.get(i).get(1)-1;
    //      adj.get(u).add(v);
    //    }
    //
    //
    //    int[] indegree = new int[n];
    //    for (int i = 0;i<n;i++){
    //      for (int it:adj.get(i)) indegree[it]++;
    //    }
    //
    //    Queue<Integer> q = new LinkedList<>();
    //    for (int i = 0;i<n;i++){
    //      if (indegree[i]==0) q.add(i);
    //    }
    //    int cnt = 0;
    //    while (q.size()!=0){
    //      int node = q.remove();
    //      cnt++;
    //      for (int it : adj.get(node)){
    //        indegree[it]--;
    //        if (indegree[it]==0) q.add(it);
    //      }
    //    }
    //    if (cnt==n) return false;
    //    return true;
    //  }
    //}

}
