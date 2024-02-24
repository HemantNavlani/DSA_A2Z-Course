public class NumberOfProvincesByDisjointSet {
    //https://www.geeksforgeeks.org/problems/number-of-provinces/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=number-of-provinces

    /*

class Solution {
    static class DisjointSet {
        ArrayList<Integer> parent = new ArrayList<>();
        ArrayList<Integer> rank = new ArrayList<>();
        ArrayList<Integer> size = new ArrayList<>();
        DisjointSet(int n){
            for (int i = 0;i<=n;i++){
                parent.add(i);
                rank.add(0);
                size.add(1);
            }
        }

        int findUltPar(int node){
            if (node==parent.get(node)) return node;
            int ultP = findUltPar(parent.get(node));
            parent.set(node,ultP);
            return parent.get(node);
        }

        void unionByRank(int u,int v){
            int ultP_u = findUltPar(u);
            int ultP_v = findUltPar(v);
            if (ultP_u==ultP_v) return;
            if (rank.get(ultP_u)<rank.get(ultP_v)){
                parent.set(ultP_u,ultP_v);
            }
            else if (rank.get(ultP_u)>rank.get(ultP_v)){
                parent.set(ultP_v,ultP_u);
            }
            else {
                parent.set(ultP_v,ultP_u);
                rank.set(ultP_u,rank.get(ultP_u)+1);
            }
        }
        void unionBySize(int u,int v){
            int ultP_u = findUltPar(u);
            int ultP_v = findUltPar(v);
            if (ultP_u==ultP_v) return;
            if (size.get(ultP_u)<size.get(ultP_v)){
                parent.set(ultP_u,ultP_v);
                size.set(ultP_v,size.get(ultP_u)+size.get(ultP_v));
            }
            else {
                parent.set(ultP_v,ultP_u);
                size.set(ultP_u,size.get(ultP_u)+size.get(ultP_v));
            }
        }

    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        DisjointSet ds = new DisjointSet(V);
        for (int i = 0;i<V;i++){
            for (int j = 0;j<V;j++){

                if (adj.get(i).get(j)==1){
                    ds.unionBySize(i,j);
                }
            }
        }
        int ans = 0;
        for (int i = 0;i<V;i++){
            if (ds.parent.get(i)==i) ans++;
        }
        return ans;
    }
};
    * */
}
