import java.util.HashMap;

public class EvaluateBooleanSubexpression {
    //https://www.naukri.com/code360/problems/boolean-evaluation_1214650?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
    //https://leetcode.com/problems/parsing-a-boolean-expression/description/
    //partition dp hi hai mcm ki tarah see out badiya question hai
    //public class Solution {
    //    static long mod =1000000007;
    //    public static int evaluateExp(String exp) {
    //        int n = exp.length();
    //        int isTrue = 1;
    //        long [][][] dp = new long[n][n][2];
    //        for (int i = 0;i<n;i++){
    //            for (int j = 0;j<n;j++){
    //                dp[i][j][0] = -1;
    //                dp[i][j][1] = -1;
    //            }
    //        }
    //        return (int) solver(0,n-1,isTrue,exp,dp);
    //    }
    //    static long solver (int i, int j, int isTrue,String exp,long[][][]dp){
    //        if (i>j) return 0;
    //        if (i==j){
    //            if (isTrue==1) {
    //                if(exp.charAt(i)=='T') return 1;
    //                else return 0;
    //            }
    //            else {
    //                if (exp.charAt(i)=='F') return 1;
    //                else return 0;
    //            }
    //        }
    //        if (dp[i][j][isTrue]!=-1) return dp[i][j][isTrue];
    //        long ways = 0;
    //        for (int idx = i+1;idx<=j-1;idx+=2){
    //            long leftTrue = solver(i,idx-1,1,exp,dp);
    //            long leftFalse = solver(i,idx-1,0,exp,dp);
    //            long rightTrue = solver(idx+1,j,1,exp,dp);
    //            long rightFalse = solver(idx+1,j,0,exp,dp);
    //
    //            if (exp.charAt(idx)=='&'){
    //                if (isTrue==1) ways+= ( leftTrue * rightTrue)%mod;
    //                else ways+=( (leftFalse* rightTrue)%mod +( rightFalse * leftTrue )%mod+ (leftFalse * rightFalse)%mod)%mod;
    //            }
    //            else if (exp.charAt(idx)=='|'){
    //                if (isTrue==1) ways+=((leftFalse* rightTrue )%mod+ (rightFalse * leftTrue )%mod+( leftTrue * rightTrue)%mod)%mod;
    //                else ways += (leftFalse* rightFalse)%mod;
    //            }
    //            else if (exp.charAt(idx)=='^'){
    //                if (isTrue==1) ways+=((rightTrue*leftFalse)%mod + (rightFalse*leftTrue)%mod) %mod;
    //                else ways+=((rightTrue*leftTrue)%mod +  (rightFalse *leftFalse)%mod)%mod;
    //            }
    //        }
    //        return dp[i][j][isTrue] =  ways%mod;
    //
    //    }
    //}
       

}
