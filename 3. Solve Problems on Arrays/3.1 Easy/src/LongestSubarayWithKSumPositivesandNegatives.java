

public class LongestSubarayWithKSumPositivesandNegatives {
    //https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_5713505?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
    //https://youtu.be/frf7qxiN2qU?si=u4-9AgyHl6MFxA_k
    //Watch this video for better approach
    ////Yaha maine 2 loops lagaye hai try for better approach
    //This has O(n^2) time complexity.

    //This is the Brute Force Approach
    //public class Solution {
    //    public static int longestSubarrayWithSumK(int []a, long k) {
    //        int max = 0;
    //      for (int i=0;i<a.length;i++){
    //          int l = 0;
    //          long sum = 0;
    //          for(int j=i;j<a.length;j++){
    //              sum+=a[j];
    //              if (sum==k){
    //                  l = j-i+1;
    //                  max = Math.max(l, max);
    //              }
    //          }
    //      }
    //      return max;
    //}
    //}



    //
    //For better approach we will use a hashmap
    //usme ham har index ke corresponding uska prefix sum store karenge(hashmap me),
    //aur fir aage badte jayenge aur dekhenge ki jo current index tak ka sum hai - the sum given in question , ye jo aaya
    //kya vo kisi ka bhi prefix sum tha ya nahi agar haan toh ham length nikal lenge aur vo max se badi hui toh usse max kar denge


    //*** Ye approach positive and negative dono ke liye work karegi
    // This has O(n) time complexity and O(n) space complexity
    //and is question me positive and negative dono hai isliye iske liye ye hi best approach hai
    //import java.util.* ;
    //import java.io.*;
    //public class Solution {
    //	public static int getLongestSubarray(int []a, int k) {
    //        //This is a better approach - Hashmap used
    //        HashMap<Long,Integer> mp  = new HashMap<>();
    //        long sum = 0;
    //        int maxLen = 0;
    //
    //        for (int i=0;i<a.length;i++){
    //            sum+=a[i];
    //            if (sum==k){
    //                maxLen = Math.max(maxLen, i+1);
    //            }
    //            long rem = sum - k;
    //            if (mp.containsKey(rem)){
    //                int l = i - mp.get(rem);
    //                maxLen = Math.max(maxLen,l);
    //            }
    //            if (!mp.containsKey(sum)) mp.put(sum, i);
    //        }
    //        return maxLen;
    //
    //	}
    //}




}
