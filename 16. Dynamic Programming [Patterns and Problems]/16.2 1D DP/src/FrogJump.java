public class FrogJump {
    //https://www.naukri.com/code360/problems/frog-jump_3621012?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //import java.util.* ;
    //import java.io.*;
    //public class Solution {
    //    public static int frogJump(int n, int heights[]) {
    //        return helper(n-1,heights);
    //    }
    //    static int helper(int n, int [] heights){
    //        if (n==0) return 0;
    //        int left = helper(n-1,heights) + Math.abs(heights[n]-heights[n-1]);
    //        int right = Integer.MAX_VALUE;
    //        if (n>1) right = helper(n-2,heights) + Math.abs(heights[n]-heights[n-2]);
    //        return Math.min(left,right);
    //    }
    //
    //}

    //memoization
    //import java.util.* ;
    //import java.io.*;
    //public class Solution {
    //    public static int frogJump(int n, int heights[]) {
    //        int [] dp = new int[n];
    //        for (int i = 0;i<n;i++) dp[i] = -1;
    //        return helper(n-1,heights,dp);
    //    }
    //    static int helper(int n, int [] heights,int[] dp){
    //        if (n==0) return dp[n] = 0;
    //        if (dp[n] != -1) return dp[n];
    //        int left = helper(n-1,heights,dp) + Math.abs(heights[n]-heights[n-1]);
    //        int right = Integer.MAX_VALUE;
    //        if (n>1) right = helper(n-2,heights,dp) + Math.abs(heights[n]-heights[n-2]);
    //        return dp[n] =  Math.min(left,right);
    //    }
    //
    //}

    //tabulation
    //import java.util.* ;
    //import java.io.*;
    //public class Solution {
    //    public static int frogJump(int n, int heights[]) {
    //        int [] dp = new int[n];
    //        dp[0] = 0;
    //        for (int i = 1;i<n;i++){
    //            int left = dp[i-1] + Math.abs(heights[i]-heights[i-1]);
    //            int right = Integer.MAX_VALUE;
    //            if (i>1) right = dp[i-2] + Math.abs(heights[i]-heights[i-2]);
    //            dp[i] = Math.min(left,right);
    //        }
    //        return dp[n-1];
    //    }
    //}

    //tabulation with space optimised

    //import java.util.* ;
    //import java.io.*;
    //public class Solution {
    //    public static int frogJump(int n, int heights[]) {
    //        int prev = 0;
    //        int prev2 = 0;
    //        for (int i = 1;i<n;i++){
    //            int left = prev + Math.abs(heights[i]-heights[i-1]);
    //            int right = Integer.MAX_VALUE;
    //            if (i>1) right = prev2 + Math.abs(heights[i]-heights[i-2]);
    //            int curr= Math.min(left,right);
    //            prev2 = prev;
    //            prev = curr;
    //        }
    //        return prev;
    //    }
    //}
}
