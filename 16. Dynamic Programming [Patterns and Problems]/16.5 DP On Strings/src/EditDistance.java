public class EditDistance {

    //see the recursion you will get it

    //recursion
    //class Solution {
    //    public int minDistance(String word1, String word2) {
    //        int m = word1.length();
    //        int n = word2.length();
    //        return solver(m-1,n-1,word1,word2);
    //    }
    //    int solver(int i, int j, String s1, String s2){
    //        if (i<0) return j+1;
    //        if (j<0) return i+1;
    //        if (s1.charAt(i)==s2.charAt(j)) return solver(i-1,j-1,s1,s2);
    //        else {
    //            return Math.min(1+solver(i,j-1,s1,s2),Math.min(1+solver(i-1,j-1,s1,s2),1+solver(i-1,j,s1,s2)));
    //        }
    //    }
    //}


    //memoized
    //class Solution {
    //    public int minDistance(String word1, String word2) {
    //        int m = word1.length();
    //        int n = word2.length();
    //        int [][] dp = new int[m][n];
    //        for (int i = 0;i<m;i++){
    //            for (int j = 0;j<n;j++){
    //                dp[i][j]=-1;
    //            }
    //        }
    //        return solver(m-1,n-1,word1,word2,dp);
    //    }
    //    int solver(int i, int j, String s1, String s2,int[][]dp){
    //        if (i<0) return j+1;
    //        if (j<0) return i+1;
    //        if (dp[i][j]!=-1) return dp[i][j];
    //        if (s1.charAt(i)==s2.charAt(j)) return dp[i][j]=solver(i-1,j-1,s1,s2,dp);
    //        else {
    //            return dp[i][j]=Math.min(1+solver(i,j-1,s1,s2,dp),Math.min(1+solver(i-1,j-1,s1,s2,dp),1+solver(i-1,j,s1,s2,dp)));
    //        }
    //    }
    //}


    //tabulation
    //class Solution {
    //    public int minDistance(String s1, String s2) {
    //        int m = s1.length();
    //        int n = s2.length();
    //        int [][] dp = new int[m+1][n+1];
    //        for (int j = 0;j<=n;j++) dp[0][j]=j;
    //        for (int i = 0;i<=m;i++) dp[i][0]=i;
    //
    //        for (int i = 1;i<=m;i++){
    //            for (int j = 1;j<=n;j++){
    //                if (s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]= dp[i-1][j-1];
    //                else {
    //                    dp[i][j]=Math.min(1+dp[i][j-1],Math.min(1+dp[i-1][j-1],1+dp[i-1][j]));
    //                }
    //            }
    //        }
    //        return dp[m][n];
    //    }
    //}

    //space optimised
    //class Solution {
    //    public int minDistance(String s1, String s2) {
    //        int m = s1.length();
    //        int n = s2.length();
    //        int [] dp = new int[n+1];
    //        for (int j = 0;j<=n;j++) dp[j]=j;
    //
    //        for (int i = 1;i<=m;i++){
    //            int[] cur = new int[n+1];
    //            cur[0]=i;
    //            for (int j = 1;j<=n;j++){
    //                if (s1.charAt(i-1)==s2.charAt(j-1)) cur[j]= dp[j-1];
    //                else {
    //                    cur[j]=1+Math.min(cur[j-1],Math.min(dp[j-1],dp[j]));
    //                }
    //            }
    //            dp=cur;
    //        }
    //        return dp[n];
    //    }
    //}

}
