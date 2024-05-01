public class BurstBalloons {
//    https://www.naukri.com/code360/problems/burst-balloons_628471?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/burst-balloons/description/
    ////thoda sa ulta sochna hai isme baki pichle jaisa hi hai
    //class Solution {
    //    public int maxCoins(int[] nums) {
    //        int n = nums.length;
    //        int [] arr = new int[n+2];
    //        arr[0]=1;
    //        arr[n+1] = 1;
    //        for (int i = 0;i<nums.length;i++){
    //            arr[i+1] = nums[i];
    //        }
    //        return solver(1,n,arr);
    //    }
    //    int solver(int i, int j,int[]nums){
    //        if (i>j) return 0;
    //        int max = Integer.MIN_VALUE;
    //        for (int idx=i;idx<=j;idx++){
    //            int cost = nums[i-1]*nums[idx]*nums[j+1] + solver(i,idx-1,nums) + solver(idx+1,j,nums);
    //            max = Math.max(max,cost);
    //        }
    //        return max;
    //    }
    //}

    //class Solution {
    //    public int maxCoins(int[] nums) {
    //        int n = nums.length;
    //        int [] arr = new int[n+2];
    //        arr[0]=1;
    //        arr[n+1] = 1;
    //        for (int i = 0;i<nums.length;i++){
    //            arr[i+1] = nums[i];
    //        }
    //        int [][] dp = new int[n+1][n+1];
    //        for (int i = 0;i<=n;i++){
    //            for (int j = 0;j<=n;j++) dp[i][j]=-1;
    //        }
    //        return solver(1,n,arr,dp);
    //    }
    //    int solver(int i, int j,int[]nums,int[][]dp){
    //        if (i>j) return 0;
    //        if (dp[i][j]!=-1) return dp[i][j];
    //        int max = Integer.MIN_VALUE;
    //        for (int idx=i;idx<=j;idx++){
    //            int cost = nums[i-1]*nums[idx]*nums[j+1] + solver(i,idx-1,nums,dp) + solver(idx+1,j,nums,dp);
    //            max = Math.max(max,cost);
    //        }
    //        return dp[i][j] = max;
    //    }
    //}

    //class Solution {
    //    public int maxCoins(int[] nums) {
    //        int n = nums.length;
    //        int [] arr = new int[n+2];
    //        arr[0]=1;
    //        arr[n+1] = 1;
    //        for (int i = 0;i<nums.length;i++){
    //            arr[i+1] = nums[i];
    //        }
    //        int [][] dp = new int[n+2][n+2];
    //        for (int i =n;i>=1;i--){
    //            for (int j = 1;j<=n;j++) {
    //                if(i>j) continue;
    //                int max = Integer.MIN_VALUE;
    //                for (int idx=i;idx<=j;idx++){
    //                    int cost = arr[i-1]*arr[idx]*arr[j+1] + dp[i][idx-1] + dp[idx+1][j];
    //                    max = Math.max(max,cost);
    //                }
    //                dp[i][j] = max;
    //            }
    //        }
    //        return dp[1][n];
    //    }
    //}
}
