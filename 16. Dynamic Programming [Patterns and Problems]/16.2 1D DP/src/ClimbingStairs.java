public class ClimbingStairs {

    //https://www.naukri.com/code360/problems/count-ways-to-reach-the-n-th-stairs_798650?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/climbing-stairs/

    //recursion
    //class Solution {
    //    public int climbStairs(int n) {
    //        if (n<=1) return 1;
    //        return climbStairs(n-1) + climbStairs(n-2);
    //    }
    //}

    //dp memoization
    //class Solution {
    //    public int climbStairs(int n) {
    //        int[] dp = new int[n+1];
    //        for (int i = 0;i<=n;i++) dp[i] =-1;
    //        return helper(n,dp);
    //    }
    //    public int helper(int n,int[] dp){
    //        if (n<=1) return dp[n] = 1;
    //        if (dp[n]!=-1) return dp[n];
    //        return dp[n] = helper(n-1,dp) +helper(n-2,dp);
    //    }
    //}

    //tabulation
    //class Solution {
    //    public int climbStairs(int n) {
    //        int[] dp = new int[n+1];
    //        dp[0] = 1;
    //        dp[1] = 1;
    //        for (int i=2;i<=n;i++){
    //            dp[i] = dp[i-1] + dp[i-2];
    //        }
    //        return dp[n];
    //    }
    //}

    //class Solution {
    //    public int climbStairs(int n) {
    //        int prev = 1;
    //        int prev2 = 1;
    //        for (int i=2;i<=n;i++){
    //            int curr = prev + prev2;
    //            prev2 = prev;
    //            prev = curr;
    //        }
    //        return prev;
    //    }
    //}

}
