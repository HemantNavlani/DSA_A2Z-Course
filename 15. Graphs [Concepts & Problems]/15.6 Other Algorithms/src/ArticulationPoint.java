public class ArticulationPoint {
//    ArticulationPoint --> node on whose removal the graph breas into multiple componenets
//    for this you should know the bridges in graph question's concept
//https://www.geeksforgeeks.org/problems/articulation-point-1/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=articulation-point
//    tin -->  store the time of insertion during dfs
//    low --> minimum of all adjacent nodes apart from parent and visited nodes
//    condition --> a bit changed ---> if (low[it] > = tin[node] && parent !=-1)// as we have to reach before the node not even to the node will work we want to go before
//   for parent node we will se different logic
//    for starting point if it has multiple children then it is a articulation point else its not

//    ho skta hai same node do baar articulation point mark ho jaye toh take care of it

    /*
class Solution{
    private int timer = 0;

    void dfs(int node,int parent,int[] visited,int[]low,int[] tin,int[]mark,ArrayList<ArrayList<Integer>> adj){
        visited[node] = 1;
        tin[node] = low[node] = timer++;
        int child = 0;
        for (int it : adj.get(node)){
            if (it == parent) continue;
            if (visited[it]==0){
                dfs(it,node,visited,low,tin,mark,adj);
                low[node] = Math.min(low[node],low[it]);
                if (low[it]>=tin[node] && parent!=-1) mark[node] = 1;
                child ++;
            }
            else {
                low[node] = Math.min(tin[it],low[node]);
            }
        }
        if (child > 1 && parent ==-1) mark[node]=1;
    }
    public ArrayList<Integer> articulationPoints(int n,ArrayList<ArrayList<Integer>> adj){
        int[] visited = new int[n];
        int[] tin = new int[n];
        int[] low = new int[n];
        int[] mark = new int[n];

        for (int i = 0;i<n;i++){
            if (visited[i]==0)
            dfs(i,-1,visited,low,tin,mark,adj);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if (mark[i]==1) ans.add(i);
        }

        if (ans.size()==0){
            ArrayList<Integer> a = new ArrayList<>();
            a.add(-1);
            return a;
        }
        else return ans;
    }
}*/

}
