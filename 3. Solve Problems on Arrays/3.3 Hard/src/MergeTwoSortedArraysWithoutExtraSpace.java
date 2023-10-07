public class MergeTwoSortedArraysWithoutExtraSpace {

    //https://www.codingninjas.com/studio/problems/merge-two-sorted-arrays-without-extra-space_6898839?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
    //ye tagda hai

    //optimal 1 just first take 2 pointers each on the start of the two arrays just put the numbers in correct array in any order then sort both arrays and done
    //TC O(min(m,n)) + O(nlogn) + O(mlogm)
    //SC O(1)
    //public class Solution {
    //    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
    //        int p1 = a.length-1;
    //        int p2 = 0;
    //
    //        while (p1>=0 && p2<b.length){
    //            if (a[p1]>b[p2]){
    //                long temp = a[p1];
    //                a[p1] = b[p2];
    //                b[p2] = temp;
    //                p1--;
    //                p2++;
    //            }
    //            else break;
    //        }
    //        Arrays.sort(a);
    //        Arrays.sort(b);
    //    }
    //}

    //Kuch nhi bus piche se travel karo isme
    //https://leetcode.com/problems/merge-sorted-array/
    //leetcode 88
    //class Solution {
    //    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //        int p1 = m-1;
    //        int p2 = n-1;
    //
    //        for (int p=nums1.length-1;p>=0;p--){
    //            if (p1==-1){
    //                nums1[p] = nums2[p2];
    //                p2--;
    //            }
    //            else if (p2==-1){
    //                nums1[p] = nums1[p1];
    //                p1--;
    //            }
    //           else if (nums1[p1]>nums2[p2]){
    //                nums1[p] = nums1[p1];
    //                p1--;
    //            }
    //            else {
    //                nums1[p] = nums2[p2];
    //                p2--;
    //            }
    //        }
    //    }
    //}
}
