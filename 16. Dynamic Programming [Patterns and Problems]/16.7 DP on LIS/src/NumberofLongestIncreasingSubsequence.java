public class NumberofLongestIncreasingSubsequence {
    //https://leetcode.com/problems/number-of-longest-increasing-subsequence/description/
    //https://www.naukri.com/code360/problems/number-of-longest-increasing-subsequence_3751627?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    //LIS me count bhi rakh rahe read the code or see the dry run of the code by yourself or in the video
    //class Solution {
    //    public int findNumberOfLIS(int[] nums) {
    //        int n = nums.length;
    //        int[] dp = new int[n];
    //        int[] cnt = new int[n];
    //        for (int i = 0;i<n;i++){
    //            dp[i]= 1;
    //            cnt[i]=1;
    //        }
    //        int max= 1;
    //        for (int i =0;i<n;i++){
    //            for (int j =0;j<i;j++){
    //                if (nums[i]>nums[j] && 1+dp[j]>dp[i]) {
    //                    dp[i] = 1+dp[j];
    //                    cnt[i]=cnt[j];
    //                }
    //                else if (nums[i]>nums[j] && 1+dp[j]==dp[i]){
    //                    cnt[i]+=cnt[j];
    //                }
    //            }
    //            max = Math.max(max,dp[i]);
    //        }
    //        int ans = 0;
    //        for (int i = 0;i<n;i++){
    //            if (dp[i]==max) ans+=cnt[i];
    //        }
    //       return ans;
    //    }
    //}
}
