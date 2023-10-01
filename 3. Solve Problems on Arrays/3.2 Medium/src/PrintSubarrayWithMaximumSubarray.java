public class PrintSubarrayWithMaximumSubarray {
    //https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //public class Solution {
    //    public static int longestSubarrayWithSumK(int []a, long k) {
    //        int i =0;
    //        int j=0;
    //        long sum = 0;
    //        int maxLen = 0;
    //        while(i<a.length && j<a.length){
    //            sum+=a[i];
    //            if (sum>k){
    //                while (sum>k){
    //                    sum-=a[j];
    //                    j++;
    //                }
    //            }
    //            if (sum==k){
    //               maxLen =  Math.max(maxLen, i-j+1);
    //            }
    //            i++;
    //        }
    //        return maxLen;
    //    }
    //}
}
