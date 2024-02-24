public class MakingALargeIsland {
    //phle isme 2d matrix me formula lagana hai --> rowNo * columnSize + colNo
    //isko sbko disjoint set me daal do
    // fir har zero ko 1 karte jao aur size dekhte jao jo maximum aata jaye vo hamara current answer hota jayega //yaha pe hame ek set rakhnan padega kyunki ho skta hai do direction me ham jaa rahe ho aur unka parent same ho aur unhe ham do bar count karle toh dikkat ho jayegi

    //https://leetcode.com/problems/making-a-large-island/

    //https://www.codingninjas.com/studio/problems/making-the-largest-island_1381282?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
    //    class DisjointSet {
    //        ArrayList<Integer> parent = new ArrayList<>();
    //        ArrayList<Integer> size = new ArrayList<>();
    //
    //        DisjointSet(int n){
    //            for (int i = 0;i<=n;i++){
    //                parent.add(i);
    //                size.add(1);
    //            }
    //        }
    //
    //        int findUltP (int node){
    //            if (node==parent.get(node)) return node;
    //            int ultP = findUltP(parent.get(node));
    //            parent.set(node,ultP);
    //            return parent.get(node);
    //        }
    //        void unionBySize(int u, int v){
    //            int ultU = findUltP(u);
    //            int ultV = findUltP(v);
    //            if (ultU == ultV) return;
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
    //
    //
    //    public int largestIsland(int[][] grid) {
    //        int n = grid.length;
    //        DisjointSet ds = new DisjointSet(n*n);
    //        int [] dr = {-1,0,1,0};
    //        int [] dc = {0,-1,0,1};
    //
    //        // step 1 done connecting the components
    //        for (int i = 0;i<n;i++){
    //            for(int j = 0;j<n;j++){
    //                //1 1
    //                //1 1
    //                if (grid[i][j]==0) continue;
    //                for(int idx = 0;idx<4;idx++){
    //                    int newR = i + dr[idx];
    //                    int newC = j + dc[idx];
    //                    if (newR>=0 && newR < n && newC >= 0 && newC< n && grid[newR][newC]==1){
    //                        int node = i * n + j;
    //                        int newNode = newR * n + newC;
    //                        ds.unionBySize(node,newNode);
    //                    }
    //                }
    //            }
    //        }
    //        // step 2 try to convert each zero to one and find the largest island
    //        int max = 0;
    //        for (int i = 0;i<n;i++){
    //            for (int j= 0;j<n;j++){
    //                if (grid[i][j]==1) continue;
    //                HashSet<Integer> st = new HashSet<>();
    //                for(int idx = 0;idx<4;idx++){
    //                    int newR = i + dr[idx];
    //                    int newC = j + dc[idx];
    //                    if (newR>=0 && newR < n && newC >= 0 && newC< n && grid[newR][newC]==1){
    //                        int node = newR * n + newC;
    //                        st.add(ds.findUltP(node));
    //                    }
    //                }
    //                int size = 1;
    //                for (int it: st){
    //                    size += ds.size.get(it);
    //                }
    //                max = Math.max(size,max);
    //            }
    //        }
    //
    //        for (int i= 0;i<n*n;i++){
    //            max = Math.max (max,ds.size.get(ds.findUltP(i)));
    //        }
    //        return max;
    //    }
    //}
}
