public class LongestBitonicSubsequence {
    //https://www.naukri.com/code360/problems/longest-bitonic-sequence_1062688?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //public class Solution {
    //ek bar seedha LIS chalao ek bar ulta jyada kuch nhi read the code once you will get it
    //    public static int longestBitonicSequence(int[] arr, int n) {
    //        int[] dp1 = new int[n];
    //        for (int i = 0;i<n;i++) dp1[i] = 1;
    //
    //        for (int i = 0;i<n;i++){
    //            for (int j = 0;j<i;j++){
    //                if (arr[i]>arr[j] && 1+dp1[j]> dp1[i]) dp1[i] = 1+dp1[j];
    //            }
    //        }
    //
    //        int[] dp2 =new int[n];
    //        for (int i = 0;i<n;i++) dp2[i] = 1;
    //        for (int i =n-1;i>=0;i--){
    //            for (int j = n-1;j>i;j--){
    //                if (arr[i]>arr[j] && 1+dp2[j]> dp2[i]) dp2[i] = 1+dp2[j];
    //            }
    //        }
    //        int max = -1;
    //        for (int i = 0;i<n;i++){
    //            max = Math.max(max,dp1[i]+dp2[i]-1);
    //        }
    //        return max;
    //    }
    //}
}
