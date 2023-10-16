public class AllocateBooks {
    //TC --> O (log(sum-max+1) * O(N))
    //SC --> O(1)
//https://www.codingninjas.com/studio/problems/allocate-books_1090540?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //Padho aur samjho ye questions aise hi hai, shayad video bhi dekhni pade dubara dubara par kya kare code me simple lagta hai par hai ajeeb


    //Book allocation, split array largest sum , painters partition has exacct same codes

    //import java.util.ArrayList;
    //public class Solution {
    //    public static int students(ArrayList<Integer> arr, int n, int m,int mid) {
    //        int pages = 0;
    //        int students = 1;
    //        for (int i=0;i<n;i++){
    //            pages+=arr.get(i);
    //            if (pages>mid){
    //                students++;
    //                pages = arr.get(i);
    //            }
    //        }
    //        return students;
    //    }
    //    public static int findPages(ArrayList<Integer> arr, int n, int m) {
    //        if (m>n) return -1;
    //        int sum = 0;
    //        int max = Integer.MIN_VALUE;
    //        for (int i = 0;i<n;i++){
    //            sum+=arr.get(i);
    //            max = Math.max(max,arr.get(i));
    //        }
    //
    //        int st = max;
    //        int end = sum;
    //        while (st<=end){
    //            int mid = st+(end-st)/2;
    //            if (students(arr,n,m,mid)>m) st = mid+1;
    //            else end=mid-1;
    //        }
    //        return st;
    //    }
    //}
}
