public class CountOccurences {
    //https://www.codingninjas.com/studio/problems/occurrence-of-x-in-a-sorted-array_630456?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1

    //poora code as it is from previous question jisme hame first and last occurence of element nikalni thi
    //public class Solution {
    //
    //    public static int first(int[] nums, int target) {
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
    //       public static int last(int[] nums, int target) {
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
    //
    //
    //    public static int count(int nums[], int n, int target) {
    //        int first = first(nums,target);
    //        if (first==-1) return 0;
    //        int last = last(nums,target);
    //        return last-first+1;
    //    }
    //}
}
