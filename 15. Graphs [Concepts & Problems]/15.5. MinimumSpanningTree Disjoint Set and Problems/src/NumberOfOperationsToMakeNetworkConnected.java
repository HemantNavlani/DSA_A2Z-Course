public class NumberOfOperationsToMakeNetworkConnected {
    //minimum number of edges to connect the components if there are n components are n-1
    // but the problem is that we can only take out the faltu edges and then connect the components so counting those edges is also important
//    so let number of connected components is nc then ans is nc-1 if extra edges > = ans else ans = -1;

    //extra count kara and nc count kiya and simple just read the code

//https://www.codingninjas.com/studio/problems/number-of-operations-to-make-graph-connected._1385179?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/number-of-operations-to-make-network-connected/

    //class Solution {
    //    class DisjointSet {
    //        ArrayList<Integer> parent = new ArrayList<>();
    //        ArrayList<Integer> rank = new ArrayList<>();
    //        ArrayList<Integer> size = new ArrayList<>();
    //
    //        DisjointSet (int n){
    //            for (int i = 0;i<=n;i++){
    //                rank.add(0);
    //                parent.add(i);
    //                size.add(1);
    //            }
    //        }
    //
    //        int findUltPar(int node){
    //            if (node==parent.get(node)) return node;
    //            int ultP = findUltPar(parent.get(node));
    //            parent.set(node,ultP);
    //            return parent.get(node);
    //        }
    //
    //        void unionByRank (int u,int v){
    //            int ult_u = findUltPar(u);
    //            int ult_v = findUltPar(v);
    //            if (ult_u == ult_v) return;
    //            if (rank.get(ult_u)<rank.get(ult_v)){
    //                parent.set(ult_u,ult_v);
    //            }
    //            else if (rank.get(ult_u)>rank.get(ult_v)){
    //                parent.set(ult_v,ult_u);
    //            }
    //            else {
    //                parent.set(ult_u,ult_v);
    //                rank.set(ult_u,rank.get(ult_u)+1);
    //            }
    //        }
    //        void unionBySize (int u,int v){
    //            int ult_u = findUltPar(u);
    //            int ult_v = findUltPar(v);
    //            if (ult_u == ult_v) return;
    //            if (size.get(ult_u)<size.get(ult_v)){
    //                parent.set(ult_u,ult_v);
    //                size.set(ult_v,size.get(ult_u)+size.get(ult_v));
    //            }
    //            else {
    //                parent.set(ult_v,ult_u);
    //                size.set(ult_u,size.get(ult_u)+size.get(ult_v));
    //            }
    //        }
    //    }
    //    public int makeConnected(int n, int[][] connections) {
    //        DisjointSet ds = new DisjointSet(n);
    //        int m = connections.length;
    //        int extra = 0;
    //        for (int[] it : connections){
    //            if (ds.findUltPar(it[0])!=ds.findUltPar(it[1]))
    //                ds.unionBySize(it[0],it[1]);
    //            else extra ++;
    //        }
    //        int conC = 0;
    //        for (int i = 0;i<n;i++){
    //            if (ds.parent.get(i)==i) conC++;
    //        }
    //    return (extra>=conC-1) ?  conC-1 : -1;
    //    }
    //}
}
