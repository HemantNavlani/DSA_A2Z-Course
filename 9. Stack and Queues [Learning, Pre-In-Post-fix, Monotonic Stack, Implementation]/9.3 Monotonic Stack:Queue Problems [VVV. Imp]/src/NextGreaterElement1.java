import java.util.Stack;

public class NextGreaterElement1 {
    //https://www.codingninjas.com/studio/problems/next-greater-element_670312?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

//    https://leetcode.com/problems/next-greater-element-i/description/
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        //Isme aisa hai ki piche se travel karo array me aur stack me increasing order me
        // elements pade hone chahiye top pe chota fir bada and so on Jo current element ho
        // array ka agar usse chote rakhe hai stack ke top pe then remove them first fir jo
        // usse bada ho vohi next greater hai and fir uss element ko bhi push kardo stack me
        // aise hi loop chalao and bht easy hai aur circular vale array me loop array ki length
        // ka double chalao and bas i ki jagah i%arr.length ka use karo

//        //
//        public class Solution {
//            public static int[] nextGreaterElement(int[] arr, int n) {
//                Stack<Integer> st = new Stack<>();
//                for (int i = arr.length-1;i>=0;i--){
//                    int topush = arr[i];
//                    while (st.size()>0 && st.peek()<=arr[i]) st.pop();
//                    if (st.size()==0) arr[i]=-1;
//                    else arr[i]=st.peek();
//                    st.push(topush);
//                }
//                return arr;
//            }
//        }
    }
}
