public class NinjaTraining {
    //https://www.naukri.com/code360/problems/ninja%E2%80%99s-training_3621003?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //

    //recursion
    //public class Solution {
    //    public static int ninjaTraining(int n, int points[][]) {
    //        return solver (n-1,3,points);
    //    }
    //    static int solver (int idx, int last,int [][] points){
    //        if (idx == 0) {
    //            int max = 0;
    //            for (int i = 0;i<3;i++){
    //                if (i!=last) max = Math.max(max,points[0][i]);
    //            }
    //            return max;
    //        }
    //        int max = 0;
    //        for (int i = 0;i<3;i++){
    //            if (i!=last) {
    //                max = Math.max(max,points[idx][i]+solver(idx-1,i,points));
    //            }
    //        }
    //        return max;
    //    }
    //}

    //memoization

    //TC --> O(N*4) * 3
    // SC --> O(N) and O(N*4)
    //public class Solution {
    //    public static int ninjaTraining(int n, int points[][]) {
    //        int [][] dp = new int [n][4];
    //        for (int i= 0;i<n;i++){
    //            for (int j = 0;j<4;j++) dp[i][j] = -1;
    //        }
    //        return solver (n-1,3,points,dp);
    //    }
    //    static int solver (int idx, int last,int [][] points,int[][]dp){
    //        if (idx == 0) {
    //            int max = 0;
    //            for (int i = 0;i<3;i++){
    //                if (i!=last) max = Math.max(max,points[0][i]);
    //            }
    //            return max;
    //        }
    //        if (dp[idx][last]!=-1) return dp[idx][last];
    //        int max = 0;
    //        for (int i = 0;i<3;i++){
    //            if (i!=last) {
    //                max = Math.max(max,points[idx][i]+solver(idx-1,i,points,dp));
    //            }
    //        }
    //        return dp[idx][last] = max;
    //    }
    //}

    //tabulation
    //TC --> O(N*4) * 3
    // SC --> O(N*4)
    //public class Solution {
    //    public static int ninjaTraining(int n, int points[][]) {
    //        int [][] dp = new int [n][4];
    //        dp[0][0] = Math.max(points[0][1],points[0][2]);
    //        dp[0][1] = Math.max(points[0][0],points[0][2]);
    //        dp[0][2] = Math.max(points[0][1],points[0][0]);
    //        dp[0][3] = Math.max(points[0][2] ,Math.max(points[0][1],points[0][0]));
    //
    //
    //        for (int idx = 1;idx<n;idx++){
    //            for (int last = 0;last<4;last++){
    //                int max = 0;
    //                for (int i = 0;i<3;i++){
    //                    if (i!=last) {
    //                        max = Math.max(max,points[idx][i]+dp[idx-1][i]);
    //                    }
    //                }
    //                dp[idx][last] = max;
    //            }
    //        }
    //        return dp[n-1][3];
    //    }
    //}


    //space optimised
    //TC -> O(N*4) *3
    //SC -> O(4)
    //public class Solution {
    //    public static int ninjaTraining(int n, int points[][]) {
    //        int [] dp = new int [4];
    //        dp[0] = Math.max(points[0][1],points[0][2]);
    //        dp[1] = Math.max(points[0][0],points[0][2]);
    //        dp[2] = Math.max(points[0][1],points[0][0]);
    //        dp[3] = Math.max(points[0][2] ,Math.max(points[0][1],points[0][0]));
    //
    //
    //        for (int idx = 1;idx<n;idx++){
    //            int[] temp = new int[4];
    //            for (int last = 0;last<4;last++){
    //                int max = 0;
    //                for (int i = 0;i<3;i++){
    //                    if (i!=last) {
    //                        max = Math.max(max,points[idx][i]+dp[i]);
    //                    }
    //                }
    //                temp[last] = max;
    //            }
    //            dp = temp;
    //        }
    //        return dp[3];
    //    }
    //}

}
