public class Triangle {
//    https://leetcode.com/problems/triangle/description/
//    https://www.naukri.com/code360/problems/triangle_1229398?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //class Solution {
    //    public int minimumTotal(List<List<Integer>> triangle) {
    //        int n = triangle.size();
    //        return solver (0,0,triangle);
    //    }
    //    int solver (int i,int j,List<List<Integer>> triangle,){
    //        if (i==triangle.size()-1) return triangle.get(i).get(j);
    //        int down = triangle.get(i).get(j) + solver(i+1,j,triangle);
    //        int diagonal = triangle.get(i).get(j) + solver(i+1,j+1,triangle);
    //        return  Math.min(down,diagonal);
    //    }
    //}

    //class Solution {
    //    public int minimumTotal(List<List<Integer>> triangle) {
    //        int n = triangle.size();
    //        int [][] dp = new int [n][];
    //        for (int i =0;i<n;i++){
    //            dp[i] = new int[triangle.get(i).size()];
    //            for (int j = 0;j<triangle.get(i).size();j++){
    //                dp[i][j] = -1;
    //            }
    //        }
    //        return solver (0,0,triangle,dp);
    //    }
    //    int solver (int i,int j,List<List<Integer>> triangle,int[][]dp){
    //        if (i==triangle.size()-1) return triangle.get(i).get(j);
    //        if (dp[i][j]!=-1) return dp[i][j];
    //        int down = triangle.get(i).get(j) + solver(i+1,j,triangle,dp);
    //        int diagonal = triangle.get(i).get(j) + solver(i+1,j+1,triangle,dp);
    //        return dp[i][j] = Math.min(down,diagonal);
    //    }
    //}


    //class Solution {
    //    public int minimumTotal(List<List<Integer>> triangle) {
    //        int n = triangle.size();
    //        int [][] dp = new int [n][];
    //        for (int i =0;i<n;i++){
    //            dp[i] = new int[triangle.get(i).size()];
    //        }
    //        for (int j = 0;j<n;j++){
    //            dp[n-1][j] = triangle.get(n-1).get(j);
    //        }
    //        for (int i = n-2;i>=0;i--){
    //            for (int j=i;j>=0;j--){
    //                int down = triangle.get(i).get(j) + dp[i+1][j];
    //                int diagonal = triangle.get(i).get(j) + dp[i+1][j+1];
    //                dp[i][j] = Math.min(down,diagonal);
    //            }
    //        }
    //        return dp[0][0];
    //    }
    //}

    //class Solution {
    //    public int minimumTotal(List<List<Integer>> triangle) {
    //        int n = triangle.size();
    //        int[]prev = new int [n];
    //        for (int j=0;j<n;j++) prev[j] = triangle.get(n-1).get(j);
    //
    //        for (int i = n-2;i>=0;i--){
    //            int[] temp = new int[i+1];
    //            for (int j=i;j>=0;j--){
    //                int down = triangle.get(i).get(j) + prev[j];
    //                int diagonal = triangle.get(i).get(j) + prev[j+1];
    //                temp[j] = Math.min(down,diagonal);
    //            }
    //            prev = temp;
    //        }
    //        return prev[0];
    //    }
    //}
}
