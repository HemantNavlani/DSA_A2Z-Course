import java.util.ArrayList;

public class DisjointSetUnionByRankAndSize {
    static class  DisjointSet{

//        Either use union by size or union by rank do not use both of them together kyunki intermixing ho jayegi dono ke kam ki

        ArrayList<Integer> rank = new ArrayList<>();
        ArrayList<Integer> parent = new ArrayList<>();
        ArrayList<Integer> size = new ArrayList<>();
        DisjointSet(int n ){
            for (int i = 0;i<=n;i++){
                rank.add(0);
                parent.add(i);
                size.add(1);
            }
        }
         int findUltimateParent(int node){
            if (node==parent.get(node)) return node;
            int uPar = findUltimateParent(parent.get(node));
            parent.set(node,uPar);
            return parent.get(node);
        }

        void unionByRank(int u,int v){
            int ultP_u = findUltimateParent(u);
            int ultP_v = findUltimateParent(v);

            if (ultP_u == ultP_v) return;
            if (rank.get(ultP_u)<rank.get(ultP_v)){
                parent.set(ultP_u,ultP_v);
            }
            else if (rank.get(ultP_u)>rank.get(ultP_v)){
                parent.set(ultP_v,ultP_u);
            }
            else {
                parent.set(ultP_v,ultP_u);
                rank.set(ultP_u, rank.get(ultP_u)+1);
            }
        }

        void unionBySize(int u,int v){
            int ultP_u = findUltimateParent(u);
            int ultP_v = findUltimateParent(v);

            if (ultP_u == ultP_v) return;

            if (size.get(ultP_u)<size.get(ultP_v)){
                parent.set(ultP_u,ultP_v);
                size.set(ultP_v, size.get(ultP_u)+size.get(ultP_v));
            }
            else {
                parent.set(ultP_v,ultP_u);
                size.set(ultP_u, size.get(ultP_u)+size.get(ultP_v));
            }
        }
    }
    public static void main(String[] args) {
//        DisjointSet ds = new DisjointSet(7);
//        ds.unionByRank(1,2);
//        ds.unionByRank(2,3);
//        ds.unionByRank(4,5);
//        ds.unionByRank(6,7);
//        ds.unionByRank(5,6);
//
////        if 3 and 7 belong to same component or not
//
//        if (ds.findUltimateParent(3)==ds.findUltimateParent(7)){
//            System.out.println("Same");
//        }
//        else System.out.println("Not Same");
//        ds.unionByRank(3,7);
//        if (ds.findUltimateParent(3)==ds.findUltimateParent(7)){
//            System.out.println("Same");
//        }
//        else System.out.println("Not Same");


        DisjointSet ds = new DisjointSet(7);
        ds.unionBySize(1,2);
        ds.unionBySize(2,3);
        ds.unionBySize(4,5);
        ds.unionBySize(6,7);
        ds.unionBySize(5,6);

//        if 3 and 7 belong to same component or not

        if (ds.findUltimateParent(3)==ds.findUltimateParent(7)){
            System.out.println("Same");
        }
        else System.out.println("Not Same");
        ds.unionBySize(3,7);
        if (ds.findUltimateParent(3)==ds.findUltimateParent(7)){
            System.out.println("Same");
        }
        else System.out.println("Not Same");


    }
}
