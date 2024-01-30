public class InsertInterval {
    //neetcode ki video dekhi thi kal easy hai
    //kuch nhi bas array me aage badte jao aur krte jao easy hai
    //https://www.codingninjas.com/studio/problems/-insert-interval_285893?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/insert-interval/

    //class Solution {
    //    public int[][] insert(int[][] intervals, int[] newInterval) {
    //        ArrayList<int[]> res = new ArrayList<>();
    //        for (int i = 0;i<intervals.length;i++){
    //            if(newInterval[1]<intervals[i][0]){
    //                res.add(newInterval);
    //                for (int j = i;j<intervals.length;j++){
    //                    res.add(intervals[j]);
    //                }
    //                int[][] ans = new int[res.size()][2];
    //                for (int a = 0;a<res.size();a++){
    //                ans[a] = res.get(a);
    //                }
    //                return ans;
    //            }
    //            else if(newInterval[0]>intervals[i][1]){
    //                res.add(intervals[i]);
    //            }
    //            else {
    //                newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
    //                newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
    //            }
    //        }
    //        res.add(newInterval);
    //
    //        int[][] ans = new int[res.size()][2];
    //        for (int i = 0;i<res.size();i++){
    //            ans[i] = res.get(i);
    //        }
    //        return ans;
    //    }
    //}
}
