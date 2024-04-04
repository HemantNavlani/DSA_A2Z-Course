public class MinimumCoins {
    //https://leetcode.com/problems/coin-change/submissions/1221961030/
    //https://www.naukri.com/code360/problems/minimum-elements_3843091?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
    //    public int coinChange(int[] coins, int amount) {
    //        int n = coins.length;
    //        int ans = solver (n-1,coins,amount);
    //        return ans==(int)1e9 ? -1 : ans;
    //    }
    //    int solver(int idx,int[]coins,int amount){
    //        if (amount==0) return 0;
    //          if (idx==0){
    //    //            if (amount % coins[0]== 0) return amount/coins[0];
    //    //            else return (int)1e9;
    //    //        }
    //
    //        int pick = (int) 1e9;
    //        if (coins[idx]<=amount) pick = 1 + solver(idx,coins,amount-coins[idx]);
    //        int notPick = solver(idx-1,coins,amount);
    //        return Math.min(pick,notPick);
    //    }
    //}


    //class Solution {
    //    public int coinChange(int[] coins, int amount) {
    //        int n = coins.length;
    //        int [][] dp = new int [n][amount+1];
    //        for (int i =0;i<n;i++){
    //            for (int j = 0;j<=amount;j++){
    //                dp[i][j] = -1;
    //            }
    //        }
    //        int ans = solver (n-1,coins,amount,dp);
    //        return ans==(int)1e9 ? -1 : ans;
    //    }
    //    int solver(int idx,int[]coins,int amount,int[][] dp){
    //        if (amount==0) return 0;
    //        if (idx==0){
    //            if (amount % coins[0]== 0) return amount/coins[0];
    //            else return (int)1e9;
    //        }
    //        if (dp[idx][amount]!=-1) return dp[idx][amount];
    //        int pick = (int) 1e9;
    //        if (coins[idx]<=amount) pick = 1 + solver(idx,coins,amount-coins[idx],dp);
    //        int notPick = solver(idx-1,coins,amount,dp);
    //        return dp[idx][amount] = Math.min(pick,notPick);
    //    }
    //}


    //class Solution {
    //    public int coinChange(int[] coins, int amount) {
    //        int n = coins.length;
    //        int [][] dp = new int [n][amount+1];
    //        for (int i =0;i<n;i++) dp[i][0]=0;
    //        for (int i = 0;i<=amount;i++){
    //            if (i % coins[0]==0) dp[0][i] =  i/coins[0];
    //            else dp[0][i] =  (int)1e9;
    //        }
    //        for (int idx =1;idx<n;idx++){
    //            for (int a = 0;a<=amount;a++){
    //                int pick = (int) 1e9;
    //                if (coins[idx]<=a) pick = 1 + dp[idx][a-coins[idx]];
    //                int notPick = dp[idx-1][a];
    //                dp[idx][a] = Math.min(pick,notPick);
    //            }
    //        }
    //        int ans = dp[n-1][amount];
    //        return ans==(int)1e9 ? -1 : ans;
    //    }
    //}


    //class Solution {
    //    public int coinChange(int[] coins, int amount) {
    //        int n = coins.length;
    //        int []dp = new int[amount+1];
    //        for (int i = 0;i<=amount;i++){
    //            if (i % coins[0]==0) dp[i] =  i/coins[0];
    //            else dp[i] =  (int)1e9;
    //        }
    //        for (int idx =1;idx<n;idx++){
    //            int [] cur= new int [amount+1];
    //            for (int a = 0;a<=amount;a++){
    //                int pick = (int) 1e9;
    //                if (coins[idx]<=a) pick = 1 + cur[a-coins[idx]];
    //                int notPick = dp[a];
    //                cur[a] = Math.min(pick,notPick);
    //            }
    //            dp = cur;
    //        }
    //        int ans = dp[amount];
    //        return ans==(int)1e9 ? -1 : ans;
    //    }
    //}
}
