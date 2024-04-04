public class PartitionIntoTwoSubsetWithMinimumAbsoluteDifference {

    //https://leetcode.com/problems/partition-array-into-two-arrays-to-minimize-sum-difference/description/
    //leetcode pe ye for negative numbers bhi hai uske liye alag hai algorithm baad me dekhna isse


    //https://www.naukri.com/code360/problems/partition-a-set-into-two-subsets-such-that-the-difference-of-subset-sums-is-minimum_842494?leftPanelTabValue=SUBMISSION

    //This works only when the array has non-negative integers
    //import java.util.*;
    //public class Solution {
    //    public static int minSubsetSumDifference(int []nums, int n) {
    //
    //    //yaha pe bhi subset sum with target k wale ka hi concepet laga hai hamne tabulation vale method se ye dekha ki
    //    //ham sare s1 nikal lete hai jo bhi possible hai kaise ? --> 0 - total sum ki range me honge and fir ham total sum as target deke uss question ka function call karenge
    //    // fir vo dp table bhar jayegi aur bata degi ki kaun kaun se s1 possible hai uske according totalsum me se minus karke pata laga lo s2 fir loop chala ke minimum absolute difference nikal lo
    //
    //        int totalsum = 0;
    //        for (int i =0;i<nums.length;i++) totalsum += nums[i];
    //        boolean[] possible = solver (nums,totalsum);
    //        int min = (int)1e9;
    //        for (int i =0;i<possible.length;i++){
    //            if (possible[i]){
    //                int s1=i;
    //                int s2 = totalsum-s1;
    //                min = Math.min(min,Math.abs(s1-s2));
    //            }
    //        }
    //        return min;
    //    }
    //    static boolean[] solver (int[]nums,int k){
    //        int n = nums.length;
    //        boolean[] dp = new boolean[k+1];
    //        dp[0] = true;
    //        if (nums[0]<=k && nums[0]>=0) dp[nums[0]] = true;
    //        for (int i = 1;i<n;i++){
    //            boolean[] curr = new boolean[k+1];
    //            curr[0] = true;
    //            for (int target = 1;target<=k;target++){
    //                boolean notPick = dp[target];
    //                boolean pick = false;
    //                if (nums[i]<=target) pick = dp[target-nums[i]];
    //                curr[target] = pick || notPick;
    //            }
    //            dp=curr;
    //        }
    //        return dp;
    //    }
    //}
}
