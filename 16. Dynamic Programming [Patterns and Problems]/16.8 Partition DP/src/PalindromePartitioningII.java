public class PalindromePartitioningII {
    //easy hai loop me string banate jao temp aur usko check karte jao if vo palindrome ho skti hai toh dekh lo tab partition vali possibility lagao aur min lelo us loop ka
    //leetcode.com/problems/palindrome-partitioning-ii/
    //https://www.naukri.com/code360/problems/palindrome-partitioning-ll_873266?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
    //    public int minCut(String s) {
    //        int n = s.length();
    //        int[] dp = new int[n];
    //        for (int i = 0;i<n;i++) dp[i]=-1;
    //        return solver(0,s,dp)-1;
    //    }
    //    boolean isPalindrome(int i, int j, String s){
    //        while (i<j){
    //            if (s.charAt(i)!=s.charAt(j)) return false;
    //            i++;
    //            j--;
    //        }
    //        return true;
    //    }
    //    int solver (int i, String s,int[]dp){
    //        if (i==s.length())return 0;
    //        if (dp[i]!=-1) return dp[i];
    //        int min = Integer.MAX_VALUE;
    //        for (int j = i;j<s.length();j++){
    //            if (isPalindrome(i,j,s)){
    //                int cost = 1 + solver(j+1,s,dp);
    //                min = Math.min(min,cost);
    //            }
    //        }
    //        return dp[i] = min;
    //     }
    //}

    //class Solution {
    //    public int minCut(String s) {
    //        int n = s.length();
    //        int[] dp = new int[n+1];
    //        dp[n]= 0;
    //
    //        for (int i = n-1;i>=0;i--){
    //            int min = Integer.MAX_VALUE;
    //                for (int j=i;j<s.length();j++){
    //                    if (isPalindrome(i,j,s)){
    //                    int cost = 1 + dp[j+1];
    //                    min = Math.min(min,cost);
    //                }
    //                dp[i] = min;
    //            }
    //        }
    //        return dp[0]-1;
    //    }
    //    boolean isPalindrome(int i, int j, String s){
    //        while (i<j){
    //            if (s.charAt(i)!=s.charAt(j)) return false;
    //            i++;
    //            j--;
    //        }
    //        return true;
    //    }
    //}

}
