public class LongestCommonSubstring {
    // a slight change in Longest Common Subsequence Problem rest is same see the code
    //https://www.naukri.com/code360/problems/longest-common-substring_1235207?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //public class Solution {
    //    public static int lcs(String str1, String str2){
    //        int m = str1.length();
    //        int n = str2.length();
    //        int[][] dp = new int [m+1][n+1];
    //
    //        int ans = 0;
    //        for (int i = 1;i<=m;i++){
    //            for (int j = 1;j<=n;j++){
    //                if (str1.charAt(i-1)==str2.charAt(j-1)) {
    //                    dp[i][j] = 1+dp[i-1][j-1];
    //                    ans = Math.max(ans,dp[i][j]);
    //                }
    //                else dp[i][j]=0;
    //            }
    //        }
    //        return ans;
    //    }
    //}

    //public class Solution {
    //    public static int lcs(String str1, String str2){
    //        int m = str1.length();
    //        int n = str2.length();
    //        int[] prev = new int[n+1];
    //        int ans = 0;
    //        for (int i = 1;i<=m;i++){
    //        int[] curr = new int[n+1];
    //            for (int j = 1;j<=n;j++){
    //                if (str1.charAt(i-1)==str2.charAt(j-1)) {
    //                    curr[j] = 1+prev[j-1];
    //                    ans = Math.max(ans,curr[j]);
    //                }
    //                else curr[j]=0;
    //            }
    //            prev = curr;
    //        }
    //        return ans;
    //    }
    //}
}
