public class MergeIntervals {
    //https://www.codingninjas.com/studio/problems/merge-intervals_699917?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
//    https://leetcode.com/problems/merge-intervals/
    //class Solution {
    //    public int[][] merge(int[][] intervals) {
    //        Arrays.sort(intervals,Comparator.comparingInt(row->row[0]));
    //        ArrayList<int[]> res = new ArrayList<>();
    //        int[] period = new int[2];
    //        period[0] = intervals[0][0];
    //        period[1] = intervals[0][1];
    //        for (int i = 1;i<intervals.length;i++){
    //            if (period[1]>=intervals[i][0]){
    //                period[0] = Math.min(period[0],intervals[i][0]);
    //                period[1] = Math.max(period[1],intervals[i][1]);
    //            }
    //            else {
    //                int[] toAdd = new int[2];
    //                toAdd[0] = period[0];
    //                toAdd[1] = period[1];
    //                res.add(toAdd);
    //                period[0] = intervals[i][0];
    //                period[1] = intervals[i][1];
    //            }
    //        }
    //        res.add(period);
    //        int[][] ans = new int[res.size()][2];
    //        for (int i=0;i<ans.length;i++){
    //            ans[i] = res.get(i);
    //        }
    //        return ans;
    //
    //    }
    //}
}
