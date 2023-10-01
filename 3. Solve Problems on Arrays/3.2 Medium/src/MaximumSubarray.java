public class MaximumSubarray {
    ////https://leetcode.com/problems/maximum-subarray/
    ////leetcode 53
    //
    ////We can easily do it by 2 loop  in O(n^2)
    ////but this is better approach => This is known as Kaden's algorithm
    //class Solution {
    //    public int maxSubArray(int[] nums) {
    //        int sum = 0;
    //        int max = Integer.MIN_VALUE;
    //        for (int i=0;i<nums.length;i++){
    //            sum+=nums[i];
    //            max = Math.max(max,sum);
    //            if (sum<=0) sum = 0;
    //        }
    //        return max;
    //    }
    //}
}
