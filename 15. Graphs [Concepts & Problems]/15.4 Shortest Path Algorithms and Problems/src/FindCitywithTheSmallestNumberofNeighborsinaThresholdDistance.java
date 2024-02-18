public class FindCitywithTheSmallestNumberofNeighborsinaThresholdDistance {
    //https://www.codingninjas.com/studio/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance_1264289?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/submissions/1179030993/
    //simple floyd warshal lagaya hai vaise dijkstra se bhi ho skta hai har node ke liye lagana hoga vo bas that's it
    //class Solution {
    //    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
    //        int[][] cost = new int[n][n];
    //        for(int i= 0;i<n;i++){
    //            for (int j= 0;j<n;j++){
    //                cost[i][j] =(int) 1e9;
    //            }
    //            cost[i][i]=0;
    //        }
    //        for (int i = 0;i<edges.length;i++){
    //            for (int[] it: edges){
    //                int u = it[0];
    //                int v = it[1];
    //                int w = it[2];
    //                cost[u][v] = w;
    //                cost[v][u] = w;
    //            }
    //        }
    //
    //        for (int k = 0;k<n;k++){
    //            for (int i = 0;i<n;i++){
    //                for (int j=0;j<n;j++){
    //                    cost[i][j]=Math.min(cost[i][j],cost[i][k]+cost[k][j]);
    //                }
    //            }
    //        }
    //        int cityMax = n;
    //        int ans = -1;
    //        for (int i = 0;i<n;i++){
    //            int c = 0;
    //            for (int j=0;j<n;j++){
    //                if (cost[i][j]<=distanceThreshold)c++;
    //            }
    //            if (c<=cityMax) {
    //                cityMax = c;
    //                ans = i;
    //            }
    //        }
    //        return ans;
    //    }
    //}
}
