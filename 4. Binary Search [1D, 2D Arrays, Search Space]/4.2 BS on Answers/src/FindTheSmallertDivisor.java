public class FindTheSmallertDivisor {
    //https://www.codingninjas.com/studio/problems/smallest-divisor-with-the-given-limit_1755882?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/
    //leetcode 1283
    //class Solution {
    //    public boolean possibleAns(int[] nums, int threshold,int divisor) {
    //        int sum = 0;
    //        for (int i=0;i<nums.length;i++){
    //            sum += Math.ceil((double)nums[i]/divisor);
    //        }
    //        if (sum<=threshold) return true;
    //        else return false;
    //    }
    //    public int smallestDivisor(int[] nums, int threshold) {
    //        int n = nums.length;
    //        int max = Integer.MIN_VALUE;
    //        for (int i=0;i<n;i++){
    //            max = Math.max(max,nums[i]);
    //        }
    //        int st = 1;
    //        int end = max;
    //        while (st<=end){
    //            int mid = st+(end-st)/2;
    //            if (possibleAns(nums,threshold,mid)) end=mid-1;
    //            else st=mid+1;
    //        }
    //        return st;
    //    }
    //}
}
