public class WildCardMatching {
    //https://leetcode.com/problems/wildcard-matching/
    //https://www.naukri.com/code360/problems/wildcard-pattern-matching_701650?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
//        public boolean isMatch(String s, String p) {
//            int m = s.length();
//            int n = p.length();
//            return solver(m-1,n-1,s,p);
//        }
//        boolean solver(int i,int j, String s,String p){
//            if (i<0 && j<0) return true;
//            if (i>=0 && j<0) return false;
//            if (i<0){
//                while (j>=0) if (p.charAt(j--)!='*') return false;
//                return true;
//            }
//            if (s.charAt(i)==p.charAt(j) || p.charAt(j)=='?') return solver(i-1,j-1,s,p);
//            else if (p.charAt(j)=='*') return solver(i-1,j,s,p) || solver(i-1,j-1,s,p) || solver(i,j-1,s,p);
//            else return false;
//        }
//     }

    //memoization
    //class Solution {
    //        public boolean isMatch(String s, String p) {
    //            int m = s.length();
    //            int n = p.length();
    //            int[][] dp = new int[m][n];
    //            for (int i = 0;i<m;i++){
    //                for (int j = 0;j<n;j++){
    //                    dp[i][j]=-1;
    //                }
    //            }
    //            return solver(m-1,n-1,s,p,dp);
    //        }
    //        boolean solver(int i,int j, String s,String p,int[][]dp){
    //            if (i<0 && j<0) return true;
    //            if (i>=0 && j<0) return false;
    //            if (i<0){
    //                while (j>=0) if (p.charAt(j--)!='*') return false;
    //                return true;
    //            }
    //            if (dp[i][j]!=-1) return dp[i][j]==1;
    //            if (s.charAt(i)==p.charAt(j) || p.charAt(j)=='?') {
    //                boolean temp = solver(i-1,j-1,s,p,dp);
    //                if (temp) dp[i][j] = 1;
    //                else dp[i][j]=0;
    //                return temp;
    //            }
    //            else if (p.charAt(j)=='*'){
    //                boolean temp =  solver(i-1,j,s,p,dp) || solver(i-1,j-1,s,p,dp) || solver(i,j-1,s,p,dp);
    //                if (temp) dp[i][j]=1;
    //                else dp[i][j]=0;
    //                return temp;
    //            }
    //            else{
    //                dp[i][j]=0;
    //                return false;
    //            }
    //        }
    //     }

    ///memoization with 1 based indexing
    //class Solution {
    //        public boolean isMatch(String s, String p) {
    //            int m = s.length();
    //            int n = p.length();
    //            int[][] dp = new int[m+1][n+1];
    //            for (int i = 0;i<=m;i++){
    //                for (int j = 0;j<=n;j++){
    //                    dp[i][j]=-1;
    //                }
    //            }
    //            return solver(m,n,s,p,dp);
    //        }
    //        boolean solver(int i,int j, String s,String p,int[][]dp){
    //            if (i==0 && j==0) return true;
    //            if (i>0 && j==0) return false;
    //            if (i==0){
    //                while (j>0) if (p.charAt((j--)-1)!='*') return false;
    //                return true;
    //            }
    //            if (dp[i][j]!=-1) return dp[i][j]==1;
    //            if (s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?') {
    //                boolean temp = solver(i-1,j-1,s,p,dp);
    //                if (temp) dp[i][j] = 1;
    //                else dp[i][j]=0;
    //                return temp;
    //            }
    //            else if (p.charAt(j-1)=='*'){
    //                boolean temp =  solver(i-1,j,s,p,dp) || solver(i-1,j-1,s,p,dp) || solver(i,j-1,s,p,dp);
    //                if (temp) dp[i][j]=1;
    //                else dp[i][j]=0;
    //                return temp;
    //            }
    //            else{
    //                dp[i][j]=0;
    //                return false;
    //            }
    //        }
    //     }



    //tabulation
    //class Solution {
    //        public boolean isMatch(String s, String p) {
    //            int m = s.length();
    //            int n = p.length();
    //            boolean[][] dp = new boolean[m+1][n+1];
    //            dp[0][0] = true;
    //            for (int i = 1;i<=m;i++) dp[i][0] = false;
    //           for (int j = 1;j<=n;j++) {
    //                boolean flag = true;
    //                for (int a = 1;a<=j;a++){
    //                    if (p.charAt(a-1)!='*'){
    //                        flag = false;
    //                        break;
    //                    }
    //                }
    //                dp[0][j] = flag;
    //            }
    //            for (int i = 1;i<=m;i++){
    //                for (int j = 1;j<=n;j++){
    //                    if (s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?') {
    //                        dp[i][j] = dp[i-1][j-1];
    //                    }
    //                    else if (p.charAt(j-1)=='*'){
    //                        dp[i][j] =  dp[i-1][j] || dp[i][j-1];
    //                    }
    //                    else{
    //                    dp[i][j]=false;
    //                    }
    //                }
    //            }
    //            return dp[m][n];
    //        }
    //
    //     }


    //tabulation space optimised
    //class Solution {
    //        public boolean isMatch(String s, String p) {
    //            int m = s.length();
    //            int n = p.length();
    //            boolean[]dp = new boolean[n+1];
//    dp[0] = true;
    //           for (int j = 1;j<=n;j++) {
    //                boolean flag = true;
    //                for (int a = 1;a<=j;a++){
    //                    if (p.charAt(a-1)!='*'){
    //                        flag = false;
    //                        break;
    //                    }
    //                }
    //                dp[j] = flag;
    //            }
    //            for (int i = 1;i<=m;i++){
    //                boolean[] cur = new boolean [n+1];
    //                for (int j = 1;j<=n;j++){
    //                    if (s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?') cur[j] = dp[j-1];
    //                    else if (p.charAt(j-1)=='*') cur[j] =  dp[j] || cur[j-1];
    //                    else cur[j]=false;
    //                }
    //                dp = cur;
    //            }
    //            return dp[n];
    //        }
    //
    //     }

}
