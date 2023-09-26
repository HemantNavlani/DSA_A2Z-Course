//public class QuickSort {
//    /////https://www.codingninjas.com/studio/problems/quick-sort_5844?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
//
//
//    public class Solution {
//
//        public static void quickSort(int[] input,int startIndex, int endIndex) {
//            if (startIndex>=endIndex) return;
//            int pi = partition(input,startIndex,endIndex);
//            quickSort(input,startIndex,pi-1);
//            quickSort(input,pi+1,endIndex);
//        }
//
//        public static int partition(int [] input,int st,int end){
//            if (st==end) return st;
//            int i = st;
//            int j = end;
//            int pivot = input[st];
//            while (i<=j && i<input.length && j>=0){
//                while (i<input.length && input[i]<=pivot ) i++;
//                while (j>=0 && input[j]>pivot ) j--;
//                if (i<=j){
//                    int temp = input[i];
//                    input[i] = input[j];
//                    input[j] = temp;
//                    i++;
//                    j--;
//                }
//            }
//            int temp = input[j];
//            input[j] = input[st];
//            input[st] = temp;
//            return j;
//        }
//    }
//
//}
