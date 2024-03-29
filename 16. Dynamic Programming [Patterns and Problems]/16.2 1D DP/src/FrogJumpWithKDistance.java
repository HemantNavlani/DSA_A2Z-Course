public class FrogJumpWithKDistance {
    //    //https://www.naukri.com/code360/problems/minimal-cost_8180930?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION



    //public class Solution {
    //    public static int minimizeCost(int n, int k, int []height){
    //        return helper (n-1,k,height);
    //    }
    //    static int helper(int n, int k, int[] height){
    //        if (n==0) return 0;
    //        int min = Integer.MAX_VALUE;
    //        for (int i = 1;i<=k;i++){
    //            int rec = Integer.MAX_VALUE;
    //            if (n-i>=0) rec = helper(n-i,k,height) + Math.abs(height[n]-height[n-i]);
    //            min = Math.min(min,rec);
    //        }
    //        return min;
    //    }
    //}


    //Memoization
    //O(n*k) TC
    //O(N) + O(N) SC
    //public class Solution {
    //    public static int minimizeCost(int n, int k, int []height){
    //        int [] dp = new int [n] ;
    //        for (int i = 0;i<n;i++) dp[i] =-1;
    //        return helper (n-1,k,height,dp);
    //    }
    //    static int helper(int n, int k, int[] height,int[] dp){
    //        if (n==0) return 0;
    //        if (dp[n]!=-1) return dp[n];
    //        int min = Integer.MAX_VALUE;
    //        for (int i = 1;i<=k;i++){
    //            int rec = Integer.MAX_VALUE;
    //            if (n-i>=0) rec = helper(n-i,k,height,dp) + Math.abs(height[n]-height[n-i]);
    //            min = Math.min(min,rec);
    //        }
    //        return dp[n] = min;
    //    }
    //}


    //O(N*K) TC
    //O(N) SC
    //Tabulation
    //public class Solution {
    //    public static int minimizeCost(int n, int k, int []height){
    //        int [] dp = new int [n] ;
    //        dp[0] = 0;
    //        for (int a = 1;a<n;a++){
    //             int min = Integer.MAX_VALUE;
    //            for (int i = 1;i<=k;i++){
    //                int rec = Integer.MAX_VALUE;
    //                if (a-i>=0) rec = dp[a-i] + Math.abs(height[a]-height[a-i]);
    //                min = Math.min(min,rec);
    //            }
    //        dp[a] = min;
    //        }
    //        return dp[n-1];
    //    }
    //}


}
