import java.util.Arrays;

public class AggressiveCows {
    //https://www.codingninjas.com/studio/problems/aggressive-cows_1082559?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //yaha maximum possible minimum distance nikalana tha toh 1 se start karo aur max-min of array tak jao

    //dekho ki kya 1 distanc agar hum rakhte hai toh sari cows aa jati h ya nhi fir ek ek karke cows badao (ya binary search ke sath range se khelo )aur dhyan rahe array sort karna hoga iske liye
    // read code once you will understand

    //TC --> O(n log n ) for sorting + the O(log(max-min) * n) in the binary search
    //import java.util.*;
    //
    //public class Solution {
    //    public static boolean possible(int []stalls, int cow,int mid) {
    //        int posCow = 1;
    //        int dis=0;
    //        for (int i = 1;i<stalls.length;i++){
    //            dis+=stalls[i]-stalls[i-1];
    //            if (dis>=mid) {
    //                posCow+=1;
    //                dis=0;
    //            }
    //        }
    //        if (posCow>=cow) return true;
    //        else return false;
    //    }
    //    public static int aggressiveCows(int []stalls, int cow) {
    //        Arrays.sort(stalls);
    //        int n = stalls.length;


    //A bit optimization is that no need to calculate max and min separately just take from the first and last element of array as the array is sorted
    //        int max = Integer.MIN_VALUE;
    //        int min = Integer.MAX_VALUE;
    //        for (int i=0;i<n;i++){
    //            max = Math.max(max,stalls[i]);
    //            min = Math.min(min,stalls[i]);
    //        }
    //        int st = 1;
    //        int end = (max-min);
    //
    //        while (st<=end){
    //            int mid = st + (end-st)/2;
    //            if (possible(stalls,cow,mid)) st = mid+1;
    //            else end = mid - 1;
    //        }
    //        return end;
    //    }
    //}

    }
