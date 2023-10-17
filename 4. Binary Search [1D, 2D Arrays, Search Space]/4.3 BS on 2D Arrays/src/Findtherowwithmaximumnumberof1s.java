public class Findtherowwithmaximumnumberof1s {


//https://www.codingninjas.com/studio/problems/row-of-a-matrix-with-maximum-ones_982768?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1


//brutre force vahi hai har element pe jaao aur dhundo max bus

//optimal
    //TC is O(n * log m)
    //SC is O(1)
    //yaha kuch nhi bas har row pe jaakar first occurence vala method call kardo

    //import java.util.ArrayList;
    //public class Solution{
    //    public static int firstOccurence (ArrayList<Integer> list, int m){
    //        int st = 0;
    //        int end = m-1;
    //        while (st<end){
    //            int mid = st+(end-st)/2;
    //            if (list.get(mid)==1) end = mid;
    //            else if(list.get(mid)==0) st = mid+1;
    //        }
    //        return st;
    //    }
    //    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m){
    //        int max = Integer.MIN_VALUE;
    //        int maxIdx = -1;
    //        for (int i = 0;i<n;i++){
    //            if (m- firstOccurence(matrix.get(i),m)>max){
    //            max = Math.max(max,m- firstOccurence(matrix.get(i),m));
    //            maxIdx = i;
    //            }
    //        }
    //        return maxIdx;
    //    }
    //}
}
