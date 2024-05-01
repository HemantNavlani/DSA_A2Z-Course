public class PartitionArrayForMaximumSum {
    //https://leetcode.com/problems/partition-array-for-maximum-sum/
    //https://www.naukri.com/code360/problems/partition-array-for-maximum-sum_3755255?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
//    pichle jaisa hi hai jyada alag nhi hai karke dekho baaki read the code
    //class Solution {
    //    public int maxSumAfterPartitioning(int[] arr, int k) {
    //        return solver(0,arr,k);
    //    }
    //    int solver(int i, int[] arr,int k){
    //        if (i==arr.length) return 0;
    //        int len = 0;
    //        int max = Integer.MIN_VALUE;
    //        int maxAns = Integer.MIN_VALUE;
    //        for (int j = i;j<Math.min(i+k,arr.length);j++){
    //            len++;
    //            max = Math.max(max,arr[j]);
    //            int sum = len * max + solver(j+1,arr,k);
    //            maxAns = Math.max(maxAns,sum);
    //        }
    //        return maxAns;
    //    }
    //}

    //class Solution {
    //    public int maxSumAfterPartitioning(int[] arr, int k) {
    //        int n = arr.length;
    //        int [] dp = new int[n];
    //        for (int i = 0;i<n;i++) dp[i] = -1;
    //        return solver(0,arr,k,dp);
    //    }
    //    int solver(int i, int[] arr,int k,int[]dp){
    //        if (i==arr.length) return 0;
    //        if (dp[i]!=-1) return dp[i];
    //        int len = 0;
    //        int max = Integer.MIN_VALUE;
    //        int maxAns = Integer.MIN_VALUE;
    //        for (int j=i;j<Math.min(i+k,arr.length);j++){
    //            len++;
    //            max = Math.max(max,arr[j]);
    //            int sum = len * max + solver(j+1,arr,k,dp);
    //            maxAns = Math.max(maxAns,sum);
    //        }
    //        return dp[i] = maxAns;
    //    }
    //}

    //class Solution {
    //    public int maxSumAfterPartitioning(int[] arr, int k) {
    //        int n = arr.length;
    //        int [] dp = new int[n+1];
    //        dp[n] = 0;
    //        for (int i =n-1;i>=0;i--) {
    //            int len = 0;
    //            int max = Integer.MIN_VALUE;
    //            int maxAns = Integer.MIN_VALUE;
    //            for (int j=i;j<Math.min(i+k,arr.length);j++){
    //                len++;
    //                max = Math.max(max,arr[j]);
    //                int sum = len * max + dp[j+1];
    //                maxAns = Math.max(maxAns,sum);
    //            }
    //            dp[i] = maxAns;
    //        }
    //        return dp[0];
    //    }
    //}
}
