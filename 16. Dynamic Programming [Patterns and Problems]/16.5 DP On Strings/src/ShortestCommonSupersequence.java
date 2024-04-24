public class ShortestCommonSupersequence {
//https://leetcode.com/problems/shortest-common-supersequence/description/
    //https://www.naukri.com/code360/problems/shortest-common-supersequence_4244493?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //yaha pe bhi lcs ka use hua hai read the code you will get it
    //LCS nikala dono strings ka usko ek hi bar count karenge and baaki bache hue characters sare toh aise length nikalna toh easy hai bht fir print lcs me halka sa change karke string print kar denge vo bhi easy hi hai
//class Solution {
//    public String shortestCommonSupersequence(String str1, String str2) {
//        int m = str1.length();
//        int n = str2.length();
//        int[][] dp = new int[m+1][n+1];
//        for (int i = 1;i<=m;i++){
//            for (int j=1;j<=n;j++){
//                if (str1.charAt(i-1)==str2.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
//                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
//            }
//        }
//        int i = m;
//        int j = n;
//        String ans = "";
//        while (i>0 && j>0){
//            if (str1.charAt(i-1)==str2.charAt(j-1)){
//                ans+=str1.charAt(i-1);
//                i--;
//                j--;
//            }
//            else if (dp[i-1][j]>dp[i][j-1]){
//                ans+=str1.charAt(i-1);
//                i--;
//            }
//            else {
//                ans+=str2.charAt(j-1);
//                j--;
//            }
//        }
//        while (i>0){
//            ans+=str1.charAt(i-1);
//            i--;
//        }
//        while(j>0){
//            ans+=str2.charAt(j-1);
//            j--;
//        }
//        String res = "";
//        for (int a = ans.length()-1;a>=0;a--){
//            res+=ans.charAt(a);
//        }
//        return res;
//    }
//}
}
