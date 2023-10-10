public class FindMinInRotatedSortedArray {
    //https://www.codingninjas.com/studio/problems/rotated-array_1093219?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1

    //https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    //leetcode 153
    //bus sorted part dhund lo fir uska first element hi min hoga usse ek possible answer bana lo fir uss part ko eliminate kardo aur baki ke part me ans dekho
    //class Solution {
    //    public int findMin(int[] nums) {
    //        int n = nums.length;
    //        int ans = Integer.MAX_VALUE;
    //        int st = 0;
    //        int end = n-1;
    //        while (st<=end){
    //            int mid = st+(end-st)/2;
    //            if(nums[st]<=nums[mid]) {
    //                ans = Math.min(ans,nums[st]);
    //                st=mid+1;
    //            }
    //            else {
    //            ans = Math.min(ans,nums[mid]);
    //            end=mid-1;
    //            }
    //        }
    //        return ans;
    //    }
    //}
}
