public class KruskalAlgorithm {
//    Step 1 --> Sort all the edges by their weight
//    Step 2 --> Just go thru all the edges and see if they do not have the same ultimate parent then add the weight to the minimum spanning tree and keep doing the union
    //https://www.codingninjas.com/studio/problems/kruskal%E2%80%99s-minimum-spanning-tree-algorithm_1082553?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //import java.util.*;
    //public class Solution {
    //    static class DisjointSet {
    //        ArrayList<Integer> parent = new ArrayList<>();
    //        ArrayList<Integer> rank= new ArrayList<>();
    //        ArrayList<Integer> size= new ArrayList<>();
    //        DisjointSet(int n){
    //            for (int i=0;i<=n;i++){
    //            parent.add(i);
    //            rank.add(0);
    //            size.add(1);
    //            }
    //        }
    //
    //        int findUltPar(int node){
    //            if (node == parent.get(node)) return node;
    //            int upar =findUltPar(parent.get(node));
    //            parent.set(node,upar);
    //            return parent.get(node);
    //        }
    //
    //        void unionByRank(int u,int v){
    //            int ult_u = findUltPar(u);
    //            int ult_v = findUltPar(v);
    //            if (ult_u==ult_v) return;
    //
    //            if (rank.get(ult_u)<rank.get(ult_v)){
    //                parent.set(ult_u,ult_v);
    //            }
    //            else if (rank.get(ult_u)>rank.get(ult_v)){
    //                parent.set(ult_v,ult_u);
    //            }
    //            else {
    //                rank.set(ult_u,ult_v);
    //                rank.set(ult_v,rank.get(ult_v)+1);
    //            }
    //        }
    //        void unionBySize(int u, int v){
    //            int ult_u = findUltPar(u);
    //            int ult_v = findUltPar(v);
    //            if (ult_u==ult_v) return;
    //
    //            if (size.get(ult_u)<size.get(ult_v)){
    //                parent.set(ult_u,ult_v);
    //                size.set(ult_v,size.get(ult_v)+size.get(ult_u));
    //            }
    //            else{
    //                parent.set(ult_v,ult_u);
    //                size.set(ult_u,size.get(ult_u)+size.get(ult_v));
    //            }
    //        }
    //    }
    //
    //    public static int kruskalMST(int n,int [][]edges) {
    //        DisjointSet ds = new DisjointSet(n);
    //        Arrays.sort(edges,(x,y)->x[2]-y[2]);
    //        int mstWt = 0;
    //        for (int[] it : edges){
    //            int wt = it[2];
    //            int u = it[0];
    //            int v = it[1];
    //
    //            if (ds.findUltPar(u) != ds.findUltPar(v)){
    //                mstWt+=wt;
    //                ds.unionBySize(u,v);
    //            }
    //        }
    //        return mstWt;
    //    }
    //}
}
