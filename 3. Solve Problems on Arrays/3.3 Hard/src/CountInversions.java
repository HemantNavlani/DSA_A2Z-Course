public class CountInversions {
    //brute force --> TC near  O(N^2) and SC O(1)
    //https://www.codingninjas.com/studio/problems/number-of-inversions_6840276?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
    //public class Solution {
    //    public static int numberOfInversions(int []a, int n) {
    //        int cnt = 0;
    //        for (int i=0;i<n;i++){
    //            for (int j=i+1;j<n;j++){
    //                if (i<j && a[i]>a[j]) cnt++;
    //            }
    //        }
    //        return cnt;
    //    }
    //}

    //optimal
    //iskeliye poora merge sort likho
    // cnt+=mid-left+1; -> just this line has added

//    example
    // if we have two arrays to merge (those two arrays are sorted this is how merge sort works na )

//    like 1 6 20 and 4 5
    //now we have pointers in the merge function when the 1st array has something greater than 2nd array like 6 is greater than 4 then all remaining elements in the right of 1st array will form inversion pair here 6,4 and 20,4
    //hence we have added this line in the merge code
    // cnt+=mid-left+1;// check the code below once

    //important is you should know merge sort for this // Revise merge sort
    //TC O(nlogn) and SC is O(N) and here we are changing the given array




    //import java.util.*;
    //
    //public class Solution {
    //
    //
    //    public static int merge(int[] arr, int low, int mid, int high) {
    //         int cnt = 0;
    //        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
    //        int left = low;      // starting index of left half of arr
    //        int right = mid + 1;   // starting index of right half of arr
    //
    //        //storing elements in the temporary array in a sorted manner//
    //
    //        while (left <= mid && right <= high) {
    //            if (arr[left] <= arr[right]) {
    //                temp.add(arr[left]);
    //                left++;
    //            } else {







    //                //added just this extra line in code of merge sort
    //                cnt+=mid-left+1;
    //                ///
    //                temp.add(arr[right]);
    //                right++;
    //            }
    //        }
    //










    //        // if elements on the left half are still left //
    //
    //        while (left <= mid) {
    //            temp.add(arr[left]);
    //            left++;
    //        }
    //
    //        //  if elements on the right half are still left //
    //        while (right <= high) {
    //            temp.add(arr[right]);
    //            right++;
    //        }
    //
    //        // transfering all elements from temporary to arr //
    //        for (int i = low; i <= high; i++) {
    //            arr[i] = temp.get(i - low);
    //        }
    //        return cnt;
    //    }
    //
    //    public static int mergeSort(int[] arr, int low, int high) {
    //        int cnt = 0;
    //        if (low >= high) return cnt;
    //        int mid = (low + high) / 2 ;
    //        cnt+= mergeSort(arr, low, mid);  // left half
    //        cnt+=  mergeSort(arr, mid + 1, high); // right half
    //        cnt+= merge(arr, low, mid, high);  // merging sorted halves
    //        return cnt;
    //    }
    //
    //
    //    public static int numberOfInversions(int []a, int n) {
    //        return mergeSort(a,0,a.length-1);
    //
    //    }
    //}
}
