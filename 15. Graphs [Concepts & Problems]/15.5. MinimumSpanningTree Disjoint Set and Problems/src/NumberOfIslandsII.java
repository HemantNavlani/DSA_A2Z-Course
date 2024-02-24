public class NumberOfIslandsII {
    //https://www.codingninjas.com/studio/problems/largest-island_840701?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //import java.util.*;
    //public class Solution {
    //    static class DisjointSet{
    //        ArrayList<Integer> parent = new ArrayList<>();
    //        ArrayList<Integer> rank = new ArrayList<>();
    //        ArrayList<Integer> size = new ArrayList<>();
    //
    //        DisjointSet(int n){
    //            for (int i = 0;i<=n;i++){
    //                parent.add(i);
    //                size.add(1);
    //                rank.add(0);
    //            }
    //        }
    //        int findUltPar(int node){
    //            if (node == parent.get(node)) return node;
    //            int ultP = findUltPar(parent.get(node));
    //            parent.set(node,ultP);
    //            return parent.get(node);
    //        }
    //        void unionByRank (int u,int v){
    //            int ultU = findUltPar(u);
    //            int ultV = findUltPar(v);
    //            if (ultU==ultV) return;
    //
    //            if (rank.get(ultU)<rank.get(ultV)){
    //                parent.set(ultU,ultV);
    //            }
    //            else if (rank.get(ultU)>rank.get(ultV)){
    //                parent.set(ultV,ultU);
    //            }
    //            else{
    //                parent.set(ultV,ultU);
    //                rank.set(ultU,rank.get(ultU)+1);
    //            }
    //        }
    //
    //        void unionBySize (int u,int v){
    //            int ultU = findUltPar(u);
    //            int ultV = findUltPar(v);
    //            if (ultU==ultV) return;
    //
    //            if (size.get(ultU)<size.get(ultV)){
    //                parent.set(ultU,ultV);
    //                size.set(ultV,size.get(ultU)+size.get(ultV));
    //            }
    //            else{
    //                parent.set(ultV,ultU);
    //                size.set(ultU,size.get(ultU)+size.get(ultV));
    //            }
    //        }
    //    }
    //    public static int[] numberOfIslandII(int n, int m, int [][]queries, int q) {
    //        //we are making the 2 d matrix and taking its each cell as a graph node
    //        // so we need a formula to access each node as single cell and here it is --> rowNo * columnSize(m) + colNo

    // read the code basic hi hai disjoint set vala
    //        DisjointSet ds = new DisjointSet(n*m);
    //        int[][] visited = new int[n][m];
    //        int cnt = 0;
    //        int []dr = {-1,0,1,0};
    //        int []dc = {0,1,0,-1};
    //        ArrayList<Integer> ans = new ArrayList<>();
    //        for (int i=0;i<q;i++){
    //            int x = queries[i][0];
    //            int y = queries[i][1];
    //            if (visited[x][y]==1) {
    //                ans.add(cnt);
    //                continue;
    //            }
    //            visited[x][y]=1;
    //            cnt++;
    //
    //            for (int idx = 0;idx<4;idx++){
    //                int newR = x + dr[idx];
    //                int newC = y + dc[idx];
    //                if (newR>=0 && newC>=0 && newR<n && newC<m && visited[newR][newC]==1){
    //                    int nodeNum = x * m + y;
    //                    int newNodeNum = newR * m + newC;
    //                    if (ds.findUltPar(nodeNum)!=ds.findUltPar(newNodeNum)){
    //                        cnt--;
    //                        ds.unionBySize(nodeNum,newNodeNum);
    //                    }
    //                }
    //            }
    //            ans.add(cnt);
    //        }
    //        int[] res = new int[ans.size()];
    //        for (int i = 0;i<ans.size();i++) res[i] = ans.get(i);
    //        return res;
    //    }
    //}
}
