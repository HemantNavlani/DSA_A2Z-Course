public class MinimumNumberofBracketReversalsNeededToMakeAnExpressionBalanced {
    //https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/submissions/1252775564/
    //simple hai bas shi pair ko hata diya hai aur invalid ko count kar liya hai bas fir uska count return kar diya hai
    //class Solution {
    //    public int minAddToMakeValid(String s) {
    //        int n = s.length();
    //        Stack<Character> st = new Stack<>();
    //        for (int i =0;i<n;i++){
    //            if (s.charAt(i)=='(') st.push('(');
    //            else {
    //                if (st.size()>0 && st.peek()=='(') st.pop();
    //                else st.push(')');
    //            }
    //        }
    //        return st.size();
    //    }
    //}

    //class Solution {
    //    public int minAddToMakeValid(String s) {
    //        int n = s.length();
    //        int open = 0;
    //        int close = 0;
    //        for (int i = 0;i<n;i++){
    //            if (s.charAt(i)=='(') open++;
    //            else {
    //                if (open==0) close++;
    //                else open--;
    //            }
    //        }
    //        return open+close;
    //    }
    //}
}
