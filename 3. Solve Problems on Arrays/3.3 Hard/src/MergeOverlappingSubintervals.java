import java.util.Arrays;
import java.util.Comparator;

public class MergeOverlappingSubintervals {
    //leetcode 56
    //https://leetcode.com/problems/merge-intervals/
    //https://www.codingninjas.com/studio/problems/merge-all-overlapping-intervals_6783452?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

    //Brute force approach just see you will understand
    //TC -> O(Nlog n) for sorting and O(2N ) for loops as we are going to each element twice
    //class Solution {
    //    public int[][] merge(int[][] intervals) {
    //        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    //        List<List<Integer>> ans = new ArrayList<>();
    //
    //        for (int i=0;i<intervals.length;i++){
    //            List<Integer> l = new ArrayList<>();
    //            int start = intervals[i][0];
    //            int end = intervals[i][1];
    //            if (!ans.isEmpty() && end <= ans.get(ans.size()-1).get(1)) continue;
    //            for (int j=i+1;j<intervals.length;j++){
    //                if (intervals[j][0]<=end){
    //                    end = Math.max(end,intervals[j][1]);
    //                }
    //                else {
    //                    break;
    //                }
    //            }
    //            l.add(start);
    //            l.add(end);
    //            ans.add(l);
    //        }
    //        int [][] retAns = new int [ans.size()][2];
    //        for(int i=0;i<ans.size();i++){
    //            for (int j=0;j<2;j++){
    //            retAns[i][j] = ans.get(i).get(j);
    //        }
    //        }
    //        return retAns;
    //    }
    //}

    //More optimized in single pass -> class Solution {
    //    public int[][] merge(int[][] intervals) {
    //        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    //        List<List<Integer>> ans = new ArrayList<>();
    //        for (int i=0;i<intervals.length;i++){
    //            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1).get(1)) {
    //                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
    //            }
    //            else {
    //                ans.get(ans.size() - 1).set(1,Math.max(ans.get(ans.size() - 1).get(1), intervals[i][1]));
    //            }
    //        }
    //
    //        int [][] retAns = new int [ans.size()][2];
    //        for(int i=0;i<ans.size();i++){
    //            for (int j=0;j<2;j++){
    //            retAns[i][j] = ans.get(i).get(j);
    //        }
    //        }
    //        return retAns;
    //    }
    //}
}
