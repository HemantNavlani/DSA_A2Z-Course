public class KthElementof2SortedArrays {
//https://www.codingninjas.com/studio/problems/k-th-element-of-2-sorted-array_1164159?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
    //badiya brute force submit bhi ho raha TC is O(size of arr1 + size of arr2)

    //import java.util.ArrayList;
    //public class Solution {
    //    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
    //        int i = 0;
    //        int j = 0;
    //        int cnt = 0;
    //        while (i<n && j<m){
    //            if (arr1.get(i)<arr2.get(j)){
    //                cnt++;
    //                i++;
    //                if (cnt==k-1){
    //                     if (arr1.get(i)<arr2.get(j)) return arr1.get(i);
    //                     else return arr2.get(j);
    //                }
    //
    //            }
    //           else{
    //                cnt++;
    //                    j++;
    //                if (cnt==k-1){
    //                     if (arr1.get(i)<arr2.get(j)) return arr1.get(i);
    //                     else return arr2.get(j);
    //                }
    //
    //            }
    //        }
    //
    //        while (i<n){
    //              cnt++;
    //                 i++;
    //                if (cnt==k-1){
    //                     if (arr1.get(i)<arr2.get(j)) return arr1.get(i);
    //                     else return arr2.get(j);
    //                }
    //
    //        }
    //        while (j<m){
    //             cnt++;
    //                 j++;
    //                if (cnt==k-1){
    //                     if (arr1.get(i)<arr2.get(j)) return arr1.get(i);
    //                     else return arr2.get(j);
    //                }
    //
    //        }
    //
    //        return 0;
    //    }
    //}

    //optimal approach is very much similar to the median of two sorted array problem check out the video of it or just walk thru the code to understand
    //import java.util.ArrayList;
    //public class Solution {
    //    public static int kthElement(ArrayList<Integer> a, ArrayList<Integer> b, int n1, int n2, int k) {
    //
    //        //because we always need to take the smaller array to perform binary search
    //        if(n1>n2) return kthElement(b,a,n2,n1,k);
    //
    //        int st = Math.max(0,k-n2);
    //        int end = Math.min(k,n1);
    //
    //        int left = k;
    //        int n = n1+n2;
    //        while (st<=end){
    //            int mid1 = st+(end-st)/2;
    //            int mid2 = left -mid1;
    //            int l1 = Integer.MIN_VALUE;
    //            int l2 = Integer.MIN_VALUE;
    //            int r1 = Integer.MAX_VALUE;
    //            int r2 = Integer.MAX_VALUE;
    //
    //            if (mid1<n1) r1 = a.get(mid1);
    //            if (mid2<n2) r2 = b.get(mid2);
    //            if (mid1-1>=0) l1 = a.get(mid1-1);
    //            if (mid2-1>=0) l2 = b.get(mid2-1);
    //
    //            if (l1<=r2 && l2<=r1){
    //                return Math.max(l1,l2);
    //            }
    //            else if (l1>r2) end = mid1-1;
    //            else st = mid1+1;
    //        }
    //        return 0;
    //    }
    //}
}
