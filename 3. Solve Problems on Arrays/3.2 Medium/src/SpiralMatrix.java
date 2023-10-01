public class SpiralMatrix {
    //leetcode 54
    //https://leetcode.com/problems/spiral-matrix/description/

    //https://www.codingninjas.com/studio/problems/spiral-matrix_6922069?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
    //class Solution {
    //    public List<Integer> spiralOrder(int[][] matrix) {
    //        List<Integer> list = new ArrayList<>();
    //        int m = matrix.length;
    //        int n = matrix[0].length;
    //        int left = 0;
    //        int right = n-1;
    //        int top = 0;
    //        int bot = m-1;
    //        int val = 0;
    //        while (val<m*n){
    //        if (top<m){
    //        for (int i = left;i<=right && val<m*n;i++){
    //            list.add(matrix[top][i]);
    //            val++;
    //        }
    //        top++;
    //        }
    //        if (right>=0){
    //        for (int i = top;i<=bot && val<m*n;i++){
    //            list.add(matrix[i][right]);
    //               val++;
    //        }
    //        right--;
    //        }
    //        if (bot>=0){
    //        for (int i=right;i>=left && val<m*n;i--){
    //            list.add(matrix[bot][i]);
    //               val++;
    //        }
    //        bot--;
    //        }
    //        if (left<n){
    //        for (int i=bot;i>=top && val<m*n;i--){
    //            list.add(matrix[i][left]);
    //            val++;
    //        }
    //        left++;
    //        }
    //    }
    //        return list;
    //    }
    //}
}
