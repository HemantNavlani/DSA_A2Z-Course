public class MatrixMedian {
    //https://www.codingninjas.com/studio/problems/median-of-a-row-wise-sorted-matrix_1115473?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1

    //TC is O(len*len) and then O(len Log len ) for sorting
    //brute force approach is that take the 2D array and fill it in a 1D array and then sort it and then finding the median is kaunsi badi baat
    //import java.util.*;
    //public final class Solution {
    //    public static int findMedian(int matrix[][], int m, int n) {
    //        int len = m*n;
    //        int [] arr = new int [len];
    //        int k =0;
    //        for (int i=0;i<m;i++){
    //            for (int j=0;j<n;j++){
    //                arr[k++] = matrix[i][j];
    //            }
    //        }
    //        Arrays.sort(arr);
    //        if (len%2==1) return arr[len/2];
    //        else return (arr[len/2-1]+arr[len/2])/2;
    //    }
    //}


    //TC is for countSmallerEquals is O(N log M )

    //Binary search TC is O(log 10^9  *  n * log m )
    //                   (Binary Search) (countSmallerEquals function)


    //for median we will do binary search from the minimum of the matrix to maximum of the matrix
    //And for median you have to notice that median is that first element which has count of elements less than equal to it as more than equal to (n*m)/2 so yahi intuition hai

    // Jaise 1 2 3 4 5 ..... 15 tak numbers hai
    /// toh jaise 8 se less than equal to elments 7 (n*m/2) hai na toh vohi phla hai jiske sath aisa hai toh vahi median hai
    //public final class Solution {
    //
    //public static int upperBound(int[] arr,int x){
    //    int st = 0;
    //    int ans = arr.length;
    //    int end = arr.length-1;
    //    while(st<=end){
    //        int mid = st+(end-st)/2;
    //        if(arr[mid]<=x) st = mid+1;
    //        else {
    //            ans = mid;
    //            end = mid -1;
    //        }
    //    }
    //    return ans;
    //}
    //    public static int countSmallerEquals(int matrix[][],int x){
    //        int count = 0;
    //        for (int i = 0;i<matrix.length;i++){
    //            count += upperBound (matrix[i],x);
    //        }
    //        return count;
    //    }
    //    public static int findMedian(int matrix[][], int m, int n) {
    //        int st = Integer.MAX_VALUE;
    //        int end = Integer.MIN_VALUE;
    //        n = matrix.length;
    //        m = matrix[0].length;
    //        for (int i=0;i<n;i++){
    //            st = Math.min(matrix[i][0],st);
    //            end = Math.max(matrix[i][m-1],end);
    //        }
    //        int req = n*m/2;
    //        while (st<=end){
    //            int mid = st+(end-st)/2;
    //            int smallerEquals = countSmallerEquals (matrix,mid);
    //            //countSmallerEquals gives that how many are < = to mid ;
    //
    //
    //            if (smallerEquals<=req) st = mid+1;
    //            else end = mid-1;
    //        }
    //        return st;
    //    }
    //}




}
