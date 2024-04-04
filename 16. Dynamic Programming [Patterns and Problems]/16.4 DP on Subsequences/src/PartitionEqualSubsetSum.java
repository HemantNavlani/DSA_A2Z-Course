public class PartitionEqualSubsetSum {
    //https://www.naukri.com/code360/problems/partition-equal-subset-sum-_892980?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/partition-equal-subset-sum/

    //class Solution {
    //    public boolean canPartition(int[] nums) {
    //        //here it is same question as that of subset sum with a target as -->
    //        //yaha two subset banegnge with sum/2
    //        //agar poore array ka sum odd hai toh possible hi nhi hai
    //        //and agar hamne ek array find karliya with sum s/2 then definitely we have another one with remaining s/2 and we can use that function of the question subset with target sum
    //        int sum = 0;
    //        for (int i = 0;i<nums.length;i++) sum += nums[i];
    //        if (sum%2!=0) return false;
    //        return subsetWithSum(sum/2,nums);
    //    }
    //    boolean subsetWithSum(int k,int[] nums){
    //        boolean dp[] = new boolean[k+1];
    //        dp[0] = true;
    //        if (nums[0]<=k)dp[nums[0]] = true;
    //        for (int i = 1;i<nums.length;i++){
    //            boolean [] cur = new boolean[k+1];
    //            cur[0] = true;
    //            for (int target=1;target<=k;target++){
    //                boolean notPick = dp[target];
    //                boolean pick = false;
    //                if (nums[i]<=target) pick = dp[target-nums[i]];
    //                cur[target] = pick || notPick;
    //            }
    //            dp = cur;
    //        }
    //        return dp[k];
    //    }
    //}
}
