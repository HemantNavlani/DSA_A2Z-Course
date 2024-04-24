import java.util.Collections;

public class LongestPalindromeSubsequence {
    //https://www.naukri.com/code360/problems/longest-palindromic-subsequence_842787?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/longest-palindromic-subsequence/

    //same hi hai bas lcs hi nikalna hai seedhi ulti string ka vo palindrome hi hoga
    //class Solution {
    //    public int longestPalindromeSubseq(String s) {
    //        String str = "";
    //        for (int i = s.length()-1;i>=0;i--){
    //            str+=s.charAt(i);
    //        }
    //        return lcs(s,str);
    //    }
    //    int lcs(String str1, String str2){
    //        int m = str1.length();
    //        int n = str2.length();
    //        int[] prev = new int[n+1];
    //        for (int i = 1;i<=m;i++){
    //           int[] curr = new int[n+1];
    //               for (int j = 1;j<=n;j++){
    //                   if (str1.charAt(i-1)==str2.charAt(j-1)) curr[j] = 1+prev[j-1];
    //                   else curr[j] =  Math.max(curr[j-1],prev[j]);
    //               }
    //               prev = curr;
    //           }
    //        return prev[n];
    //    }
    //}
}
