public class BestTimetoBuyandSellStockwithTransactionFee {
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/submissions/1241917680/
    //https://www.naukri.com/code360/problems/best-time-to-buy-and-sell-stock-with-transaction-fee_3118974?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
    //    public int maxProfit(int[] prices, int fee) {
    //        int n = prices.length;
    //        int [][] dp = new int [n][2];
    //        for (int i =0;i<n;i++){
    //            dp[i][0]=-1;
    //            dp[i][1]=-1;
    //        }
    //        return solver(0,1,prices,fee,dp);
    //    }
    //    int solver(int i,int buy,int[]prices,int fee,int[][]dp){
    //        if (i==prices.length) return 0;
    //        if (dp[i][buy]!=-1) return dp[i][buy];
    //        if (buy==1) return dp[i][buy] = Math.max(-prices[i]-fee+solver(i+1,0,prices,fee,dp),solver(i+1,1,prices,fee,dp));
    //        else return dp[i][buy] = Math.max(prices[i]+solver(i+1,1,prices,fee,dp),solver(i+1,0,prices,fee,dp));
    //    }
    //}

    //class Solution {
    //    public int maxProfit(int[] prices, int fee) {
    //        int n = prices.length;
    //        int [][] dp = new int [n+1][2];
    //        for (int i =n-1;i>=0;i--){
    //            dp[i][1] = Math.max(-prices[i]-fee+dp[i+1][0],dp[i+1][1]);
    //            dp[i][0] = Math.max(prices[i]+dp[i+1][1],dp[i+1][0]);
    //        }
    //        return dp[0][1];
    //    }
    //}

    //class Solution {
    //    public int maxProfit(int[] prices, int fee) {
    //        int n = prices.length;
    //        int [] ahead = new int[2];
    //        for (int i =n-1;i>=0;i--){
    //            int[] cur = new int[2];
    //            cur[1] = Math.max(-prices[i]-fee+ahead[0],ahead[1]);
    //            cur[0] = Math.max(prices[i]+ahead[1],ahead[0]);
    //            ahead = cur;
    //        }
    //        return ahead[1];
    //    }
    //}
}
