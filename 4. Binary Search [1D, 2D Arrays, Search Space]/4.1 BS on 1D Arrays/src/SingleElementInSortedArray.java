public class SingleElementInSortedArray {
    //leetcode 540
    //https://leetcode.com/problems/single-element-in-a-sorted-array/
    //https://www.codingninjas.com/studio/problems/unique-element-in-sorted-array_1112654?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    //basic brute force O(N) by going on each index and seeing whether the ledt and right to (anyone of them is equal to the element at that index then oK else if this is false then you got the answeww

    //optimal approach is binary search
    //if the index of the element is in the form (even,odd) then element is in right half (eliminate left)
    //if the index of the element is in the form (odd,even) then element is in left half (eliminate right)

    //if we are at the single element then both left and right will not be equal to it

    //class Solution {
    //    public int singleNonDuplicate(int[] nums) {
    //        int n = nums.length;
    //        if (n==1) return nums[0];
    //        if (nums[0]!=nums[1]) return nums[0];
    //        if (nums[n-1]!=nums[n-2]) return nums[n-1];
    //
    //        int st = 1;
    //        int end = n-2;
    //        while (st<=end){
    //            int mid = st+(end-st)/2;
    //            if (nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
    //            if ((mid%2==0 && nums[mid+1]==nums[mid]) || (mid%2==1 && nums[mid-1]==nums[mid])) st = mid+1;
    //            else end=mid-1;
    //        }
    //        return -1;
    //    }
    //}
}
