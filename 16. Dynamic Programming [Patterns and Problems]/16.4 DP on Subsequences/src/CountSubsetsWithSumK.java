public class CountSubsetsWithSumK {
    //https://www.naukri.com/code360/problems/count-subsets-with-sum-k_3952532?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //import java.util.*;
    //import java.io.*;
    //
    //public class Solution {
    //    public static int findWays(int nums[], int k) {
    //        int n = nums.length;
    //        return solver(n-1,nums,k);
    //    }
    //    static int solver(int idx,int [] nums,int k){
    //        if (k==0) return 1;
    //        if (idx==0) {
    //            if (nums[idx]==k) return 1;
    //            else return 0;
    //        }
    //        int pick  = 0;
    //        if (nums[idx]<=k) pick = solver(idx-1,nums,k-nums[idx]);
    //        int notPick =  solver(idx-1,nums,k);
    //        return pick + notPick;
    //    }
    //}


    //import java.util.*;
    //import java.io.*;
    //    public class Solution {
    //         public static int findWays(int nums[], int k) {
    //           int n = nums.length;
    //           int [][] dp = new int [n][k+1];
    //           for (int i = 0;i<n;i++){
    //               for (int j = 0;j<=k;j++) dp[i][j] = -1;
    //           }
    //           return solver(n-1,nums,k,dp) % ((int) (1e9 + 7));
    //       }
    //       static int solver(int idx,int [] nums,int k,int[][]dp){
    //           if (idx==0) {
    //               if (nums[0]==0 && k==0) return 2;
    //                if (k==0 || k==nums[0]) return 1;
    //                return 0;
    //           }
    //           if (dp[idx][k]!=-1) return dp[idx][k];
    //           int pick  = 0;
    //           if (nums[idx]<=k) pick = solver(idx-1,nums,k-nums[idx],dp) % ((int) (1e9 + 7));
    //           int notPick =  solver(idx-1,nums,k,dp) % ((int) (1e9 + 7));
    //           return dp[idx][k] = (pick + notPick) % ((int) (1e9 + 7));
    //       }
    //    }

    //import java.util.*;
    //import java.io.*;
    //  public class Solution {
    //       public static int findWays(int nums[], int k) {
    //           int n = nums.length;
    //           int [][] dp = new int[n][k+1];
    //            for (int i = 0;i<n;i++) dp[i][0] = 1;
    //            if (nums[0]<=k) {
    //                if (nums[0]==0) dp[0][0] = 2;
    //                else dp[0][nums[0]] = 1;
    //            }
    //
    //           for (int idx = 1;idx<n;idx++){
    //               for (int j = 0;j<=k;j++){
    //                    int pick  = 0;
    //                    if (nums[idx]<=j) pick = dp[idx-1][j-nums[idx]] % ((int)(1e9+7));
    //                    int notPick =  dp[idx-1][j] % ((int)(1e9+7));
    //                    dp[idx][j]= pick + notPick % ((int)(1e9+7));
    //               }
    //           }
    //           return dp[n-1][k] % ((int)(1e9+7));
    //       }
    //  }


    //import java.util.*;
    //import java.io.*;
    //  public class Solution {
    //       public static int findWays(int nums[], int k) {
    //           int n = nums.length;
    //           int [] dp = new int[k+1];
    //            for (int i = 0;i<n;i++) dp[0] = 1;
    //            if (nums[0]<=k) {
    //                if (nums[0]==0) dp[0] = 2;
    //                else dp[nums[0]] = 1;
    //            }
    //
    //           for (int idx = 1;idx<n;idx++){
    //               int [] cur = new int [k+1];
    //               cur[0] = 1;
    //               for (int j = 0;j<=k;j++){
    //                    int pick  = 0;
    //                    if (nums[idx]<=j) pick = dp[j-nums[idx]] % ((int)(1e9+7));
    //                    int notPick =  dp[j] % ((int)(1e9+7));
    //                    cur[j]= pick + notPick % ((int)(1e9+7));
    //               }
    //               dp = cur;
    //           }
    //           return dp[k] % ((int)(1e9+7));
    //       }
    //  }
}
