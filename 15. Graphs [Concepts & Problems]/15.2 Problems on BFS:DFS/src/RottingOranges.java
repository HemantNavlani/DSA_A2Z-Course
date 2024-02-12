public class RottingOranges {
    //class Solution {
    //https://www.codingninjas.com/studio/problems/rotting-oranges_701655?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/rotting-oranges/
    //
    //    // yaha pe maine kam toh shi kar diya hai but minimum time ka nhi pata ki time minimum niklega ki nhi par time jarur aayega shi vo bhi
    //    //but isme abhi bhi ek dikkat hai ki ye simultaneously rotting nhi karge ek 2 uthayega uspe kam karega and so on toh simultaneously ke liye hame pair class me time bhi rakhna padega us hissb se kam hoga
    //
    //    //you should keep an visited grid instead of modifying it as we should not modify the given data
    //    // but isme
    //    class Pair {
    //        int x;
    //        int y;
    //        int time;
    //        Pair (int x,int y,int time){
    //            this.x = x;
    //            this.y = y;
    //            this.time = time;
    //        }
    //    }
    //
    //    public int orangesRotting(int[][] grid) {
    //        int m = grid.length;
    //        int n = grid[0].length;
    //        Queue<Pair> q = new LinkedList<>();
    //        for (int i = 0;i<grid.length;i++){
    //            for (int j = 0;j<grid[i].length;j++){
    //                if (grid[i][j]==2){
    //                    q.add(new Pair(i,j,0));
    //                }
    //            }
    //        }
    //        int time = 0;
    //        while (!q.isEmpty()){
    //            Pair p = q.remove();
    //            int x = p.x;
    //            int y = p.y;
    //            time = Math.max(time,p.time);
    //            int t = time+1;
    //            if (x-1>=0 && grid[x-1][y]==1){
    //                grid[x-1][y] = 2;
    //                q.add(new Pair(x-1,y,t));
    //            }
    //            if (y-1>=0 && grid[x][y-1]==1){
    //                grid[x][y-1] = 2;
    //                q.add(new Pair(x,y-1,t));
    //            }
    //            if (y+1<n && grid[x][y+1]==1){
    //                grid[x][y+1]=2;
    //                q.add(new Pair(x,y+1,t));
    //            }
    //            if (x+1<m && grid[x+1][y]==1){
    //                grid[x+1][y]=2;
    //                q.add(new Pair(x+1,y,t));
    //            }
    //        }
    //         for (int i = 0;i<grid.length;i++){
    //            for (int j = 0;j<grid[i].length;j++){
    //                if (grid[i][j]==1){
    //                    return -1;
    //                }
    //            }
    //        }
    //        return time;
    //    }
    //}
    public static void main(String[] args) {
        System.out.println("kjncd");
    }
}
