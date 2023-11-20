public class InfixToPostfix {

//    https://www.codingninjas.com/studio/problems/day-23-:-infix-to-postfix-_1382146?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
    //import java.util.Stack;
    //
    //public class Solution {
    //    public static String infixToPostfix(String str) {
    //        Stack<String> st = new Stack<>();
    //        Stack<Character> op = new Stack<>();
    //
    //        for (int i=0;i<str.length();i++){
    //
    //            char ch = str.charAt(i);
    //
    //            if ( (ch>=48 && ch<=57) || (ch>=97 && ch<=122)){
    //                st.push(ch+"");
    //            }
    //
    //            else if (ch=='(') op.push(ch);
    //            else if (ch==')'){
    //
    //                while (op.peek()!='('){
    //                    String val2 = st.pop();
    //                    String val1 = st.pop();
    //                    char ops = op.pop();
    //                    st.push(val1+val2+ops);
    //                }
    //
    //                op.pop();
    //            }
    //
    //            else if (op.size()==0 || op.peek()=='(') op.push(ch);
    //
    //            else {
    //                if (ch=='^'){
    //                    while (op.size()>0 && op.peek()=='^'){
    //                    String val2 = st.pop();
    //                    String val1 = st.pop();
    //                    char ops = op.pop();
    //                    st.push(val1+val2+ops);
    //                    }
    //                    op.push(ch);
    //                }
    //                if (ch=='+'||ch=='-'){
    //                    while (op.size()>0 && (op.peek()=='*'||op.peek()=='/'||op.peek()=='+'||op.peek()=='-'||op.peek()=='^')){
    //                    String val2 = st.pop();
    //                    String val1 = st.pop();
    //                    char ops = op.pop();
    //                    st.push(val1+val2+ops);
    //                    }
    //                    op.push(ch);
    //                }
    //                else if (ch=='*'||ch=='/'){
    //                    while (op.size()>0 && (op.peek()=='*'||op.peek()=='/'||op.peek()=='^')){
    //                    String val2 = st.pop();
    //                    String val1 = st.pop();
    //                    char ops = op.pop();
    //                    st.push(val1+val2+ops);
    //                    }
    //                    op.push(ch);
    //                }
    //            }
    //        }
    //
    //        while (st.size()>1){
    //            String val2 = st.pop();
    //            String val1 = st.pop();
    //            char ops = op.pop();
    //            st.push(val1+val2+ops);
    //        }
    //
    //        return st.pop();
    //    }
    //}
}
