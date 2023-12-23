public class NextGreaterElement2 {
    //Isme aisa hai ki piche se travel karo array me aur stack me increasing order me elements pade hone
    // chahiye top pe chota fir bada and so on Jo current element ho array ka agar usse chote rakhe hai
    // stack ke top pe then remove them first fir jo usse bada ho vohi next greater hai and fir uss element
    // ko bhi push kardo stack me aise hi loop chalao and bht easy hai aur circular vale array me loop array
    // ki length ka double chalao and bas i ki jagah i%arr.length ka use karo

//https://www.codingninjas.com/studio/problems/count-of-greater-elements-to-the-right_8365436?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/next-greater-element-ii/description/
//
//import java.util.Stack;
//
//    public class Solution {
//
//        public static int[] nextGreaterElementII(int []arr) {
//            Stack<Integer> st = new Stack<>();
//            int n = arr.length;
//            for (int i=2*arr.length-1;i>=0;i--){
//                int topush = arr[i%n];
//                while (st.size()>0 && st.peek()<=arr[i%n]) st.pop();
//                if (i<n){
//                    if (st.size()==0) arr[i%n]=-1;
//                    else arr[i%n]=st.peek();
//                }
//                st.push(topush);
//            }
//            return arr;
//        }
//    }


}
