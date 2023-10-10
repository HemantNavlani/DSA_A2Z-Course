public class FloorCeilinSortedArray {
    //https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //import java.util.* ;
    //import java.io.*;
    //public class Solution {


    //    public static int ceilingInSortedArray(int n, int x, int[] arr) {
    //        int a=ceiling(n,x,arr);
    //        int b=floor(n,x,arr);
    //        System.out.print(b+" ");
    //        return a;
    //  }
    //    public static int ceiling(int n, int x, int[] arr) {
    //        int st = 0;
    //        int end = n-1;
    //        while(st<=end){
    //            int mid =  (st+(end-st)/2);
    //            if (arr[mid]>x) end=mid-1;
    //            else if (arr[mid]<x) st = mid+1;
    //            else return arr[mid];
    //        }
    //        if (st>=n) return -1;
    //        return arr[st];
    //    }
    //
    //    public static int floor(int n, int x, int[] arr) {
    //        int st = 0;
    //        int end = n-1;
    //        while(st<=end){
    //            int mid = (st+(end-st)/2);
    //            if (arr[mid]>x) end=mid-1;
    //            else if (arr[mid]<x) st = mid+1;
    //            else return arr[mid];
    //        }
    //        if (end<0) return -1;
    //        return arr[end];
    //    }
    //}
}
