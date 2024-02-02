public class NonOverLappingIntervals {
    //https://www.codingninjas.com/studio/problems/non-overlapping-intervals_3169341?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/non-overlapping-intervals/description/


    //isme phle arraysort karna hai fir check karte jana hai overlapping ke liye agar overlapping hai toh jiska end bad me hai usko hatana hai minimum end vale ko rakhna hai neetcode vale ki video dekhi thi
    //class Solution {
    //    public int eraseOverlapIntervals(int[][] intervals) {
    //        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
    //        int n = intervals.length;
    //        int res = 0;
    //        int prevEnd = intervals[0][1];
    //        for (int i = 1;i<n;i++){
    //            if (prevEnd<=intervals[i][0]) prevEnd = intervals[i][1];
    //            else {
    //                res++;
    //                prevEnd = Math.min(prevEnd,intervals[i][1]);
    //            }
    //        }
    //        return res;
    //    }
    //}
}
