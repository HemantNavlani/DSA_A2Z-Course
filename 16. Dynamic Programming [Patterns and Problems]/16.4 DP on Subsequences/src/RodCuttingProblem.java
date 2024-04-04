public class RodCuttingProblem {

    //https://www.naukri.com/code360/problems/rod-cutting-problem_800284?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    
    //public class Solution {
    //	public static int cutRod(int price[], int n) {
    //
    //		//try to pick lengths in all possible ways and try to make it n
    //		return solver(n-1,n,price);
    //	}
    //	static int solver(int idx,int n,int[]price){
    //		if (idx==0) return n*price[0];
    //		int pick = (int) -1e9;
    //		int rodLen = idx+1;
    //		if (rodLen<=n) pick = price[idx] + solver(idx,n-rodLen,price);
    //		int notPick = solver(idx-1,n,price);
    //		return Math.max(pick,notPick);
    //	}
    //}

    //public class Solution {
    //	public static int cutRod(int price[], int n) {
    //
    //		//try to pick lengths in all possible ways and try to make it n
    //
    //		int[][] dp = new int [n][n+1];
    //		for (int i = 0;i<n;i++){
    //			for (int j= 0;j<=n;j++){
    //				dp[i][j] = -1;
    //			}
    //		}
    //		return solver(n-1,n,price,dp);
    //	}
    //	static int solver(int idx,int n,int[]price,int[][]dp){
    //		if (idx==0) return n*price[0];
    //		if (dp[idx][n]!=-1) return dp[idx][n];
    //		int pick = (int) -1e9;
    //		int rodLen = idx+1;
    //		if (rodLen<=n) pick = price[idx] + solver(idx,n-rodLen,price,dp);
    //		int notPick = solver(idx-1,n,price,dp);
    //		return dp[idx][n] = Math.max(pick,notPick);
    //	}
    //}

    //public class Solution {
    //	public static int cutRod(int price[], int n) {
    //
    //		//try to pick lengths in all possible ways and try to make it n
    //
    //		int[][] dp = new int [n][n+1];
    //
    //		for (int i= 0;i<=n;i++) dp[0][i] = i*price[0];
    //
    //		for (int i = 1;i<n;i++){
    //			for (int j= 0;j<=n;j++){
    //				int pick = (int) -1e9;
    //				int rodLen = i+1;
    //				if (rodLen<=j) pick = price[i] + dp[i][j-rodLen];
    //				int notPick = dp[i-1][j];
    //				dp[i][j] = Math.max(pick,notPick);
    //			}
    //		}
    //		return dp[n-1][n];
    //	}
    //}

    //public class Solution {
    //	public static int cutRod(int price[], int n) {
    //
    //		//try to pick lengths in all possible ways and try to make it n
    //
    //		int[]dp = new int [n+1];
    //
    //		for (int i= 0;i<=n;i++) dp[i] = i*price[0];
    //
    //		for (int i = 1;i<n;i++){
    //			int[] cur = new int[n+1];
    //			for (int j= 0;j<=n;j++){
    //				int pick = (int) -1e9;
    //				int rodLen = i+1;
    //				if (rodLen<=j) pick = price[i] + cur[j-rodLen];
    //				int notPick = dp[j];
    //				cur[j] = Math.max(pick,notPick);
    //			}
    //			dp = cur;
    //		}
    //		return dp[n];
    //	}
    //}


    //public class Solution {
    //	public static int cutRod(int price[], int n) {
    //
    //		//try to pick lengths in all possible ways and try to make it n
    //
    //		int[]dp = new int [n+1];
    //
    //		for (int i= 0;i<=n;i++) dp[i] = i*price[0];
    //
    //		for (int i = 1;i<n;i++){
    //			for (int j= 0;j<=n;j++){
    //				int pick = (int) -1e9;
    //				int rodLen = i+1;
    //				if (rodLen<=j) pick = price[i] + dp[j-rodLen];
    //				int notPick = dp[j];
    //				dp[j] = Math.max(pick,notPick);
    //			}
    //		}
    //		return dp[n];
    //	}
    //}
}
