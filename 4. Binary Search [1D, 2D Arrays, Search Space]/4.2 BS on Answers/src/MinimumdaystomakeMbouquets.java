public class MinimumdaystomakeMbouquets {
    //lletcode 1482
    //https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/

    //https://www.codingninjas.com/studio/problems/rose-garden_2248080?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //it is almost same to koko eating bananas bus possible vala jo function likha hai vo alag hai

    //TC is O( N * log( max-min+1) )
    //class Solution {
    //    public boolean possible(int[] bloomDay, int day, int m, int k) {
    //        int cnt = 0;
    //        int bouqets = 0;
    //        for (int i=0;i<bloomDay.length;i++){
    //            if (day>=bloomDay[i]) cnt++;
    //            else{
    //                bouqets += cnt/k;
    //                cnt = 0;
    //            }
    //        }
    //        bouqets += cnt/k;
    //        if (bouqets>=m) return true;
    //        else return false;
    //    }
    //    public int minDays(int[] bloomDay, int m, int k) {
    //        long c = (long)m*(long)k;
    //        if (c>bloomDay.length) return -1;
    //        int min = Integer.MAX_VALUE;
    //        int max = Integer.MIN_VALUE;
    //
    //        for (int i=0;i<bloomDay.length;i++){
    //            min = Math.min(min,bloomDay[i]);
    //            max = Math.max(max,bloomDay[i]);
    //        }
    //
    //        int st = min;
    //        int end = max;
    //
    //        while (st<=end){
    //            int mid = st+(end-st)/2;
    //            if (possible(bloomDay,mid,m,k)) end = mid-1;
    //            else st = mid+1;
    //        }
    //        return st;
    //    }
    //}
}
