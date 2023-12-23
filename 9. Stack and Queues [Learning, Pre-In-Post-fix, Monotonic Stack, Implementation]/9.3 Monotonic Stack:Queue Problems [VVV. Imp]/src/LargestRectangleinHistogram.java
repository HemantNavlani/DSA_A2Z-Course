public class LargestRectangleinHistogram {
    //Kiya hua hi tha kuch pre snall and next smaller nikalke height * width nikalna hai for area

    //https://leetcode.com/problems/largest-rectangle-in-histogram/description/
    //https://www.codingninjas.com/studio/problems/largest-rectangle-in-a-histogram_1058184?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //class Solution {
    //    public int largestRectangleArea(int[] heights) {
    //        int n = heights.length;
    //        int [] preSmall = new int [n];
    //        int [] nextSmall = new int [n];
    //        Stack<Integer> st1 = new Stack<>();
    //        Stack<Integer> st2 = new Stack<>();
    //
    //        for (int i=0;i<n;i++){
    //            while (st1.size()!=0 && heights[st1.peek()]>=heights[i]){
    //                st1.pop();
    //            }
    //            if (st1.size()==0) preSmall[i]=-1;
    //            else preSmall[i] = st1.peek();
    //            st1.push(i);
    //        }
    //
    //
    //        for (int i=n-1;i>=0;i--){
    //            while (st2.size()!=0 && heights[st2.peek()]>=heights[i]){
    //                st2.pop();
    //            }
    //            if (st2.size()==0) nextSmall[i]=n;
    //            else nextSmall[i] = st2.peek();
    //            st2.push(i);
    //        }
    //        int max = -1;
    //        for (int i =0;i<n;i++){
    //            int area = heights[i] * (nextSmall[i]-preSmall[i]-1);
    //            max = Math.max(max,area);
    //        }
    //        return max;
    //    }
    //}
}
