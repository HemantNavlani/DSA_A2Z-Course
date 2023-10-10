public class FirstorLastOccurence {
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
    //leetcode 34



    //https://www.codingninjas.com/studio/problems/first-and-last-position-of-an-element-in-sorted-array_1082549?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1

    //    //here I applied a linear search after finding whether the element is present in array or not on both left and right, you can better right this in binary search only
    //class Solution {
    //    public int[] searchRange(int[] nums, int target) {
    //        int n = nums.length;
    //        int st = 0;
    //        int end = n-1;
    //        int [] ans = new int[2];
    //        while (st<=end){
    //            int mid = st+(end-st)/2;
    //            if (nums[mid]>target) end = mid-1;
    //            else if (nums[mid]<target) st = mid+1;
    //            else {
    //                int a = mid;
    //                while (nums[a]==target) {
    //                    a--;
    //                    if (a<0) break;
    //                }
    //                ans[0] = a+1;
    //
    //                a = mid;
    //                while (a<n && nums[a]==target) {
    //                    a++;
    //                    if (a>=n) break;
    //                }
    //                ans[1] = a-1;
    //
    //                return ans;
    //            }
    //        }
    //
    //        return new int[] {-1,-1};
    //    }
    //}


    //a little better
    //class Solution {
    //    public int first(int[] nums, int target) {
    //        int n = nums.length;
    //        int ans = -1;
    //        int st = 0;
    //        int end = n-1;
    //        while (st<=end){
    //            int mid = st+(end-st)/2;
    //            if (nums[mid]>target) end = mid-1;
    //            else if (nums[mid]<target) st = mid+1;
    //            else {
    //                ans = mid;
    //                end = mid-1;
    //                }
    //        }
    //        return ans;
    //    }
    //       public int last(int[] nums, int target) {
    //        int n = nums.length;
    //        int ans = -1;
    //        int st = 0;
    //        int end = n-1;
    //        while (st<=end){
    //            int mid = st+(end-st)/2;
    //            if (nums[mid]>target) end = mid-1;
    //            else if (nums[mid]<target) st = mid+1;
    //            else {
    //                ans = mid;
    //                st = mid+1;
    //                }
    //        }
    //        return ans;
    //    }
    //    public int[] searchRange(int[] nums, int target) {
    //        return new int[] {first(nums,target),last(nums,target)};
    //    }
    //}
}
