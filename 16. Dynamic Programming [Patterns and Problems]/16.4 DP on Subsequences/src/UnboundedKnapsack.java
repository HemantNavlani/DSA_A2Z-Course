public class UnboundedKnapsack {
    //https://www.naukri.com/code360/problems/unbounded-knapsack_1215029?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //public class Solution {
    //    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
    //        int ans = solver(n-1,w,profit,weight);
    //        return ans==(int)-1e9 ? 0 :  ans;
    //    }
    //    static int solver(int idx,int w,int []profit,int[] weight){
    //        if (idx==0){
    //             return profit[0] *(int) (w/weight[0]);
    //        }
    //        int pick = (int)-1e9;
    //        if (weight[idx]<=w) pick = profit[idx] + solver(idx,w-weight[idx],profit,weight);
    //        int notPick = solver(idx-1,w,profit,weight);
    //        return Math.max(pick,notPick);
    //    }
    //}

    //public class Solution {
    //    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
    //        int[][] dp = new int[n][w+1];
    //        for (int i =0;i<n;i++){
    //            for (int j = 0;j<=w;j++){
    //                dp[i][j] = -1;
    //            }
    //        }
    //        int ans = solver(n-1,w,profit,weight,dp);
    //        return ans==(int)-1e9 ? 0 :  ans;
    //    }
    //    static int solver(int idx,int w,int []profit,int[] weight,int[][]dp){
    //        if (idx==0){
    //             return profit[0] *(int) (w/weight[0]);
    //        }
    //        if (dp[idx][w]!=-1) return dp[idx][w];
    //        int pick = (int)-1e9;
    //        if (weight[idx]<=w) pick = profit[idx] + solver(idx,w-weight[idx],profit,weight,dp);
    //        int notPick = solver(idx-1,w,profit,weight,dp);
    //        return dp[idx][w] = Math.max(pick,notPick);
    //    }
    //}

    //public class Solution {
    //    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
    //        int[][] dp = new int[n][w+1];
    //        for (int i = 0;i<=w;i++) dp[0][i] = profit[0] * (i/weight[0]);
    //
    //        for (int idx =1;idx<n;idx++){
    //            for (int wt = 0;wt<=w;wt++){
    //                int pick = (int)-1e9;
    //                if (weight[idx]<=wt) pick = profit[idx] + dp[idx][wt-weight[idx]];
    //                int notPick = dp[idx-1][wt];
    //                dp[idx][wt] = Math.max(pick,notPick);
    //            }
    //        }
    //        int ans = dp[n-1][w];
    //        return ans==(int)-1e9 ? 0 :  ans;
    //    }
    //}

    //public class Solution {
    //    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
    //        int[] dp = new int[w+1];
    //        for (int i = 0;i<=w;i++) dp[i] = profit[0] * (i/weight[0]);
    //
    //        for (int idx =1;idx<n;idx++){
    //            int[] cur = new int[w+1];
    //            for (int wt = 0;wt<=w;wt++){
    //                int pick = (int)-1e9;
    //                if (weight[idx]<=wt) pick = profit[idx] + cur[wt-weight[idx]];
    //                int notPick = dp[wt];
    //                cur[wt] = Math.max(pick,notPick);
    //            }
    //            dp = cur;
    //        }
    //        int ans = dp[w];
    //        return ans==(int)-1e9 ? 0 :  ans;
    //    }
    //}

    //public class Solution {
    //    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
    //        int[] dp = new int[w+1];
    //        for (int i = 0;i<=w;i++) dp[i] = profit[0] * (i/weight[0]);
    //
    //        for (int idx =1;idx<n;idx++){
    //            for (int wt = 0;wt<=w;wt++){
    //                int pick = (int)-1e9;
    //                if (weight[idx]<=wt) pick = profit[idx] + dp[wt-weight[idx]];
    //                int notPick = dp[wt];
    //                dp[wt] = Math.max(pick,notPick);
    //            }
    //        }
    //        int ans = dp[w];
    //        return ans==(int)-1e9 ? 0 :  ans;
    //    }
    //}
}
