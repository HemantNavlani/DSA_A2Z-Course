public class DistinctSubsequences {
    //https://leetcode.com/problems/distinct-subsequences/
    //https://www.naukri.com/code360/problems/subsequence-counting_3755256?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    //memoization
    //class Solution {
    //    public int numDistinct(String s, String t) {
    //        int m = s.length();
    //        int n = t.length();
    //        int[][] dp= new int[m][n];
    //        for (int i = 0;i<m;i++){
    //            for (int j = 0;j<n;j++){
    //                dp[i][j]=-1;
    //            }
    //        }
    //        return solver(m-1,n-1,s,t,dp);
    //    }
    //    int solver(int i,int j,String s, String t,int[][]dp){
    //        if (j<0) return 1;
    //        if (i<0) return 0;
    //        if (dp[i][j]!=-1) return dp[i][j];
    //        if (s.charAt(i)==t.charAt(j)) return dp[i][j] =  solver(i-1,j-1,s,t,dp) + solver(i-1,j,s,t,dp);
    //        else return dp[i][j] = solver(i-1,j,s,t,dp);
    //    }
    //}


    //tabulation
    //class Solution {
    //    public int numDistinct(String s, String t) {
    //        int m = s.length();
    //        int n = t.length();
    //        int[][] dp= new int[m+1][n+1];
    //        for(int j = 0;j<n;j++) dp[0][j]=0;
    //        for(int i = 0;i<m;i++) dp[i][0]=1;
    //
    //        for (int i = 1;i<=m;i++){
    //            for (int j = 1;j<=n;j++){
    //                if (s.charAt(i-1)==t.charAt(j-1)) dp[i][j]=dp[i-1][j-1] + dp[i-1][j];
    //                else dp[i][j] = dp[i-1][j];
    //            }
    //        }
    //        return dp[m][n];
    //    }
    //}

    //space optimised
    //class Solution {
    //    public int numDistinct(String s, String t) {
    //        int m = s.length();
    //        int n = t.length();
    //        int[] dp= new int[n+1];
    //        dp[0]=1;
    //        for (int i = 1;i<=m;i++){
    //            int [] cur = new int[n+1];
    //            cur[0]=1;
    //            for (int j = 1;j<=n;j++){
    //                if (s.charAt(i-1)==t.charAt(j-1)) cur[j]=dp[j-1]+dp[j];
    //                else cur[j] = dp[j];
    //            }
    //            dp = cur;
    //        }
    //        return dp[n];
    //    }
    //}

    //one 1d array --> more space optimised
    //class Solution {
    //    public int numDistinct(String s, String t) {
    //        int m = s.length();
    //        int n = t.length();
    //        int[] dp= new int[n+1];
    //        dp[0]=1;
    //        for (int i = 1;i<=m;i++){
    //            for (int j = n;j>=1;j--){
    //                if (s.charAt(i-1)==t.charAt(j-1)) dp[j]=dp[j-1]+dp[j];
    //            }
    //        }
    //        return dp[n];
    //    }
    //}
}
