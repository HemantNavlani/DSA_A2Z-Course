public class SwimInRisingWater {

//    kuch nhi simple djkistra hi lagana hai min heap me dalte jaana hai aur min height aati rahegi agar destination pahuch gaye toh return that minimum
//    baaki read the code

    //https://leetcode.com/problems/swim-in-rising-water/

    //https://www.codingninjas.com/studio/problems/minimum-time_8360128?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//    class Solution {
//    class Tuple {
//        int height;
//        int x;
//        int y;
//        Tuple(int height,int x,int y){
//            this.height = height;
//            this.x = x;
//            this.y = y;
//        }
//    }
//    public boolean isValid (int newR, int newC, int n){
//        return newR<n && newR>=0 && newC<n && newC>=0;
//    }
//    public int swimInWater(int[][] grid) {
//        int n = grid.length;
//        int min = grid[0][0];
//        int [][] visited = new int[n][n];
//        PriorityQueue<Tuple> pq = new PriorityQueue<>((a,b)->a.height-b.height);
//        pq.add(new Tuple(grid[0][0],0,0));
//        int [] dr = {-1,0,1,0};
//        int [] dc = {0,1,0,-1};
//
//        while (!pq.isEmpty()){
//            Tuple t = pq.remove();
//            int height = t.height;
//            int x = t.x;
//            int y = t.y;
//            min = height;
//            visited[x][y]=1;
//            if (x==n-1 && y==n-1) return min;
//
//            for (int i = 0;i<4;i++){
//                int newR = x + dr[i];
//                int newC = y + dc[i];
//                if (isValid(newR, newC, n) && visited[newR][newC]!=1){
//                    int newH = Math.max(height,grid[newR][newC]);
//                    pq.add(new Tuple(newH,newR,newC));
//                }
//            }
//        }
//        return min;
//    }
//}
}
