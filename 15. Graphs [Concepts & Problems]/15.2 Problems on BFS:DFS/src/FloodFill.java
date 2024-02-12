public class FloodFill {
    //https://leetcode.com/problems/flood-fill/
    //https://www.codingninjas.com/studio/problems/flood-fill-_1082141?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //class Solution {
    //    public class Pair{
    //        int x;
    //        int y;
    //        Pair(int x,int y){
    //            this.x = x;
    //            this.y = y;
    //        }
    //    }
    //
    //    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    //        if (image[sr][sc]==color) return image;
    //        int m = image.length;
    //        int n = image[0].length;
    //        Queue<Pair> q = new LinkedList<>();
    //        q.add(new Pair(sr,sc));
    //        int check = image[sr][sc];
    //        image[sr][sc] = color;
    //
    //        while (q.size()!=0){
    //            Pair p = q.remove();
    //            int x = p.x;
    //            int y = p.y;
    //            if (image[x][y] != color) continue;
    //            if (x-1>=0 && image[x-1][y]==check){
    //                image[x-1][y] = color;
    //                q.add(new Pair(x-1,y));
    //            }
    //            if (y-1>=0 && image[x][y-1]==check){
    //                image[x][y-1] = color;
    //                q.add(new Pair(x,y-1));
    //            }
    //            if (x+1<m && image[x+1][y]==check){
    //                image[x+1][y] = color;
    //                q.add(new Pair(x+1,y));
    //            }
    //            if (y+1<n && image[x][y+1]==check){
    //                image[x][y+1] = color;
    //                q.add(new Pair(x,y+1));
    //            }
    //        }
    //        return image;
    //    }
    //}
}
