public class CoinChange2 {
    //https://www.naukri.com/code360/problems/ways-to-make-coin-change_630471?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/coin-change-ii/submissions/1222762659/

    //class Solution {
    //    public int change(int amount, int[] coins) {
    //        int n = coins.length;
    //        int[][] dp = new int [n][amount+1];
    //        for (int i = 0;i<n;i++){
    //            for (int j = 0;j<=amount;j++) dp[i][j]=-1;
    //        }
    //        return solver(n-1,amount,coins,dp);
    //    }
    //    int solver(int idx,int amount,int [] coins,int[][]dp){
    //        if (idx==0){
    //            if (amount%coins[0]==0) return 1;
    //            else return 0;
    //        }
    //        if (amount==0) return 1;
    //        if (dp[idx][amount]!=-1) return dp[idx][amount];
    //
    //        int pick = 0;
    //        if (coins[idx]<=amount) pick = solver(idx,amount-coins[idx],coins,dp);
    //        int notPick = solver(idx-1,amount,coins,dp);
    //        return dp[idx][amount] = pick + notPick;
    //    }
    //}

    //class Solution {
    //    public int change(int amount, int[] coins) {
    //        int n = coins.length;
    //        int[][] dp = new int [n][amount+1];
    //
    //        for (int a=0;a<=amount;a++){
    //            if (a%coins[0]==0) dp[0][a] = 1;
    //        }
    //        for (int i= 0;i<n;i++) dp[i][0] = 1;
    //
    //        for (int idx = 1;idx<n;idx++){
    //            for (int a = 0;a<=amount;a++) {
    //                int pick = 0;
    //                if (coins[idx]<=a) pick = dp[idx][a-coins[idx]];
    //                int notPick = dp[idx-1][a];
    //                dp[idx][a] = pick + notPick;
    //            }
    //        }
    //        return dp[n-1][amount];
    //    }
    //}


    //class Solution {
    //    public int change(int amount, int[] coins) {
    //        int n = coins.length;
    //        int[] dp = new int[amount+1];
    //
    //        for (int a=0;a<=amount;a++){
    //            if (a%coins[0]==0) dp[a] = 1;
    //        }
    //        dp[0] = 1;
    //        for (int idx = 1;idx<n;idx++){
    //            int [] cur = new int[amount+1];
    //            for (int a = 0;a<=amount;a++) {
    //                int pick = 0;
    //                if (coins[idx]<=a) pick = cur[a-coins[idx]];
    //                int notPick = dp[a];
    //                cur[a] = pick + notPick;
    //            }
    //            dp=cur;
    //        }
    //        return dp[amount];
    //    }
    //}
}
