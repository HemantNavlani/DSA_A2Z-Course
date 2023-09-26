public class MergeSort {
    //https://www.codingninjas.com/studio/problems/merge-sort_5846?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
//    /public class Solution {
//
//    public static void mergeSort(int[] arr, int l, int r){
//        if (l>=r) return;
//        //0 1 2 3 4
//        int mid = (l+r)/2;
//        mergeSort(arr,l, mid);
//        mergeSort(arr,mid+1,r);
//        merge(arr,l,mid,r);
//    }
//
//    static void merge(int [] arr,int l, int mid, int r){
//        int n1 = mid-l+1;
//        int n2 = r-mid;
//        int left[] = new int [n1];
//        int right []= new int [n2];
//
//        for (int i=0;i<left.length;i++){
//            left[i]=arr[l+i];
//        }
//        for (int i=0;i<right.length;i++){
//            right[i]=arr[mid+i+1];
//        }
//
//        int i = 0;
//        int j = 0;
//        int k = l;
//        while (i<left.length && j<right.length){
//            if (left[i]<=right[j]){
//                arr[k++]=left[i++];
//            }
//            else{
//                arr[k++]=right[j++];
//            }
//        }
//        while(i<left.length){
//            arr[k++] = left[i++];
//        }
//         while(j<right.length){
//            arr[k++] = right[j++];
//        }
//    }
//}



}