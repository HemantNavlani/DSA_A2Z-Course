public class MinimumCostToCutTheStick {
    //https://www.naukri.com/code360/problems/cost-to-cut-a-chocolate_3208460?interviewBundleRedirection=true&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/minimum-cost-to-cut-a-stick/
    //class Solution {
    //    public int minCost(int n, int[] cuts) {
    //        int c = cuts.length;
    //        int [] arr = new int[c+2];
    //        arr[0]=0;
    //        for (int i =0;i<cuts.length;i++){
    //            arr[i+1] = cuts[i];
    //        }
    //        arr[c+1] = n;
    //        Arrays.sort(arr);
    //        int[][]dp = new int[c+1][c+1];
    //        for (int i = 0;i<=c;i++){
    //            for (int j= 0;j<=c;j++) dp[i][j]=-1;
    //        }
    //        return solver(1,c,arr,dp);
    //    }
    //    int solver(int i, int j,int[] cuts,int[][]dp){
    //        if (i>j) return 0;
    //        if (dp[i][j]!=-1) return dp[i][j];
    //        int min = (int)1e9;
    //        for (int k = i;k<=j;k++){
    //            int cost = cuts[j+1]-cuts[i-1]+solver(i,k-1,cuts,dp)+solver(k+1,j,cuts,dp);
    //            min = Math.min(min,cost);
    //        }
    //        return dp[i][j]=min;
    //    }
    //}

    //class Solution {
    //    public int minCost(int n, int[] cuts) {
    //        int c = cuts.length;
    //        int [] arr = new int[c+2];
    //        arr[0]=0;
    //        for (int i =0;i<cuts.length;i++){
    //            arr[i+1] = cuts[i];
    //        }
    //        arr[c+1] = n;
    //        Arrays.sort(arr);
    //        int[][]dp = new int[c+2][c+2];
    //
    //        for (int i = c;i>=1;i--){
    //            for (int j= 1;j<=c;j++){
    //                if (i>j) continue;
    //                int min = (int)1e9;
    //                for (int k = i;k<=j;k++){
    //                    int cost = arr[j+1]-arr[i-1]+dp[i][k-1]+dp[k+1][j];
    //                    min = Math.min(min,cost);
    //                }
    //            dp[i][j]=min;
    //            }
    //        }
    //        return dp[1][c];
    //    }
    //}
}
