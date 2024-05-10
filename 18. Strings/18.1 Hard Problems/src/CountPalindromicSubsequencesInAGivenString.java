public class CountPalindromicSubsequencesInAGivenString {
    //ye toh dp ka hi tha read the solution you will get it or watch this video
    //https://www.youtube.com/watch?v=9hsnkf0MRhQ&ab_channel=GeeksforGeeksPractice
    //https://www.geeksforgeeks.org/problems/count-palindromic-subsequences/1
    //class Solution{
    //    long countPS(String str){
    //        int n = str.length();
    //        long[][] dp = new long[n][n];
    //        for (int i = 0;i<n;i++){
    //            for (int j = 0;j<n;j++){
    //                dp[i][j]=-1;
    //            }
    //        }
    //        int mod = (int)(1e9+7);
    //        return solver(dp,str,0,n-1)%mod;
    //    }
    //    long solver(long[][] dp, String str,int i,int j){
    //        int mod = (int)(1e9+7);
    //        if (i==j) return 1;
    //        if (i>j) return 0;
    //        if (dp[i][j]!=-1) return dp[i][j];
    //        if (str.charAt(i)==str.charAt(j)) return dp[i][j] = (1+(solver(dp,str,i+1,j)%mod)+(solver(dp,str,i,j-1)%mod))%mod;
    //        else return dp[i][j] =((solver(dp,str,i+1,j)%mod)+(solver(dp,str,i,j-1)%mod) -( solver(dp,str,i+1,j-1)%mod)+mod)%mod;
    //    }
    //}
}
