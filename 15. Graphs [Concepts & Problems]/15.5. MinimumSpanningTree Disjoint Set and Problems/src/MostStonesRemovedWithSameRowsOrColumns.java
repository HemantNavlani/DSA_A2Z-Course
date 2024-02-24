public class MostStonesRemovedWithSameRowsOrColumns {
    //we can see the 2d matrix given as various componenets connected because of having same row and same column
    // and then from each component we can remove all stones except 1 and then count the total stones removed that will be our answer and this is the thought process

//    let x1, x2 ,x3 ,x4 ..... be the number of stones in each componenets
//    so x1 + x2 + x3 + x4 +.... = n i.e. the number of total stones

//    so max stones removed = x1-1 + x2 -1 + x3-1 + ......
//    = x1 + x2 + x3 + ..... +    (-1 -1 -1 -1 -1 -1 -......)
//    = n (total stones) + - (number of components) //since we are taking one from each component
//    so just in a 2d matrix where the row and column are connected then just find out the number of components

//    read the code how we have connected the components
//https://www.codingninjas.com/studio/problems/-most-stones-removed-with-same-row-or-column_1376597?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/
    //class Solution {
    //    class DisjointSet{
    //        ArrayList<Integer> parent = new ArrayList<>();
    //        ArrayList<Integer> size = new ArrayList<>();
    //        ArrayList<Integer> rank = new ArrayList<>();
    //        DisjointSet(int n){
    //            for (int i= 0;i<=n;i++){
    //                parent.add(i);
    //                rank.add(0);
    //                size.add(1);
    //            }
    //        }
    //
    //        int findUltPar(int node){
    //            if (node == parent.get(node)) return node;
    //            int ultPar = findUltPar(parent.get(node));
    //            parent.set(node,ultPar);
    //            return parent.get(node);
    //        }
    //        void unionByRank (int u,int v){
    //            int ult_u = findUltPar(u);
    //            int ult_v = findUltPar(v);
    //            if (ult_u==ult_v) return;
    //            if (rank.get(ult_u)<rank.get(ult_v)){
    //                parent.set(ult_u,ult_v);
    //            }
    //            else if (rank.get(ult_u)>rank.get(ult_v)){
    //                parent.set(ult_v,ult_u);
    //            }
    //            else {
    //                parent.set(ult_v,ult_u);
    //                rank.set(ult_u,rank.get(ult_u)+1);
    //            }
    //        }
    //        void unionBySize(int u, int v){
    //            int ult_u = findUltPar(u);
    //            int ult_v = findUltPar(v);
    //            if (ult_u==ult_v) return;
    //
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
    //    public int removeStones(int[][] stones) {
    //        int n = stones.length;
    //        int maxRow = 0;
    //        int maxCol = 0;
    //        for (int i =0;i<n;i++){
    //            maxRow = Math.max(maxRow,stones[i][0]);
    //            maxCol = Math.max(maxCol,stones[i][1]);
    //        }
    //        //We just need the nodes in Disjoint Set which are involved in having a stone.
    //        // So we store the rows and coloumns in map as they will have stones.
    //        // And we just need to count them once for ultimate
    //
    //        HashMap<Integer,Integer> stoneNodes = new HashMap<>();
    //        DisjointSet ds = new DisjointSet(maxRow+maxCol+1);
    //        for (int i =0;i<n;i++){
    //            int nodeRow = stones[i][0];
    //            int nodeCol = stones[i][1]+maxRow+1;
    //            ds.unionBySize(nodeRow,nodeCol);
    //            stoneNodes.put(nodeRow,1);
    //            stoneNodes.put(nodeCol,1);
    //        }
    //        int ans = 0;
    //        for (int it : stoneNodes.keySet()){
    //            if (ds.findUltPar(it)==it){
    //                ans++;
    //            }
    //        }
    //        return n-ans;
    //    }
    //
    //}
}
