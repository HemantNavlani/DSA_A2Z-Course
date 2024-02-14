public class EventualSafeStates {
    //terminal nodes -> nodes with no outgoing edges
    // terminal nodes are always safe nodes


    //reverse all the edges
    //get all the nodes with indegree 0
    //do a removal if edges on adjacent nodes

    //same hi hai topological sort hi return karna hai bas graph ulta banakar

//https://leetcode.com/problems/find-eventual-safe-states/
    //https://www.codingninjas.com/studio/problems/safe-nodes-in-the-graph_1376703?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //class Solution {
    //    public List<Integer> eventualSafeNodes(int[][] graph) {
    //        int n = graph.length;
    //        //reversing the graph
    //        ArrayList<ArrayList<Integer> > adj = new ArrayList<>();
    //        int [] indegree= new int[graph.length];
    //        for (int i = 0;i<n;i++) adj.add(new ArrayList<>());
    //        for (int i=0;i<graph.length;i++){
    //            for(int it: graph[i]){
    //                adj.get(it).add(i);
    //                indegree[i]++;
    //            }
    //        }
    //
    //        Queue<Integer> q = new LinkedList<>();
    //        for (int i = 0;i<n;i++){
    //            if (indegree[i]==0) q.add(i);
    //        }
    //        List<Integer> ans = new ArrayList<>();
    //        while (!q.isEmpty()){
    //            int node = q.remove();
    //            ans.add(node);
    //            for (int it : adj.get(node)){
    //                indegree[it]--;
    //                if (indegree[it]==0) q.add(it);
    //            }
    //        }
    //        Collections.sort(ans);
    //        return ans;
    //    }
    //}
}
