import java.util.ArrayList;
import java.util.Collections;

public class LongestIncreasingSubsequence {
    //https://leetcode.com/problems/longest-increasing-subsequence/description/
//    https://www.naukri.com/code360/problems/longest-increasing-subsequence_630459?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    //class Solution {
    //    public int lengthOfLIS(int[] nums) {
    //
    //        return solver(0,-1,nums);
    //    }
    //    int solver (int i, int prevIdx,int[]nums){
    //        if (i==nums.length) return 0;
    //        int len = solver(i+1,prevIdx,nums);
    //        if (prevIdx==-1 || nums[i]>nums[prevIdx]) len =  Math.max(1+solver(i+1,i,nums),len);
    //        return len;
    //    }
    //}
    //class Solution {
    //    public int lengthOfLIS(int[] nums) {
    //        int n  = nums.length;
    //        int[][] dp = new int [n][n+1];
    //        for (int i = 0;i<n;i++){
    //            for (int j= 0;j<=n;j++) dp[i][j]=-1;
    //        }
    //        return solver(0,-1,nums,dp);
    //    }
    //    int solver (int i, int prevIdx,int[]nums,int[][]dp){
    //        if (i==nums.length) return 0;
    //        if (dp[i][prevIdx+1]!=-1) return dp[i][prevIdx+1];
    //        int len = solver(i+1,prevIdx,nums,dp);
    //        if (prevIdx==-1 || nums[i]>nums[prevIdx]) len =  Math.max(1+solver(i+1,i,nums,dp),len);
    //        return dp[i][prevIdx+1] = len;
    //    }
    //}

    //class Solution {
    //    public int lengthOfLIS(int[] nums) {
    //        int n  = nums.length;
    //        int[][] dp = new int [n+1][n+1];
    //
    //        for (int i =n-1;i>=0;i--){
    //            for (int prevIdx= i-1;prevIdx>=-1;prevIdx--){
    //                int len = dp[i+1][prevIdx+1];
    //                if (prevIdx==-1 || nums[i]>nums[prevIdx]) len =  Math.max(1+dp[i+1][i+1],len);
    //                dp[i][prevIdx+1] = len;
    //            }
    //        }
    //        return dp[0][0];
    //    }
    //}



    //class Solution {
    //    public int lengthOfLIS(int[] nums) {
    //        int n  = nums.length;
    //        int[] ahead = new int[n+1];
    //
    //        for (int i =n-1;i>=0;i--){
    //            int[] cur = new int[n+1];
    //            for (int prevIdx= i-1;prevIdx>=-1;prevIdx--){
    //                int len = ahead[prevIdx+1];
    //                if (prevIdx==-1 || nums[i]>nums[prevIdx]) len =  Math.max(1+ahead[i+1],len);
    //                cur[prevIdx+1] = len;
    //            }
    //            ahead = cur;
    //        }
    //        return ahead[0];
    //    }
    //}

    //class Solution {
    //    public int lengthOfLIS(int[] nums) {
    //        int n = nums.length;
    //        int [] dp = new int [n];
    //        for (int i=0;i<n;i++){
    //            for (int prev = 0;prev<i;prev++){
    //                if (nums[i]>nums[prev]){
    //                    dp[i] = Math.max(dp[i],1+dp[prev]);
    //                }
    //            }
    //        }
    //        // since 1 toh minimum hoga hi sbka, toh initial value ko 1 rkne ki jagah max nikalke usme 1 add kardo 1 loop bach jayega
    //        int ans = Integer.MIN_VALUE;
    //        for (int i = 0;i<n;i++){
    //            ans = Math.max(ans,dp[i]);
    //        }
    //        return ans+1;
    //    }
    //}


    //note that we are not generating the LIS we are just only making the length of the LIS thats all
    //class Solution {
    //    public int lengthOfLIS(int[] nums) {
    //        int n = nums.length;
    //        ArrayList<Integer> temp = new ArrayList<>();
    //        temp.add(nums[0]);
    //        int len = 1;
    //        for (int i=1;i<n;i++){
    //            if (nums[i]>temp.get(len-1)){
    //                temp.add(nums[i]);
    //                len++;
    //            }
    //            else {
    //                int idx = lowerBound(temp,nums[i]);
    //                temp.set(idx,nums[i]);
    //            }
    //        }
    //        return len;
    //    }
    //    int lowerBound(ArrayList<Integer> list, int num){
    //        int start = 0;
    //        int end = list.size()-1;
    //        while (start<=end){
    //            int mid = start+(end-start)/2;
    //            if (list.get(mid)==num) return mid;
    //            else if (list.get(mid)>num) end=mid-1;
    //            else start = mid +1;
    //        }
    //        return start;
    //    }
    //}
}
