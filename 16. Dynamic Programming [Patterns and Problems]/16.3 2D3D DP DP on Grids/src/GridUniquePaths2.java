public class GridUniquePaths2 {
    //https://leetcode.com/problems/unique-paths-ii/
    //https://www.naukri.com/code360/problems/unique-paths-ii_977241?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //recursion
    //class Solution {
    //    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    //        int m = obstacleGrid.length;
    //        int n = obstacleGrid[0].length;
    //        if (obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1) return 0;
    //        return solver (m-1,n-1,obstacleGrid);
    //    }
    //    int solver(int i,int j,int[][] grid){
    //        if (i==0 && j==0) return 1;
    //        if (grid[i][j]==1) return 0;
    //        int up = 0;
    //        if (i-1>=0) up = solver(i-1,j,grid,dp);
    //        int left = 0;
    //        if (j-1>=0) left = solver(i,j-1,grid,dp);
    //        return up + left;
    //    }
    //}

    //memoization
    //class Solution {
    //    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    //        int m = obstacleGrid.length;
    //        int n = obstacleGrid[0].length;
    //        if (obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1) return 0;
    //        int [][] dp = new int[m][n];
    //        for (int i =0;i<m;i++){
    //            for (int j = 0;j<n;j++) dp[i][j] = -1;
    //        }
    //        return solver (m-1,n-1,obstacleGrid,dp);
    //    }
    //    int solver(int i,int j,int[][] grid,int[][] dp){
    //        if (i==0 && j==0) return 1;
    //        if (grid[i][j]==1) return 0;
    //        if (dp[i][j]!=-1) return dp[i][j];
    //        int up = 0;
    //        if (i-1>=0) up = solver(i-1,j,grid,dp);
    //        int left = 0;
    //        if (j-1>=0) left = solver(i,j-1,grid,dp);
    //        return dp[i][j] = up + left;
    //    }
    //}

    //tabulation
    //class Solution {
    //    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    //        int m = obstacleGrid.length;
    //        int n = obstacleGrid[0].length;
    //        if (obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1) return 0;
    //        int [][] dp = new int[m][n];
    //        for (int i =0;i<m;i++){
    //            for (int j = 0;j<n;j++) {
    //                if (i==0 && j==0) dp[i][j] = 1;
    //                else if (obstacleGrid[i][j]==1) dp[i][j] =0;
    //                else {
    //                    int up = 0;
    //                    if (i-1>=0) up = dp[i-1][j];
    //                    int left = 0;
    //                    if (j-1>=0) left = dp[i][j-1];
    //                    dp[i][j] = up + left;
    //                }
    //            }
    //        }
    //        return dp[m-1][n-1];
    //    }
    //}


    //space optimised
    //class Solution {
    //    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    //        int m = obstacleGrid.length;
    //        int n = obstacleGrid[0].length;
    //        if (obstacleGrid[0][0]==1 || obstacleGrid[m-1][n-1]==1) return 0;
    //
    //        int [] prev = new int[n];
    //        for (int i =0;i<m;i++){
    //            int [] temp = new int[n];
    //            for (int j = 0;j<n;j++) {
    //                if (i==0 && j==0) temp[j] = 1;
    //                else if (obstacleGrid[i][j]==1) temp[j] =0;
    //                else {
    //                    int up = 0;
    //                    if (i-1>=0) up = prev[j];
    //                    int left = 0;
    //                    if (j-1>=0) left = temp[j-1];
    //                    temp[j] = up + left;
    //                }
    //            }
    //            prev = temp;
    //        }
    //        return prev[n-1];
    //    }
    //}
}
