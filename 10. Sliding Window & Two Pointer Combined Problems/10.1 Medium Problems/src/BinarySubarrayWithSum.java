public class BinarySubarrayWithSum {
//    https://leetcode.com/problems/binary-subarrays-with-sum/
    //https://www.codingninjas.com/studio/problems/count-substrings-with-k-ones_3128698?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //isme hame atmost k - atmost k-1 sum  karna hai it is O(N) approach
    //class Solution {
    //    public int numSubarraysWithSum(int[] nums, int goal) {
    //       return atmostK(nums,goal) - atmostK(nums,goal-1);
    //    }
    //    int atmostK (int []nums,int goal){
    //        int n = nums.length;
    //        int l = 0;
    //        int r = 0;
    //        int sum = 0;
    //        int count = 0;
    //        while (r<n){
    //            sum+=nums[r];
    //            while (l<=r && sum>goal){
    //                sum-=nums[l];
    //                l++;
    //            }
    //            count += r-l+1;
    //            r++;
    //        }
    //        return count;
    //    }
    //}
}
