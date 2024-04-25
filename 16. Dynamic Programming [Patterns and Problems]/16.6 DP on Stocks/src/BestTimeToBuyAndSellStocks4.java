public class BestTimeToBuyAndSellStocks4 {
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
    //https://www.naukri.com/code360/problems/best-time-to-buy-and-sell-stock-iv_1080698?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    //class Solution {
    //    public int maxProfit(int k, int[] prices) {
    //        int n = prices.length;
    //        int dp[][] = new int [n][2*k];
    //        for (int i = 0;i<n;i++){
    //            for(int j =0;j<2*k;j++) {
    //                dp[i][j] = -1;
    //            }
    //        }
    //        return solver(0,0,k,prices,dp);
    //    }
    //    int solver(int i, int trans, int k, int []prices,int[][]dp){
    //        if (i==prices.length) return 0;
    //        if (trans==2*k)return 0;
    //        if (dp[i][trans]!=-1) return dp[i][trans];
    //        if (trans%2==0)  return dp[i][trans] =  Math.max(-prices[i]+solver(i+1,trans+1,k,prices,dp),solver(i+1,trans,k,prices,dp));
    //        else return dp[i][trans] =  Math.max(prices[i]+solver(i+1,trans+1,k,prices,dp),solver(i+1,trans,k,prices,dp));
    //    }
    //}


    //class Solution {
    //    public int maxProfit(int k, int[] prices) {
    //        int n = prices.length;
    //        int dp[][] = new int [n+1][2*k+1];
    //        for (int i = n-1;i>=0;i--){
    //            for(int trans =0;trans<2*k;trans++) {
    //                if (trans%2==0) dp[i][trans] =  Math.max(-prices[i]+dp[i+1][trans+1],dp[i+1][trans]);
    //                else  dp[i][trans] =  Math.max(prices[i]+dp[i+1][trans+1],dp[i+1][trans]);
    //            }
    //        }
    //        return dp[0][0];
    //    }
    //}

    //class Solution {
    //    public int maxProfit(int k, int[] prices) {
    //        int n = prices.length;
    //        int ahead[] = new int [2*k+1];
    //        for (int i = n-1;i>=0;i--){
    //            int cur[] = new int[2*k+1];
    //            for(int trans =0;trans<2*k;trans++) {
    //                if (trans%2==0) cur[trans] =  Math.max(-prices[i]+ahead[trans+1],ahead[trans]);
    //                else  cur[trans] =  Math.max(prices[i]+ahead[trans+1],ahead[trans]);
    //            }
    //            ahead = cur;
    //        }
    //        return ahead[0];
    //    }
    //}
}