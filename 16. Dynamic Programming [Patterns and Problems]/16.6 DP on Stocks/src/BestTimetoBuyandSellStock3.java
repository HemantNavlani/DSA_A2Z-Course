public class BestTimetoBuyandSellStock3 {

        //https://www.naukri.com/code360/problems/best-time-to-buy-and-sell-stock-iii_1071012?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
        //
        //class Solution {
        //    public int maxProfit(int[] prices) {
        //        int n = prices.length;
        //        int[][][] dp = new int [n][2][3];
        //        for (int i = 0;i<n;i++){
        //            for (int j = 0;j<2;j++){
        //                for(int k = 0;k<3;k++) {
        //                    dp[i][j][k] = -1;
        //                }
        //            }
        //        }
        //        return solver(0,1,2,prices,dp);
        //    }
        //    int solver(int i, int buy, int cap,int[] prices,int[][][]dp){
        //        if (i==prices.length) return 0;
        //        if (cap==0) return 0;
        //        if (dp[i][buy][cap]!=-1) return dp[i][buy][cap];
        //        if (buy==1) return dp[i][buy][cap] = Math.max(-prices[i]+solver(i+1,0,cap,prices,dp),solver(i+1,1,cap,prices,dp));
        //        else return dp[i][buy][cap] = Math.max(prices[i]+solver(i+1,1,cap-1,prices,dp),solver(i+1,0,cap,prices,dp));
        //    }
        //}

        //class Solution {
        //    public int maxProfit(int[] prices) {
        //        int n = prices.length;
        //        int[][][] dp = new int [n+1][2][3];
        //         for (int j = 0;j<2;j++){
        //            for(int k = 0;k<3;k++) {
        //                dp[n][j][k] = 0;
        //            }
        //        }
        //        for (int i = 0;i<n;i++){
        //            for (int j = 0;j<2;j++){
        //                dp[i][j][0]=0;
        //            }
        //        }
        //
        //        for (int i = n-1;i>=0;i--){
        //            for (int buy = 0;buy<2;buy++){
        //                for(int cap = 1;cap<3;cap++) {
        //                    if (buy==1) dp[i][buy][cap] = Math.max(-prices[i]+dp[i+1][0][cap],dp[i+1][1][cap]);
        //                    else dp[i][buy][cap] = Math.max(prices[i]+dp[i+1][1][cap-1],dp[i+1][0][cap]);
        //                }
        //            }
        //        }
        //        return dp[0][1][2];
        //    }
        //}

        //class Solution {
        //yaha base case zero hi hai isliye it can be ignored
        //    public int maxProfit(int[] prices) {
        //        int n = prices.length;
        //        int[][][] dp = new int [n+1][2][3];
        //
        //        for (int i = n-1;i>=0;i--){
        //            for (int buy = 0;buy<2;buy++){
        //                for(int cap = 1;cap<3;cap++) {
        //                    if (buy==1) dp[i][buy][cap] = Math.max(-prices[i]+dp[i+1][0][cap],dp[i+1][1][cap]);
        //                    else dp[i][buy][cap] = Math.max(prices[i]+dp[i+1][1][cap-1],dp[i+1][0][cap]);
        //                }
        //            }
        //        }
        //        return dp[0][1][2];
        //    }
        //
        //}

    //class Solution {
    //    public int maxProfit(int[] prices) {
    //        int n = prices.length;
    //        int[][] after = new int[2][3];
    //        for (int i = n-1;i>=0;i--){
    //        int[][] dp = new int[2][3];
    //            for (int buy = 0;buy<2;buy++){
    //                for(int cap = 1;cap<3;cap++) {
    //                    if (buy==1) dp[buy][cap] = Math.max(-prices[i]+after[0][cap],after[1][cap]);
    //                    else dp[buy][cap] = Math.max(prices[i]+after[1][cap-1],after[0][cap]);
    //                }
    //            }
    //            after = dp;
    //        }
    //        return after[1][2];
    //    }
    //
    //}
}
