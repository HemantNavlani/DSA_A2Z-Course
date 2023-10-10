public class SearchinRotatedSortedArrayI {
    //https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/
    //leetcode 33
    //https://leetcode.com/problems/search-in-rotated-sorted-array/description/


//    here binary search is applied and in middle we have just checked whether the right side is sorted or the left side to the mid is sorted
    //read the question the solution you will understand

    //class Solution {

    //    public int search(int[] nums, int target) {
    //        int n = nums.length;
    //        int st = 0;
    //        int end=  n-1;
    //        while (st<=end){
    //            int mid = st+(end-st)/2;
    //            if (nums[mid]==target) return mid;
    //            if (nums[st]<=nums[mid]){
    //                if (nums[st]<=target && target<=nums[mid]){
    //                    end=mid-1;
    //                }
    //                else st=mid+1;
    //            }
    //            else{
    //                if (target>=nums[mid] && target<=nums[end]){
    //                    st=mid+1;
    //                }
    //                else{
    //                    end=mid-1;
    //                }
    //            }
    //        }
    //        return -1;
    //    }
    //}
}
