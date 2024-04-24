import java.util.Arrays;
import java.util.Stack;

public class PrintLongestCommonSubsequence {
    //https://www.naukri.com/code360/problems/print-longest-common-subsequence_8416383?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //phle tabulation vale approach se dp table ready kar di hai fir usme se backtrack karke longest nikala hai see the code you will get it
    //public class Solution {
    //    public static String findLCS(int n1, int n2, String text1, String text2){
    //       int[][] dp = new int[n1+1][n2+1];
    //       for (int i1 =1;i1<=n1;i1++){
    //           for (int i2=1;i2<=n2;i2++){
    //               if (text1.charAt(i1-1)==text2.charAt(i2-1)) dp[i1][i2] = 1 + dp[i1-1][i2-1];
    //               else dp[i1][i2] =  Math.max(dp[i1][i2-1],dp[i1-1][i2]);
    //           }
    //       }
    //       String ans = "";
    //       int i = n1;
    //       int j = n2;
    //       while(i>0 && j>0){
    //           if (text1.charAt(i-1)==text2.charAt(j-1)) {
    //               ans = text1.charAt(i-1) + ans;
    //               i--;
    //               j--;
    //           }
    //           else if (dp[i-1][j]>dp[i][j-1]) i--;
    //           else j--;
    //       }
    //       return ans;
    //    }
    //}
}
