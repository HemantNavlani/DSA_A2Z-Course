import java.util.Stack;

public class SumOfSubarrayMinimum {
    //https://www.codingninjas.com/studio/problems/sum-of-subarray-minimums_8365431?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/sum-of-subarray-minimums/
    //ye approach toh bekar and simple hai

   //class Solution {
    //    public int sumSubarrayMins(int[] arr) {
    //        int ans = 0;
    //        int n = arr.length;
    //        // 3 1 2 4
    //        for (int i = 0;i<n;i++){
    //            int min = arr[i];
    //            for (int j = i;j<n;j++){
    //                min = arr[j]<min ? arr[j] : min;
    //
    //                ans += min;
    //                //ans = 3 +1 +1+1+1+1+1+2+2+4
    //            }
    //        }
    //        return ans;
    //    }
    //}


    //isme badiya approach hai kyunki isme ham nextsmaller aur prevsmaller array bana rahe hai fir usse le rahe hai read code easy hai
    //prevsmaller ya nextsmaller kisi ek me equalto ka sign nhi hai to avoid duplicates (in the condition in while loop)
    //class Solution {
    //    public int sumSubarrayMins(int[] arr) {
    //        int n = arr.length;
    //        Stack<Integer> st = new Stack<>();
    //        int [] pre = new int[n];
    //        //3 1 2 4
    //        //-1 -1 1 1
    //        //1 4 4 4
    //        //
    //        for (int i=0;i<n;i++){
    //            while (st.size()!=0 && arr[st.peek()]>arr[i]){
    //                st.pop();
    //            }
    //            if (st.size()==0) pre[i]=-1;
    //            else pre[i] = st.peek();
    //            st.push(i);
    //        }
    //        Stack<Integer> st1 = new Stack<>();
    //        int [] next = new int [n];
    //        for (int i = n-1;i>=0;i--){
    //            while (st1.size()!=0 && arr[st1.peek()]>=arr[i]){
    //                st1.pop();
    //            }
    //            if (st1.size()==0) next[i] = n;
    //            else next[i] =st1.peek();
    //            st1.push(i);
    //        }
    //        long cnt = 0;
    //        int mod = 1000000007;
    //             //3 1 2 4
    //        //-1 -1 1 1
    //        // //1 4 4 4
    //        // 2
    //        // 1
    //        // // cnt = 3 +6+4+8
    //        for (int i = 0;i<n;i++){
    //            int first = i-pre[i];
    //            int second = next[i] - i;
    //            long prod = (first*second)%mod;
    //            prod = (arr[i]*prod)%mod;
    //            cnt =(cnt%mod + prod)%mod;
    //        }
    //        return (int)cnt;
    //    }
    //}
}
