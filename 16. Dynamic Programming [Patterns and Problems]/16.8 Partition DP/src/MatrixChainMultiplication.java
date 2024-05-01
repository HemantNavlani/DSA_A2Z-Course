public class MatrixChainMultiplication {
    //https://www.naukri.com/code360/problems/matrix-chain-multiplication_624880?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

    // public class Solution {
// 	public static int mcm(int[] p){
// 		int n = p.length;
// 		return solver(1,n-1,p);
// 	}
// 	static int solver (int i,int j, int[]p){
// 		if (i==j) return 0;

// 		int min = (int)1e9;
// 		for (int k = i;i<=j-1;i++){
// 			int steps = p[i-1] * p[k] * p[j] + solver(i,k,p) + solver(k+1,j,p);
// 			min = Math.min(min,steps);
// 		}
// 		return min;
// 	}
// }

// public class Solution {
// 	public static int mcm(int[] p){
// 		int n = p.length;
// 		int [][] dp = new int [n][n];
// 		for (int i = 0;i<n;i++){
// 			for (int j = 0;j<n;j++) dp[i][j]=-1;
// 		}
// 		return solver(1,n-1,p,dp);
// 	}
// 	static int solver (int i,int j, int[]p,int[][]dp){
// 		if (i==j) return 0;
// 		if (dp[i][j]!=-1) return dp[i][j];
// 		int min = (int)1e9;
// 		for (int k = i;i<=j-1;i++){
// 			int steps = p[i-1] * p[k] * p[j] + solver(i,k,p) + solver(k+1,j,p);
// 			min = Math.min(min,steps);
// 		}
// 		return dp[i][j] = min;
// 	}
// }

}