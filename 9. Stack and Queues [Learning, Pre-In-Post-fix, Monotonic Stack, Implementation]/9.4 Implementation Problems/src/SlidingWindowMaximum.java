import java.util.ArrayList;

public class SlidingWindowMaximum {
    //https://www.codingninjas.com/studio/problems/sliding-maximum-_701652?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //https://leetcode.com/problems/sliding-window-maximum/description/

    //isme hamme next greater element ka hi use karna hai aur fir uske hissab se dekhna hai
    //agar ek particular window me ek element ka next greater elemeent bahar hai toh vo element khud hi max hai nhi toh window ke andar hai \
    //next greater element toh vohi max hoga jo nextgreater hai inside that window aise hi karte jao and thats it

    //class Solution {
    //    public int[] maxSlidingWindow(int[] nums, int k) {
    //        Stack<Integer> st = new Stack<>();
    //        int n = nums.length;
    //        int [] nge = new int[n];
    //        for (int i = n-1;i>=0;i--){
    //            while (st.size()!=0 && nums[st.peek()]<nums[i]){
    //                st.pop();
    //            }
    //            if (st.size()==0) nge[i] = n;
    //            else nge[i] =st.peek();
    //            st.push(i);
    //        }
    //        int j = 0;
    //        int z = 0;
    //        int [] ans = new int [n-k+1];
    //        for (int i = 0;i<n-k+1;i++){
    //            if (j>=i+k) j = i;
    //            int max = 0;
    //            while (j<i+k){
    //                max = nums[j];
    //                j=nge[j];
    //            }
    //            ans[z++] = max;
    //        }
    //        return ans;
    //    }
    //}
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
    }
}
