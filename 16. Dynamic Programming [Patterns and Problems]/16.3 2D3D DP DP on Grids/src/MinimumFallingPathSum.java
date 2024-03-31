public class MinimumFallingPathSum {
    //https://www.naukri.com/code360/problems/maximum-path-sum-in-the-matrix_797998?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/minimum-falling-path-sum/

//class Solution {
//   public int minFallingPathSum(int[][] matrix) {
//       int n = matrix.length;
//       int min = Integer.MAX_VALUE;
//       for (int i =0;i<n;i++){
//           min = Math.min(min,solver(n-1,i,matrix,n));
//       }
//       return min;
//   }
//   int solver(int i,int j, int[][] matrix,int n){
//       if (j<0 || j>=n) return (int)1e9;
//       if (i==0) return matrix[i][j];
//       int down = matrix[i][j] + solver(i-1,j,matrix,n);
//       int right = matrix[i][j] + solver(i-1,j+1,matrix,n);
//       int left = matrix[i][j] + solver(i-1,j-1,matrix,n);
//       return Math.min(down,Math.min(left,right));
//   }
//}

 //class Solution {
    //   public int minFallingPathSum(int[][] matrix) {
    //       int n = matrix.length;
    //       int min = Integer.MAX_VALUE;
    //        int[][] dp = new int[n][n];
    //           for (int a = 0;a<n;a++){
    //            for (int j = 0;j<n;j++) dp[a][j] = -1;
    //           }
    //       for (int i =0;i<n;i++){
    //           min = Math.min(min,solver(n-1,i,matrix,n,dp));
    //       }
    //       return min;
    //   }
    //   int solver(int i,int j, int[][] matrix,int n,int[][] dp ){
    //       if (j<0 || j>=n) return (int)1e9;
    //       if (i==0) return matrix[i][j];
    //       if (dp[i][j]!=-1) return dp[i][j];
    //       int down = matrix[i][j] + solver(i-1,j,matrix,n,dp);
    //       int right = matrix[i][j] + solver(i-1,j+1,matrix,n,dp);
    //       int left = matrix[i][j] + solver(i-1,j-1,matrix,n,dp);
    //       return dp[i][j] =  Math.min(down,Math.min(left,right));
    //   }
    //}

    //class Solution {
    //    public int minFallingPathSum(int[][] matrix) {
    //        int n = matrix.length;
    //        int[][] dp = new int[n][n];
    //        for (int i = 0; i < n; i++) dp[0][i] = matrix[0][i];
    //        for (int i = 1; i < n; i++) {
    //            for (int j = 0; j < n; j++) {
    //                int down = Integer.MAX_VALUE;
    //                if (i-1>=0) down = matrix[i][j] + dp[i - 1][j];
    //                int right = Integer.MAX_VALUE;
    //                if (i-1>=0 && j+1<n) right = matrix[i][j] + dp[i -1][j + 1];
    //                int left = Integer.MAX_VALUE;
    //                if (i-1>=0 && j-1>=0) left = matrix[i][j] + dp[i - 1][j - 1];
    //                dp[i][j] = Math.min(down, Math.min(left, right));
    //            }
    //        }
    //        int min =  dp[n-1][0];
    //        for (int i = 0;i<n;i++){
    //            min = Math.min(min,dp[n-1][i]);
    //        }
    //        return min;
    //    }
    //}

    //class Solution {
    //    public int minFallingPathSum(int[][] matrix) {
    //        int n = matrix.length;
    //        int[] prev = new int[n];
    //        for (int i = 0; i < n; i++) prev[i] = matrix[0][i];
    //        for (int i = 1; i < n; i++) {
    //            int []temp = new int [n];
    //            for (int j = 0; j < n; j++) {
    //                int down = Integer.MAX_VALUE;
    //                if (i-1>=0) down = matrix[i][j] + prev[j];
    //                int right = Integer.MAX_VALUE;
    //                if (i-1>=0 && j+1<n) right = matrix[i][j] + prev[j + 1];
    //                int left = Integer.MAX_VALUE;
    //                if (i-1>=0 && j-1>=0) left = matrix[i][j] + prev[j - 1];
    //                temp[j] = Math.min(down, Math.min(left, right));
    //            }
    //            prev = temp;
    //        }
    //        int min =  prev[0];
    //        for (int i = 0;i<n;i++){
    //            min = Math.min(min,prev[i]);
    //        }
    //        return min;
    //    }
    //}


}
