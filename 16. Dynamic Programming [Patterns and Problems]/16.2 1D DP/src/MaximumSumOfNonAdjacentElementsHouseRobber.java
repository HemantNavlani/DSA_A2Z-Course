public class MaximumSumOfNonAdjacentElementsHouseRobber {
    //https://www.naukri.com/code360/problems/maximum-sum-of-non-adjacent-elements_843261?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/house-robber/

    //class Solution {
    //    public int rob(int[] nums) {
    //        int n = nums.length;
    //        return helper (0,nums);
    //    }
    //    int helper (int i,int[] nums){
    //        if (i==nums.length-1) return nums[i];
    //        if (i==nums.length) return 0;
    //        int left = nums[i] + helper(i+2,nums);
    //        int right = helper(i+1,nums);
    //        return Math.max(left,right);
    //    }
    //}


    //Memoization
    //class Solution {
    //    public int rob(int[] nums) {
    //        int n = nums.length;
    //        int[] dp = new int [n+1];
    //        for (int i =0;i<=n;i++) dp[i] = -1;
    //        return helper (0,nums,dp);
    //    }
    //    int helper (int i,int[] nums,int[] dp){
    //        if (i==nums.length-1) return nums[i];
    //        if (i==nums.length) return 0;
    //        if (dp[i]!=-1) return dp[i];
    //        return dp[i] = Math.max(helper(i+1,nums,dp),(nums[i] + helper(i+2,nums,dp)));
    //    }
    //}

    //Tabulation
    //class Solution {
    //    public int rob(int[] nums) {
    //        int n = nums.length;
    //        int[] dp = new int [n+1];
    //        dp[n-1] = nums[n-1];
    //        dp[n] = 0;
    //        for (int i = n-2;i>=0;i--){
    //            dp[i] = Math.max(dp[i+1],(nums[i] + dp[i+2]));
    //        }
    //        return dp[0];
    //    }
    //}

    //Tabulation with space optimised
    //class Solution {
    //    public int rob(int[] nums) {
    //        int n = nums.length;
    //        int prev = nums[n-1];
    //        int prev2 = 0;
    //        for (int i = n-2;i>=0;i--){
    //           int curr = Math.max(prev,(nums[i] + prev2));
    //           prev2 = prev;
    //           prev = curr;
    //        }
    //        return prev;
    //    }
    //}
}
