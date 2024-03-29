public class HouseRobber2 {
    //https://www.naukri.com/code360/problems/house-robber-ii_839733?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/house-robber-ii/
    //class Solution {
    //
    //    //now here we cannot rob 1st and last houses together so apply house robber from 0-n-2 and 1-n-1 and then find its max
    //
    //    public int rob(int[] nums) {
    //        int n = nums.length;
    //       int [] temp1 = new int[n-1];
    //       for (int i = 1;i<n;i++) temp1[i-1] = nums[i];
    //       int [] temp2 = new int [n-1];
    //       for (int i = 0;i<n-1;i++) temp2 [i] = nums[i];
    //       if (n==1) return nums[0];
    //       return Math.max(solver(temp1),solver(temp2));
    //    }
    //    public int solver(int[] nums) {
    //        int n = nums.length;
    //        if (n==0) return 0;
    //        int prev = nums[n-1];
    //        int prev2 = 0;
    //        for (int i = n-2;i>=0;i--){
    //            int curr = Math.max(prev,(nums[i] + prev2));
    //            prev2 = prev;
    //            prev = curr;
    //        }
    //        return prev;
    //       }
    //    }
}
