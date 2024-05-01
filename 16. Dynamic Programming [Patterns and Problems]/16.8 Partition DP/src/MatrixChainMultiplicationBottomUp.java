public class MatrixChainMultiplicationBottomUp {
    //https://www.naukri.com/code360/problems/matrix-chain-multiplication_624880?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//    public class Solution {
//        public static int mcm(int[] p){
//            int n = p.length;
//            int [][] dp = new int [n][n];
//            for (int i = 1;i<n;i++) dp[i][i]=0;
//
//            for (int i =n-1;i>=1;i--){
//                for (int j = i+1;j<n;j++){
//                    int min = (int)1e9;
//                    for (int k = i;k<j;k++){
//                        int steps = p[i-1] * p[k] * p[j] + dp[i][k] + dp[k+1][j];
//                        min = Math.min(min,steps);
//                    }
//                    dp[i][j] = min;
//                }
//            }
//            return dp[1][n-1];
//        }
//    }
}
