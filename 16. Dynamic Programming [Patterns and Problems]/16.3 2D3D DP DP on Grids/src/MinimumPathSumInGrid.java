public class MinimumPathSumInGrid {

    //https://www.naukri.com/code360/problems/minimum-path-sum_985349?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/minimum-path-sum/submissions/1218375922/
    //class Solution {
    //    public int minPathSum(int[][] grid) {
    //        int m = grid.length;
    //        int n = grid[0].length;
    //        return solver(m-1,n-1,grid);
    //    }
    //    int solver(int i,int j,int[][] grid){
    //        if (i==0 && j==0) return grid[i][j];
    //        int up = Integer.MAX_VALUE;
    //        if (i-1>=0) up = grid[i][j] + solver(i-1,j,grid);
    //        int left = Integer.MAX_VALUE;
    //        if (j-1>=0) left = grid[i][j] + solver(i,j-1,grid);
    //        return Math.min(left,up);
    //    }
    //}

    //class Solution {
    //    public int minPathSum(int[][] grid) {
    //        int m = grid.length;
    //        int n = grid[0].length;
    //        int [][] dp = new int[m][n];
    //        for (int i=0;i<m;i++){
    //            for (int j = 0;j<n;j++) dp[i][j] = -1;
    //        }
    //        return solver(m-1,n-1,grid,dp);
    //    }
    //    int solver(int i,int j,int[][] grid,int[][]dp){
    //        if (i==0 && j==0) return grid[i][j];
    //        if (dp[i][j]!=-1) return dp[i][j];
    //        int up = Integer.MAX_VALUE;
    //        if (i-1>=0) up = grid[i][j] + solver(i-1,j,grid,dp);
    //        int left = Integer.MAX_VALUE;
    //        if (j-1>=0) left = grid[i][j] + solver(i,j-1,grid,dp);
    //        return dp[i][j] = Math.min(left,up);
    //    }
    //}

    //class Solution {
    //    public int minPathSum(int[][] grid) {
    //        int m = grid.length;
    //        int n = grid[0].length;
    //        int [][] dp = new int[m][n];
    //        for (int i=0;i<m;i++){
    //            for (int j = 0;j<n;j++) {
    //                if (i==0 && j==0) dp[i][j] = grid[i][j];
    //                else{
    //                    int up = Integer.MAX_VALUE;
    //                    if (i-1>=0) up = grid[i][j] + dp[i-1][j];
    //                    int left = Integer.MAX_VALUE;
    //                    if (j-1>=0) left = grid[i][j] + dp[i][j-1];
    //                    dp[i][j] = Math.min(left,up);
    //                }
    //            }
    //        }
    //        return dp[m-1][n-1];
    //    }
    //}

    //class Solution {
    //    public int minPathSum(int[][] grid) {
    //        int m = grid.length;
    //        int n = grid[0].length;
    //        int[] prev = new int[n];
    //        for (int i=0;i<m;i++){
    //            int[] temp = new int[n];
    //            for (int j = 0;j<n;j++) {
    //                if (i==0 && j==0) temp[j] = grid[i][j];
    //                else{
    //                    int up = Integer.MAX_VALUE;
    //                    if (i-1>=0) up = grid[i][j] + prev[j];
    //                    int left = Integer.MAX_VALUE;
    //                    if (j-1>=0) left = grid[i][j] + temp[j-1];
    //                    temp[j] = Math.min(left,up);
    //                }
    //            }
    //            prev = temp;
    //        }
    //        return prev[n-1];
    //    }
    //}
}
