public class RemoveKDigit {
    //easy hai isme bhi monotonic stack hi rakhna hai aur usse hi karna hai aur k ki value jab tak positive hai tab tak hi monotonic stack rakhna hai bas fir stack me jo bache vo hi answer hai
    //https://leetcode.com/problems/remove-k-digits/

    //https://www.codingninjas.com/studio/problems/remove-k-digits_1461221?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //class Solution {
    //    public String removeKdigits(String num, int k) {
    //        Stack<Integer> st = new Stack <>();
    //        int n = num.length();
    //        for (int i = 0;i<n;i++){
    //            int a = (int) num.charAt(i)-48;
    //            while (st.size()!=0 && k>0 && st.peek()>a) {
    //                st.pop();
    //                k--;
    //            }
    //            st.push(num.charAt(i)-48);
    //        }
    //        while (k>0){
    //            st.pop();
    //            k--;
    //        }
    //        StringBuilder sb = new StringBuilder();
    //        while (st.size()!=0){
    //            sb.append(st.pop());
    //        }
    //        sb.reverse();
    //        String s = sb.toString();
    //
    //        int i = 0;
    //        while (i<s.length() && s.charAt(i)=='0'){
    //            i++;
    //        }
    //        if (s.substring(i).equals("")) return "0";
    //        else return s.substring(i);
    //    }
    //}
}
