public class MedianofTwoSortedArrays {
    //leetcode 4
    //https://leetcode.com/problems/median-of-two-sorted-arrays/

    //https://www.codingninjas.com/studio/problems/median-of-two-sorted-arrays_985294?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    //brute force approach
    //maine dono sorted arrays ko merge kardiya single sorted array bangaya aur uska median nikalana kaunsi top cheez hai

    //TC O(m+n) for merging
    //SC O(m+n) as a new array is made

    //class Solution {
    //    public List<Integer> merge(int[] nums1, int[] nums2) {
    //        int m = nums1.length;
    //        int n = nums2.length;
    //        int i = 0;
    //        int j = 0;
    //        List<Integer> l = new ArrayList<>();
    //        while (i<m && j<n){
    //            if (nums1[i]<nums2[j]){
    //                l.add(nums1[i]);
    //                i++;
    //            }
    //            else {
    //                l.add(nums2[j]);
    //                j++;
    //            }
    //        }
    //        while (i<m){
    //            l.add(nums1[i]);
    //            i++;
    //        }
    //        while (j<n){
    //            l.add(nums2[j]);
    //            j++;
    //        }
    //        return l;
    //    }
    //    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //        List<Integer> l = merge(nums1,nums2);
    //        int n = l.size();
    //        if (n%2!=0) return (double) l.get(n/2);
    //        else return (double)((l.get(n/2-1)+l.get(n/2)))/2;
    //    }
    //}

    //Better approach --> here we have optimised space to O(1) we have not made the whole array only desired index value is been stored in two variables and then median is found out
    //class Solution {
    //
    //    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //        int m = nums1.length;
    //        int n = nums2.length;
    //        int i = 0;
    //        int j = 0;
    //
    //
    //        int cnt = 0;
    //        int idx2 = (m+n)/2;
    //        int idx1 = idx2-1;
    //        int el1 = 0;
    //        int el2 = 0;
    //
    //        while (i<m && j<n){
    //            if (nums1[i]<nums2[j]){
    //                if (cnt==idx1) el1 = nums1[i];
    //                if (cnt==idx2) el2 = nums1[i];
    //                cnt++;
    //                i++;
    //            }
    //            else {
    //                if (cnt==idx1) el1 = nums2[j];
    //                if (cnt==idx2) el2 = nums2[j];
    //                cnt++;
    //                j++;
    //            }
    //        }
    //        while (i<m){
    //            if (cnt==idx1) el1 = nums1[i];
    //            if (cnt==idx2) el2 = nums1[i];
    //            cnt++;
    //            i++;
    //        }
    //        while (j<n){
    //            if (cnt==idx1) el1 = nums2[j];
    //            if (cnt==idx2) el2 = nums2[j];
    //            cnt++;
    //            j++;
    //        }
    //        int len = nums1.length + nums2.length;
    //        if (len%2!=0) return el2;
    //        else return (double)((double)(el1+el2)/ (double)2);
    //        }
    //}

    //Optimal approach using binary approach and finding symmetry in the arrays
    //TC is O(min(n1,n2))
    //SC is O(1)
    //yaha dono array me possiblity dekhi hai ki kaitne aana shi hai left and right part me fir uske hissab se median nikala hai try to do a dry run of code
    // for understanding if not able to understand toh video dekh lena easy hai code bus approach mind me khud se nhi aati ye wali
    //
    //public class Solution {
    //    public static double median(int[] a, int[] b) {
    //        int n1 = a.length;
    //        int n2 = b.length;
    //
    //        //because we always need to take the smaller array to perform binary search
    //        if(n1>n2) return median(b,a);
    //
    //        int st = 0;
    //        int end = n1;
    //
    //        int left = (n1+n2+1)/2;
    //        int n = n1+n2;
    //        while (st<=end){
    //            int mid1 = st+(end-st)/2;
    //            int mid2 = left -mid1;
    //            int l1 = Integer.MIN_VALUE;
    //            int l2 = Integer.MIN_VALUE;
    //            int r1 = Integer.MAX_VALUE;
    //            int r2 = Integer.MAX_VALUE;
    //
    //            if (mid1<n1) r1 = a[mid1];
    //            if (mid2<n2) r2 = b[mid2];
    //            if (mid1-1>=0) l1 = a[mid1-1];
    //            if (mid2-1>=0) l2 = b[mid2-1];
    //
    //            if (l1<=r2 && l2<=r1){
    //                if (n%2==1) return Math.max(l1,l2);
    //                else return (double) (Math.max(l1,l2) + Math.min(r1,r2))/2.0;
    //            }
    //            else if (l1>r2) end = mid1-1;
    //            else st = mid1+1;
    //        }
    //        return 0;
    //    }
    //}
}