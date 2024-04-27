import java.util.Arrays;

public class LargestDivisibleSubset {
    //https://leetcode.com/problems/largest-divisible-subset/description/

    //https://www.naukri.com/code360/problems/divisible-set_3754960?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    // same as Longest Increasing Subsequence just a littel change in it
    //class Solution {
    //    public List<Integer> largestDivisibleSubset(int[] nums) {
    //        int n = nums.length;
    //        Arrays.sort(nums);
    //        int[] dp = new int[n];
    //        for(int i = 0;i<n;i++) dp[i]=1;
    //        int[] hash = new int[n];
    //
    //        int max = 1;
    //        int lastIdx = 0;
    //
    //        for (int i = 0;i<n;i++){
    //            hash[i] = i;
    //            for (int prev=0;prev<i;prev++){
    //                if (nums[i]%nums[prev]==0 && 1+dp[prev]>dp[i]){
    //                    dp[i] = 1+dp[prev];
    //                    hash[i] = prev;
    //                }
    //            }
    //            if (dp[i]>max) {
    //                max = dp[i];
    //                lastIdx=i;
    //            }
    //        }
    //        ArrayList<Integer> ans = new ArrayList<>();
    //        ans.add(nums[lastIdx]);
    //        while (hash[lastIdx]!=lastIdx){
    //            lastIdx = hash[lastIdx];
    //            ans.add(nums[lastIdx]);
    //        }
    //        return ans;
    //    }
    //}
}