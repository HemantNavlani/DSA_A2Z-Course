public class MaximumRectangleAreawithall1 {
//https://leetcode.com/problems/maximal-rectangle/submissions/1246587555/
    //isme basically you shoul know the largest area in histogram question which is of stack baaki toh fir bahut simple hai
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
    //        int r = matrix.length;
    //        int c = matrix[0].length;
    //        int [] arr = new int[c];
    //        int max = -1;
    //        for (int i =0;i<r;i++){
    //            for (int j =0;j<c;j++){
    //                if (matrix[i][j]=='1') arr[j]+=1;
    //                else arr[j]=0;
    //            }
    //            int area = largestAreainHistogram(arr);
    //            max = Math.max(max,area);
    //        }
    //        return max;
    //    }
    //}

}
