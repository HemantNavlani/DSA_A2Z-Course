public class CountSquareSubmatriceswithAllOnes {
    //https://www.youtube.com/watch?v=auS1fynpnjo&ab_channel=takeUforward


    //ye tabulation hai direct hai as its tabulation is intuitive, i,j represents abhi tak kitne squares ho chuke hai uske hissab se aage ke calculation kar rahe hai ham
    //class Solution {
    //    public int countSquares(int[][] matrix) {
    //        int m = matrix.length;
    //        int n = matrix[0].length;
    //        int [][] ans = new int [m][n];
    //        for (int i = 0;i<m;i++) ans[i][0] = matrix[i][0];
    //        for (int i = 0;i<n;i++) ans[0][i] = matrix[0][i];
    //
    //        for (int i =1;i<m;i++){
    //            for (int j = 1;j<n;j++){
    //                if (matrix[i][j]==0) ans[i][j]=0;
    //                else ans[i][j] = 1+Math.min(ans[i-1][j-1],Math.min(ans[i-1][j], ans[i][j-1]));
    //            }
    //        }
    //        int res = 0;
    //        for (int i = 0;i<m;i++){
    //            for (int j = 0;j<n;j++){
    //                res+=ans[i][j];
    //            }
    //        }
    //        return res;
    //    }
    //}
}
