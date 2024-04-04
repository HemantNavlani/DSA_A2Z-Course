public class TargetSum {
    //This problem is exactly same as that of the problem done earlier where we need to find the subsets such as S1-S2 = d
    //https://www.naukri.com/code360/problems/target-sum_4127362?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
//https://leetcode.com/problems/target-sum/
    //class Solution {
    //    public int findTargetSumWays(int[] nums, int target) {
    //        int totalSum = 0;
    //        for (int i :nums) totalSum+=i;
    //        if (totalSum-target<0 || (totalSum-target)%2==1) return 0;
    //
    //        return solver(nums,(totalSum-target)/2);
    //    }
    //    int solver(int[]nums,int k){
    //        int n = nums.length;
    //        int [] dp = new int[k+1];
    //        if (nums[0]==0) dp[0] = 2;
    //        else dp[0] = 1;
    //
    //        if (nums[0]!=0 && nums[0]<=k) dp[nums[0]]=1;
    //
    //        for (int i = 1;i<n;i++){
    //            int[] cur = new int [k+1];
    //            for (int j = 0;j<=k;j++){
    //                int pick = 0;
    //                if (nums[i]<=j) pick = dp[j-nums[i]];
    //                int notPick = dp[j];
    //                cur[j] = pick + notPick;
    //            }
    //            dp = cur;
    //        }
    //        return dp[k];
    //    }
    //}
}
