import java.util.Arrays;

public class GridUniquePaths {

    //https://leetcode.com/problems/unique-paths/submissions/1217900664/
//    https://www.naukri.com/code360/problems/unique-paths_1081470?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //recursion
    //TC = O(2^m*n)
    // SC = O(path length)
    //class Solution {
    //    public int uniquePaths(int m, int n) {
    //        return solver (m-1,n-1);
    //    }
    //    int solver (int i, int j){
    //        if (i==0 && j==0) return 1;
    //        int up = 0;
    //        if (i-1>=0) up = solver(i-1,j);
    //        int left = 0;
    //        if (j-1>=0) left = solver(i,j-1);
    //        return up + left;
    //    }
    //}


    //memoization

    //TC O(N*M )
    //SC O(n-1 + m- 1) + O(N*M )
    //class Solution {
    //    public int uniquePaths(int m, int n) {
    //        int [][] dp = new int[m][n];
    //        for (int i =0;i<m;i++){
    //            for (int j = 0;j<n;j++){
    //                dp[i][j] = -1;
    //            }
    //        }
    //        return solver (m-1,n-1,dp);
    //    }
    //    int solver (int i, int j,int[][]dp){
    //        if (i==0 && j==0) return 1;
    //        if (dp[i][j] != -1) return dp[i][j];
    //        int up = 0;
    //        if (i-1>=0) up = solver(i-1,j,dp);
    //        int left = 0;
    //        if (j-1>=0) left = solver(i,j-1,dp);
    //        return dp[i][j] = up + left;
    //    }
    //}

    //tabulation
//    TC O (n*m)
    //    SC O (n*m)
    //class Solution {
    //    public int uniquePaths(int m, int n) {
    //        int [][] dp = new int[m][n];
    //        for (int i = 0;i<n;i++) dp[0][i]=1;
    //        for (int i = 0;i<m;i++) dp[i][0]=1;
    //
    //        for (int i = 1;i<m;i++){
    //            for (int j = 1;j<n;j++){
    //                int up = 0;
    //                if (i-1>=0) up = dp[i-1][j];
    //                int left = 0;
    //                if (j-1>=0) left = dp[i][j-1];
    //                dp[i][j] = up+left;
    //            }
    //        }
    //        return dp[m-1][n-1];
    //    }
    //}

    //space optimised
    ////    TC O (n*m)
    //    //    SC O (n)
    //class Solution {
    //    public int uniquePaths(int m, int n) {
    //        int[] prev = new int [n];
    //        for (int i = 0;i<n;i++) prev[i]=0;
    //
    //
    //        for (int i = 0;i<m;i++){
    //            int[] temp = new int[n];
    //            for (int j = 0;j<n;j++){
    //                if (i==0 && j==0) temp[j] = 1;
    //                else {
    //                    int up = 0;
    //                    if (i-1>=0) up = prev[j];
    //                    int left = 0;
    //                    if (j-1>=0) left = temp[j-1];
    //                    temp[j] = up+left;
    //                }
    //            }
    //            prev = temp;
    //        }
    //        return prev[n-1];
    //    }
    //}
}
