public class ConvertMinToMaxHeap {
    //isme ye heapify vala concept use hua hai piche se node utha rahe hai aur fir usko push down kar rahe hai
    //public class Solution {
    //    public static int[] MinToMaxHeap(int n, int[] arr){
    //        int first = (arr.length-2)/2;
    //        for (int i =first;i>=0;i--){
    //            int parent = i;
    //            while (parent<arr.length){
    //            int child1 = 2*parent+1;
    //            int child2 = 2*parent+2;
    //            int big = parent;
    //            if (child1<arr.length && arr[big]<arr[child1]) big = child1;
    //            if (child2<arr.length && arr[big]<arr[child2]) big = child2;
    //
    //            if (parent == big) break;
    //            else {
    //                int temp = arr[parent];
    //                arr[parent] = arr[big];
    //                arr[big] = temp;
    //            }
    //            parent = big;
    //            }
    //        }
    //        return arr;
    //    }
    //}
}
