public class PrintingLIS {
//    /https://www.naukri.com/code360/problems/printing-longest-increasing-subsequence_8360670?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //import java.util.*;
    //public class Solution {
    //    public static List< Integer > printingLongestIncreasingSubsequence(int []nums, int n) {
    //        int [] dp = new int [n];
    //        for (int i = 0;i<n;i++) dp[i]=1;
    //        int [] hash = new int [n];
    //        int lastIdx = 0;
    //        int max = 1;
    //        for (int i=0;i<n;i++){
    //            hash[i] = i;
    //            for (int prev = 0;prev<i;prev++){
    //                if (nums[i]>nums[prev] && 1+dp[prev]>dp[i]){
    //                    dp[i] = 1+dp[prev];
    //                    hash[i] = prev;
    //                }
    //            }
    //            if (dp[i]>max){
    //                max = dp[i];
    //                lastIdx = i;
    //            }
    //        }
    //        ArrayList<Integer> ans = new ArrayList<Integer>();
    //        ans.add(nums[lastIdx]);
    //        while (hash[lastIdx]!=lastIdx){
    //            lastIdx = hash[lastIdx];
    //            ans.add(nums[lastIdx]);
    //        }
    //        Collections.reverse(ans);
    //        return ans;
    //    }
    //}
}
