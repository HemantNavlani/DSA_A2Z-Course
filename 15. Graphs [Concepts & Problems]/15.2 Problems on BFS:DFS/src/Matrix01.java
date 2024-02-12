public class Matrix01 {
    //kuch nhi bfs hi hai read it you will get it if you have done previous questions of the same type
    //https://leetcode.com/problems/01-matrix/
    //https://www.codingninjas.com/studio/problems/distance-of-nearest-cell-having-1-in-a-binary-matrix_1169913?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
    //    class Point{
    //        int x;
    //        int y;
    //        int step;
    //        Point(int x, int y,int step){
    //            this.x = x;
    //            this.y = y;
    //            this.step = step;
    //        }
    //    }
    //    public int[][] updateMatrix(int[][] mat) {
    //        int m = mat.length;
    //        int n = mat[0].length;
    //        int [][] visited = new int[m][n];
    //        int [][] distance = new int[m][n];
    //        Queue<Point> q = new LinkedList<>();
    //        for (int i = 0;i<m;i++){
    //            for(int j = 0;j<n;j++){
    //                if (mat[i][j]==0){
    //                    visited[i][j]=1;
    //                    distance[i][j]=0;
    //                    q.add(new Point(i,j,0));
    //                }
    //            }
    //        }
    //        while (q.size()!=0){
    //            Point p = q.remove();
    //            int x = p.x;
    //            int y = p.y;
    //            int step = p.step;
    //            if (x-1>=0 && visited[x-1][y]==0){
    //                visited[x-1][y] = 1;
    //                distance[x-1][y] = step+1;
    //                q.add(new Point(x-1,y,step+1));
    //            }
    //            if (y-1>=0 && visited[x][y-1]==0){
    //                visited[x][y-1] = 1;
    //                distance[x][y-1] = step+1;
    //                q.add(new Point(x,y-1,step+1));
    //            }
    //            if (x+1<m && visited[x+1][y]==0){
    //                visited[x+1][y] = 1;
    //                distance[x+1][y] = step+1;
    //                q.add(new Point(x+1,y,step+1));
    //            }
    //            if (y+1<n && visited[x][y+1]==0){
    //                visited[x][y+1] = 1;
    //                distance[x][y+1] = step+1;
    //                q.add(new Point(x,y+1,step+1));
    //            }
    //        }
    //        return distance;
    //    }
    //}
}
