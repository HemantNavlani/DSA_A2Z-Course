public class MaximalRectangle {

    //https://leetcode.com/problems/maximal-rectangle/

    //https://www.codingninjas.com/studio/problems/maximum-size-rectangle-sub-matrix-with-all-1's_893017?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //isme ham row wise largest area of rectangle in histogram approach lagani hai,
    // har row ke according jana hai and uska histogram de dena hai bas most code
    // toh histogram vale ka hi copy karna hoga
    //class Solution {
    //    public int largestAreainHistogram(int[] arr){
    //        int n = arr.length;
    //        Stack<Integer> st = new Stack<>();
    //        Stack<Integer> st1 = new Stack<>();
    //        int [] ps = new int [n];
    //        int [] ns = new int [n];
    //        for (int i = 0;i<n;i++){
    //            while (st.size()!=0 && arr[st.peek()]>=arr[i])st.pop();
    //            if (st.size()==0) ps[i] = -1;
    //            else ps[i] =st.peek();
    //            st.push(i);
    //        }
    //        for (int i = n-1;i>=0;i--){
    //            while (st1.size()!=0 && arr[st1.peek()]>=arr[i])st1.pop();
    //            if (st1.size()==0) ns[i] = n;
    //            else ns[i] =st1.peek();
    //            st1.push(i);
    //        }
    //        int max = -1;
    //        for (int i = 0;i<n;i++){
    //            int area = arr[i] * (ns[i]-ps[i]-1);
    //            max = Math.max(max,area);
    //        }
    //        return max;
    //    }
    //    public int maximalRectangle(char[][] matrix) {
    //        int rows = matrix.length;
    //        int cols = matrix[0].length;
    //        int [] arr = new int [cols];
    //        int max = -1;
    //        for (int i = 0;i<rows;i++){
    //            for (int j=0;j<cols;j++){
    //                if(matrix[i][j]=='1') arr[j]+=1;
    //                else arr[j]=0;
    //            }
    //            int area = largestAreainHistogram(arr);
    //            max = Math.max(max,area);
    //        }
    //        return max;
    //    }
    //}
}
