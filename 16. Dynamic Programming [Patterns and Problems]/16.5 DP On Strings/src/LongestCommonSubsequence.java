import java.util.Collections;

public class LongestCommonSubsequence {
    //https://www.naukri.com/code360/problems/longest-common-subsequence_624879?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //https://leetcode.com/problems/longest-common-subsequence/description/
  //class Solution {
    //    public int longestCommonSubsequence(String text1, String text2) {
    //        return solver(text1.length()-1,text2.length()-1,text1,text2);
    //    }
    //    int solver(int i1,int i2, String s1,String s2){
    //        if (i1<0 || i2<0) return 0;
    //        if (s1.charAt(i1)==s2.charAt(i2)) return 1 + solver(i1-1,i2-1,s1,s2);
    //        return Math.max(solver(i1,i2-1,s1,s2),solver(i1-1,i2,s1,s2));
    //    }
    //}

    //class Solution {
    //    public int longestCommonSubsequence(String text1, String text2) {
    //        int n1 = text1.length();
    //        int n2 = text2.length();
    //        int[][] dp = new int[n1+1][n2+1];
    //        for (int i =0;i<=n1;i++){
    //            for (int j = 0;j<=n2;j++){
    //                dp[i][j] = -1;
    //            }
    //        }
    //        return solver(n1-1,n2-1,text1,text2,dp);
    //    }
    //    int solver(int i1,int i2, String s1,String s2,int[][]dp){
    //        if (i1<0 || i2<0) return 0;
    //        if (dp[i1+1][i2+1]!=-1) return dp[i1+1][i2+1];
    //        if (s1.charAt(i1)==s2.charAt(i2)) return dp[i1+1][i2+1] = 1 + solver(i1-1,i2-1,s1,s2,dp);
    //        return dp[i1+1][i2+1] =  Math.max(solver(i1,i2-1,s1,s2,dp),solver(i1-1,i2,s1,s2,dp));
    //    }
    //}

//class Solution {
//    public int longestCommonSubsequence(String text1, String text2) {
//        int n1 = text1.length();
//        int n2 = text2.length();
//        int[][] dp = new int[n1+1][n2+1];
//        for (int i1 =1;i1<=n1;i1++){
//            for (int i2=1;i2<=n2;i2++){
//                if (text1.charAt(i1-1)==text2.charAt(i2-1)) dp[i1][i2] = 1 + dp[i1-1][i2-1];
//                else dp[i1][i2] =  Math.max(dp[i1][i2-1],dp[i1-1][i2]);
//            }
//        }
//        return dp[n1][n2];
//    }
//}

    //class Solution {
    //    public int longestCommonSubsequence(String text1, String text2) {
    //        int n1 = text1.length();
    //        int n2 = text2.length();
    //        int[]dp = new int[n2+1];
    //        for (int i1 =1;i1<=n1;i1++){
    //            int [] cur = new int[n2+1];
    //            for (int i2=1;i2<=n2;i2++){
    //                if (text1.charAt(i1-1)==text2.charAt(i2-1)) cur[i2] = 1 + dp[i2-1];
    //                else cur[i2] =  Math.max(cur[i2-1],dp[i2]);
    //            }
    //            dp = cur;
    //        }
    //        return dp[n2];
    //    }
    //}



}
