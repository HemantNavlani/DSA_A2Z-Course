public class BestTimetoBuyandSellStockwithCooldown {
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
    //https://www.naukri.com/code360/problems/best-time-to-buy-and-sell-stock-with-cooldown_3125969?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
    //    public int maxProfit(int[] prices) {
    //        int n = prices.length;
    //        int [][] dp = new int [n][2];
    //        for (int i = 0;i<n;i++){
    //            for (int j = 0;j<2;j++){
    //                dp[i][j]=-1;
    //            }
    //        }
    //        return solver(0,1,prices,dp);
    //    }
    //    int solver (int i,int buy, int[]prices,int[][]dp){
    //        if (i>=prices.length) return 0;
    //        if (dp[i][buy]!=-1) return dp[i][buy];
    //        if (buy==1) return dp[i][buy] = Math.max(-prices[i]+solver(i+1,0,prices,dp),solver(i+1,1,prices,dp));
    //        else return dp[i][buy] = Math.max(prices[i]+solver(i+2,1,prices,dp),solver(i+1,0,prices,dp));
    //    }
    //}

    //class Solution {
    //    public int maxProfit(int[] prices) {
    //        int n = prices.length;
    //        int [][] dp = new int [n+2][2];
    //        for (int i = n-1;i>=0;i--){
    //            for (int buy = 0;buy<2;buy++){
    //                if (buy==1) dp[i][buy] = Math.max(-prices[i]+dp[i+1][0],dp[i+1][1]);
    //                else dp[i][buy] = Math.max(prices[i]+dp[i+2][1],dp[i+1][0]);
    //            }
    //        }
    //        return dp[0][1];
    //    }
    //}
    //class Solution {
    //    public int maxProfit(int[] prices) {
    //        int n = prices.length;
    //        int [][] dp = new int [n+2][2];
    //        for (int i = n-1;i>=0;i--){
    //            dp[i][1] = Math.max(-prices[i]+dp[i+1][0],dp[i+1][1]);
    //            dp[i][0] = Math.max(prices[i]+dp[i+2][1],dp[i+1][0]);
    //        }
    //        return dp[0][1];
    //    }
    //}

//    class Solution {
//    public int maxProfit(int[] prices) {
//        int n = prices.length;
//        int [][] dp = new int [n+2][2];
//        int[] cur = new int[2];
//        int[] front2 = new int[2];
//        int[] front1 = new int[2];
//        for (int i = n-1;i>=0;i--){
//            cur[1] = Math.max(-prices[i]+front1[0],front1[1]);
//            cur[0] = Math.max(prices[i]+front2[1],front1[0]);
//            front2[0] = front1[0];
//            front2[1] = front1[1];
//            front1[0] = cur[0];
//            front1[1] = cur[1];
//        }
//        return cur[1];
//    }
//}

}
