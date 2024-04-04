public class KnapSack01 {
    //https://www.naukri.com/code360/problems/0-1-knapsack_920542?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    ////import java.util.* ;
    //    //import java.io.*;
    //    //
    //    //public class Solution{
    //    //    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
    //    //        return solver(n-1,weight,value,maxWeight);
    //    //    }
    //    //    static int solver(int idx,int[]weight,int[] value,int w,int[][]dp){
    //    //        if (idx<0) return 0;
    //    //        int pick = 0;
    //    //
    //    //        if (weight[idx]<=w) pick = value[idx] + solver(idx-1,weight,value,w-weight[idx]);
    //    //        int notPick = solver(idx-1,weight,value,w);
    //    //        return Math.max(pick,notPick);
    //    //    }
    //    //}


 //import java.util.* ;
    //import java.io.*;
    //
    //public class Solution{
    //    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
    //        int [][] dp = new int [n][maxWeight+1];
    //        for (int i= 0;i<n;i++){
    //            for (int j=0;j<=maxWeight;j++){
    //                dp[i][j] = -1;
    //            }
    //        }
    //
    //
    //
    //        return solver(n-1,weight,value,maxWeight,dp);
    //    }
    //    static int solver(int idx,int[]weight,int[] value,int w,int[][]dp){
    //        if (idx==0){
    //            if (weight[0]<=w) return value[0];
    //            return 0;
    //        }
    //        if (dp[idx][w]!=-1) return dp[idx][w];
    //        int pick = 0;
    //        if (weight[idx]<=w) pick = value[idx] + solver(idx-1,weight,value,w-weight[idx],dp);
    //        int notPick = solver(idx-1,weight,value,w,dp);
    //        return dp[idx][w] = Math.max(pick,notPick);
    //    }
    //}


    //import java.util.* ;
    //import java.io.*;
    //
    //public class Solution{
    //    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
    //        int [][] dp = new int [n][maxWeight+1];
    //
    //        for (int i=weight[0];i<=maxWeight;i++){
    //            if (weight[0]<=maxWeight) dp[0][i] = value[0];
    //        }
    //
    //            for (int idx =1;idx<n;idx++){
    //               for(int w=0;w<=maxWeight;w++) {
    //                    int pick = (int)-1e9;
    //                    if (weight[idx]<=w) pick = value[idx] + dp[idx-1][w-weight[idx]];
    //                    int notPick = dp[idx-1][w];
    //                    dp[idx][w] = Math.max(pick,notPick);
    //            }
    //        }
    //        return dp[n-1][maxWeight];
    //    }
    //}


    //import java.util.* ;
    //import java.io.*;
    //
    //public class Solution{
    //    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
    //        int [] dp = new int [maxWeight+1];
    //
    //        for (int i=weight[0];i<=maxWeight;i++){
    //            dp[i] = value[0];
    //        }
    //
    //            for (int idx =1;idx<n;idx++){
    //                int [] cur = new int[maxWeight+1];
    //               for(int w=0;w<=maxWeight;w++) {
    //                    int pick = (int)-1e9;
    //                    if (weight[idx]<=w) pick = value[idx] + dp[w-weight[idx]];
    //                    int notPick = dp[w];
    //                    cur[w] = Math.max(pick,notPick);
    //            }
    //            dp = cur;
    //        }
    //        return dp[maxWeight];
    //    }
    //}

    //more space optimised

}
