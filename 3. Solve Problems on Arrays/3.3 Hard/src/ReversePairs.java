public class ReversePairs {

    //leetcode 493 https://leetcode.com/problems/reverse-pairs/description/

    //https://www.codingninjas.com/studio/problems/team-contest_6840309?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
//brute force --> around O(N^2) TC and O(1) SC
//    public class Solution {
//        public static int team(int []skill, int n){
//            int cnt = 0;
//            for(int i=0;i<n;i++){
//                for (int j=i+1;j<n;j++){
//                    if (skill[i]>2*skill[j]) cnt++;
//                }
//            }
//            return cnt;
//        }
//    }

    //optimal approach -->
    //For this question we have to first know merge sort and the count inversion problem then we will add a simple step in it and our optimised approach is ready

    //TC O(2Nlogn) and  SC O(N) and the given array is distorted
    //import java.util.*;
    //public class Solution {
    //    public static void merge(int[] arr, int low, int mid, int high) {
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
    //    }
    //    static int countPairs(int[] arr, int low,int mid, int high){
    //        int cnt = 0;
    //        int right = mid+1;
    //        for (int i=low;i<=mid;i++){
    //            while (right<=high && arr[i]>2*arr[right]){
    //                right++;
    //            }
    //            cnt += (right-(mid+1));
    //        }
    //        return cnt;
    //    }
    //    public static int mergeSort(int[] arr, int low, int high) {
    //        int cnt = 0;
    //        if (low >= high) return cnt;
    //        int mid = (low + high) / 2 ;
    //        cnt += mergeSort(arr, low, mid);  // left half
    //        cnt += mergeSort(arr, mid + 1, high); // right half
    //        cnt += countPairs(arr,low,mid,high);
    //        merge(arr, low, mid, high);  // merging sorted halves
    //        return cnt;
    //    }
    //
    //    public static int team(int []skill, int n){
    //        return mergeSort(skill,0,n-1);
    //    }
    //}
}
