public class SearchinRotatedSortedArrayII {
    //leetcode 81 https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

    //https://www.codingninjas.com/studio/problems/search-in-a-rotated-sorted-array-ii_7449547?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //halka sa updated hai sorted array 1 se isme bus ham ye karte hai ki agar teeno equal h nums[st], nums[mid] , nums[end] then shrink the array st++ and end--;
    //class Solution {
    //    public boolean search(int[] nums, int target) {
    //        int n = nums.length;
    //        //[1,1,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,1,1,1,1,1
    //        int st = 0;
    //        int end = n-1;
    //        while (st<=end){
    //            int mid = st+(end-st)/2;
    //            if (nums[mid]==target) return true;
    //            if (nums[st]==nums[mid] && nums[mid]==nums[end]) {
    //                st = st+1;
    //                end = end-1;
    //                continue;
    //            }
    //            if (nums[mid]<=nums[end]){
    //                if (target>=nums[mid] && target<=nums[end])st = mid+1;
    //                else  end = mid-1;
    //            }
    //            else {
    //                if (target<=nums[mid] && target>=nums[st]) end = mid-1;
    //                else st = mid+1;
    //            }
    //
    //        }
    //        return false;
    //    }
    //}
}
