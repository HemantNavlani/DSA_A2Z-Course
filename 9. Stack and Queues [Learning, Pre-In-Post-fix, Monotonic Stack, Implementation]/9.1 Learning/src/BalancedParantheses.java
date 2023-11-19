public class BalancedParantheses {
    //leetcode 20
    //https://leetcode.com/problems/valid-parentheses/description/

    //https://www.codingninjas.com/studio/problems/valid-parentheses_795104?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //class Solution {
    //    public boolean isValid(String s) {
    //        Stack<Character> st = new Stack<>();
    //        for (int i=0;i<s.length();i++){
    //            char ch = s.charAt(i);
    //            if (ch=='(' || ch=='{' || ch=='['){
    //                st.push(ch);
    //            }
    //            else {
    //                if(st.size()==0) return false;
    //                else if ((ch==')' && st.peek()=='(') || (ch==']' && st.peek()=='[') || (ch=='}' && st.peek()=='{')) st.pop();
    //                else return false;
    //            }
    //        }
    //        return st.size()==0;
    //    }
    //}
}
