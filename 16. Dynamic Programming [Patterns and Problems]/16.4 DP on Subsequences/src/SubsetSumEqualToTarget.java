public class SubsetSumEqualToTarget {
//    https://www.naukri.com/code360/problems/subset-sum-equal-to-k_1550954?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //import java.util.* ;
    //import java.io.*;
    //public class Solution {
    //    public static boolean subsetSumToK(int n, int k, int arr[]){
    //        return solver(0,k,arr,n);
    //    }
    //    static boolean solver (int idx,int k, int[] arr,int n){
    //        if (k==0) return true;
    //        if (idx == n || k<0) return false;
    //        return solver(idx+1,k-arr[idx],arr,n) || solver(idx+1,k,arr,n);
    //    }
    //}

 //      import java.util.* ;
    //       import java.io.*;
    //       public class Solution {
    //          public static boolean subsetSumToK(int n, int k, int arr[]){
    //              int [][] dp = new int [n][k+1];
    //              for (int i = 0;i<n;i++){
    //                  for (int j= 0;j<=k;j++) dp[i][j] = -1;
    //              }
    //              return solver(0,k,arr,n,dp);
    //          }
    //          static boolean solver (int idx,int k, int[] arr,int n,int[][]dp){
    //              if (k==0) return true;
    //              if (idx == n || k<0) return false;
    //              if (dp[idx][k]!=-1){
    //                  if (dp[idx][k]==1) return true;
    //                  else return false;
    //              }
    //              boolean ans =  solver(idx+1,k-arr[idx],arr,n,dp) || solver(idx+1,k,arr,n,dp);
    //              if (ans) dp[idx][k] = 1;
    //              else dp[idx][k] = 0;
    //              return ans;
    //          }
    //       }


    //    import java.util.* ;
    //    import java.io.*;
    //    public class Solution {
    //       public static boolean subsetSumToK(int n, int k, int arr[]){
    //           boolean [][] dp = new boolean [n][k+1];
    //           for (int i = 0;i<n;i++) dp[i][0] =true;
    //           if (arr[0] <= k) dp[0][arr[0]] = true;
    //
    //           for (int idx= 1;idx<n;idx++){
    //               for (int target = 1;target<=k;target++){
    //                    boolean notPick = dp[idx-1][target];
    //                    boolean pick = false;
    //                    if (arr[idx]<=target) pick =  dp[idx-1][target-arr[idx]];
    //                    dp[idx][target] = pick || notPick;
    //               }
    //           }
    //           return dp[n-1][k];
    //       }
    //    }

    //    import java.util.* ;
    //    import java.io.*;
    //    public class Solution {
    //       public static boolean subsetSumToK(int n, int k, int arr[]){
    //           boolean []dp = new boolean [k+1];
    //           dp[0] =true;
    //           if (arr[0] <= k) dp[arr[0]] = true;
    //
    //           for (int idx= 1;idx<n;idx++){
    //               boolean[] curr = new boolean[k+1];
    //               curr[0] = true;
    //               for (int target = 1;target<=k;target++){
    //                    boolean notPick = dp[target];
    //                    boolean pick = false;
    //                    if (arr[idx]<=target) pick =  dp[target-arr[idx]];
    //                    curr[target] = pick || notPick;
    //               }
    //               dp = curr;
    //           }
    //           return dp[k];
    //       }
    //    }
}

