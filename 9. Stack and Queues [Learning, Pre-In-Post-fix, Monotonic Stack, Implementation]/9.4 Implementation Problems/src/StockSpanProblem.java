public class StockSpanProblem {
    //https://www.codingninjas.com/studio/problems/stock-span_5243295?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //https://leetcode.com/problems/online-stock-span/
    //import java.util.*;
    //public class Solution {
    //    public static int[] findStockSpans(int []prices) {
    //        // 100,80,60,70,60,75,85
    //        // -1. 0. 1.  1 3   1 0
    //        int n = prices.length;
    //        Stack<Integer> st = new Stack<>();
    //        int pge[] = new int [n];
    //        for (int i = 0;i<n;i++){
    //            while (st.size()!=0 && prices[st.peek()]<prices[i]){
    //
    //                st.pop();
    //            }
    //            if (st.size()==0) pge[i] =-1;
    //            else pge[i] = st.peek();
    //            st.push(i);
    //        }
    //        int [] ans = new int [n];
    //        for (int i = 0;i<n;i++){
    //            ans[i] = i - pge[i];
    //        }
    //        return ans;
    //    }
    //}
}
