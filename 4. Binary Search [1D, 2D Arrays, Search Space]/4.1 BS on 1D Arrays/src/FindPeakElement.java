public class FindPeakElement {
//leetcode 162
    //https://leetcode.com/problems/find-peak-element/

    //https://www.codingninjas.com/studio/problems/find-peak-element_1081482?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //Brute force approach --> O(N)
    //class Solution {
    //    public int findPeakElement(int[] nums) {
    //        int n = nums.length;
    //
    //        for (int i=0;i<n;i++){
    //            if ((i==0 || nums[i-1]<nums[i]) && (i==n-1 || nums[i]>nums[i+1])) return i;
    //        }
    //        return -1;
    //    }
    //}

    //optimal approach is binary search

    //In the binary search we will see the mid if it is the peak element if yes then return if not we will see if it is on the increasing curve means
    //arr[mid-1]<arr[mid] then peak we will be ahead so we will do st = mid + 1
    //or
    // if it is on the decreasing curve means
    //    // arr[mid]>arr[mid+1] then peak we will be back so we will do end = mid -  1


    //class Solution {
    //    public int findPeakElement(int[] nums) {
    //        int n = nums.length;
    //        if (n==1) return 0;
    //        if (nums[0]>nums[1]) return 0;
    //        if (nums[n-1]>nums[n-2]) return n-1;
    //
    //        int st = 1;
    //        int end = n-2;
    //        while (st<=end){
    //            int mid = st + (end-st)/2;
    //            if (nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
    //            else if (nums[mid]>nums[mid-1]) st = mid+1;
    //            else end = mid -1;
    //        }
    //        return -1;
    //    }
    //}

}
