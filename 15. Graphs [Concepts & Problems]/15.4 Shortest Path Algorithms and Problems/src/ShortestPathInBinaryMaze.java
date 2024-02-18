public class ShortestPathInBinaryMaze {
    //yaha pe bhi jam Djisktra hi lagana hai vo hi lenge bas distance array 2D hoga
    // aur yaha pe ham priority queue ki jagah khali queue bhi le skte hai kyunki queue bhi yaha already sorted me hi items ko rakhegi so we can avoid the extra time complexity of log N which is used by the queue
    //https://www.codingninjas.com/studio/problems/shortest-path-in-a-binary-maze_893065?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION


    ///*************************************
    //
    //Following is the Point Class structure
    //
    //class Point {
    //	int x;
    //	int y;
    //
    //	Point(int x, int y) {
    //		this.x = x;
    //		this.y = y;
    //	}
    //}
    //
    //**************************************/
    //import java.util.*;
    //class Pair {
    //	int x;
    //	int y;
    //	int distance;
    //	Pair(int x, int y, int distance){
    //		this.x = x;
    //		this.y = y;
    //		this.distance =distance;
    //	}
    //}
    //public class Solution {
    //	public static int shortestPathBinaryMatrix(int[][] matrix, Point src, Point dest) {
    //		if (matrix[src.x][src.y] ==0) return -1;
    //		if (src.x == dest.x && src.y == dest.y) return 0;
    //
    //		int n = matrix.length;
    //		int m = matrix[0].length;
    //		int [][] distance = new int[n][m];
    //		for (int i = 0;i<n;i++){
    //			for (int j = 0;j<m;j++) distance[i][j] =(int) 1e7;
    //		}
    //		Queue<Pair> q = new LinkedList<>();
    //		q.add(new Pair(src.x,src.y,0));
    //		distance[src.x][src.y] = 0;
    //		int []drow= {-1,0,1,0};
    //		int []dcol= {0,1,0,-1};
    //
    //		while (q.size()!=0){
    //			Pair pair = q.remove();
    //			int x = pair.x;
    //			int y = pair.y;
    //			int distanc = pair.distance;
    //
    //			for (int i = 0;i<4;i++){
    //				int newR = x + drow[i];
    //				int newC = y + dcol[i];
    //
    //				if (newR>=0 &&
    //				newR<n &&
    //				newC>=0 &&
    //				newC<m &&
    //				(matrix[newR][newC]==1) &&
    //				 (distanc+1)<(distance[newR][newC])){
    //					distance[newR][newC] = distanc+1;
    //					if (newR == dest.x && newC==dest.y) return distanc+1;
    //					q.add(new Pair(newR,newC,distanc+1));
    //				}
    //			}
    //		}
    //		return -1;
    //
    //	}
    //}


    //https://leetcode.com/problems/shortest-path-in-binary-matrix/
    //ye leetcode vala thoda alag variant hai bas isme all 8 directions me ghoomna hai aur 1 ki jagah zero pe visit karna hai
    //class Solution {
    //    class Pair {
    //        int x;
    //        int y;
    //        int distance;
    //        Pair (int x,int y,int distance){
    //            this.x = x;
    //            this.y = y;
    //            this.distance = distance;
    //        }
    //    }
    //    public int shortestPathBinaryMatrix(int[][] grid) {
    //        int n = grid.length;
    //        if (grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
    //        int[][] distance = new int[n][n];
    //        for (int i = 0;i<n;i++){
    //            for (int j= 0;j<n;j++){
    //                distance[i][j] = (int) 1e7;
    //            }
    //        }
    //        int[] row = {-1,0,1,0};
    //        int[] col = {0,1,0,-1};
    //
    //        int[] diagR = {-1,-1,+1,+1};
    //        int[] diagC = {-1,+1,-1,+1};
    //
    //        Queue<Pair> q = new LinkedList<>();
    //        q.add(new Pair(0,0,0));
    //        distance[0][0] = 0;
    //        while (q.size()!=0){
    //            Pair p = q.remove();
    //            int x = p.x;
    //            int y = p.y;
    //            int dist = p.distance;
    //            if (x==n-1 && y==n-1) return dist+1;
    //            for (int i = 0;i<4;i++){
    //                int newR = x+row[i];
    //                int newC = y+col[i];
    //                if (newR>=0 && newR<n && newC>=0 && newC<n && grid[newR][newC]==0 && (dist+1)<distance[newR][newC]){
    //                    distance[newR][newC] = dist+1;
    //                    q.add(new Pair(newR,newC,dist+1));
    //                    if(newR==n-1 && newC == n-1) return distance[newR][newC]+1;
    //                }
    //                newR = x + diagR[i];
    //                newC = y + diagC[i];
    //                if (newR>=0 && newR<n && newC>=0 && newC<n && grid[newR][newC]==0 && dist+1<distance[newR][newC]){
    //                    distance[newR][newC] = dist+1;
    //                    if(newR==n-1 && newC == n-1) return distance[newR][newC]+1;
    //                    q.add(new Pair(newR,newC,dist+1));
    //                }
    //            }
    //        }
    //         return -1;
    //    }
    //}
}
