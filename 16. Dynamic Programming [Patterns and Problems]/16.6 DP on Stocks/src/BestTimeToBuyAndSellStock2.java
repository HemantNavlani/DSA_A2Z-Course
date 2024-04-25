public class BestTimeToBuyAndSellStock2 {
    //it depends on buy or not buy and fir uske according all possibilities try kari hai read the code you will get it
//    public class BestTimeToBuyAndSellStock2 {
        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
        //https://www.naukri.com/code360/problems/best-time-to-buy-and-sell-stock-ii_630282?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
        //class Solution {
        //    public int maxProfit(int[] prices) {
        //        boolean buy = true;
        //        return solver(0,buy,prices);
        //    }
        //    int solver(int i, boolean buy,int[]prices){
        //        if (i==prices.length) return 0;
        //        if (buy) return Math.max(-prices[i]+solver(i+1,false,prices),solver(i+1,true,prices));
        //        else return Math.max(prices[i]+solver(i+1,true,prices),solver(i+1,false,prices));
        //    }
        //}

        //class Solution {
        //    public int maxProfit(int[] prices) {
        //        int n = prices.length;
        //        int dp[][] = new int [n][2];
        //        for (int i = 0;i<n;i++){
        //            for (int j=0;j<2;j++){
        //                dp[i][j] = -1;
        //            }
        //        }
        //        return solver(0,1,prices,dp);
        //    }
        //    int solver(int i, int buy,int[]prices,int[][]dp){
        //        if (i==prices.length) return 0;
        //        if (dp[i][buy]!=-1) return dp[i][buy];
        //        int profit = 0;
        //        if (buy==1) profit = Math.max(-prices[i]+solver(i+1,0,prices,dp),solver(i+1,1,prices,dp));
        //        else profit =  Math.max(prices[i]+solver(i+1,1,prices,dp),solver(i+1,0,prices,dp));
        //        return dp[i][buy] = profit;
        //    }
        //}

        //class Solution {
        //    public int maxProfit(int[] prices) {
        //        int n = prices.length;
        //        int dp[][] = new int [n+1][2];
        //        dp[n][0] = 0;
        //        dp[n][1] = 0;
        //        for (int i = n-1;i>=0;i--){
        //            for (int buy=1;buy>=0;buy--){
        //                int profit = 0;
        //                if (buy==1) profit = Math.max(-prices[i]+dp[i+1][0],dp[i+1][1]);
        //                else profit =  Math.max(prices[i]+dp[i+1][1],dp[i+1][0]);
        //                dp[i][buy] = profit;
        //            }
        //        }
        //        return dp[0][1];
        //    }
        //    int solver(int i, int buy,int[]prices,int[][]dp){
        //        if (i==prices.length) return 0;
        //        if (dp[i][buy]!=-1) return dp[i][buy];
        //        int profit = 0;
        //        if (buy==1) profit = Math.max(-prices[i]+solver(i+1,0,prices,dp),solver(i+1,1,prices,dp));
        //        else profit =  Math.max(prices[i]+solver(i+1,1,prices,dp),solver(i+1,0,prices,dp));
        //        return dp[i][buy] = profit;
        //    }
        //}


        //class Solution {
        //    public int maxProfit(int[] prices) {
        //        int n = prices.length;
        //        int ahead[] = new int[2];
        //        for (int i = n-1;i>=0;i--){
        //            int[] cur = new int [2];
        //            for (int buy=1;buy>=0;buy--){
        //                int profit = 0;
        //                if (buy==1) profit = Math.max(-prices[i]+ahead[0],ahead[1]);
        //                else profit =  Math.max(prices[i]+ahead[1],ahead[0]);
        //                cur[buy] = profit;
        //            }
        //            ahead = cur;
        //        }
        //        return ahead[1];
        //    }
        //}

        //class Solution {
        //    public int maxProfit(int[] prices) {
        //        int n = prices.length;
        //        int ahead[] = new int[2];
        //        int aheadNotBuy=0;
        //        int aheadBuy=0;
        //        for (int i = n-1;i>=0;i--){
        //            int curBuy = Math.max(-prices[i]+aheadNotBuy,aheadBuy);
        //            int curNotBuy =  Math.max(prices[i]+aheadBuy,aheadNotBuy);
        //            aheadBuy = curBuy;
        //            aheadNotBuy = curNotBuy;
        //        }
        //        return aheadBuy;
        //    }
        //}
    }

}
