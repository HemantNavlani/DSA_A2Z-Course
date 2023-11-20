package LectureRevision;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args)  {
        String str = "9-(5+3)*4/6";

        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch>=48 && ch <=57){
                st.push(ch+"");
            }
            else if (ch=='(') op.push('(');
            else if (ch==')') {
                while (op.peek()!='('){
                    String val2 = st.pop();
                    String val1 = st.pop();
                    char ops = op.pop();
                    if (ops=='+') st.push(val1+val2+ops);
                    else if (ops=='-') st.push(val1+val2+ops);
                    else if (ops=='/')st.push(val1+val2+ops);
                    else if (ops=='*')st.push(val1+val2+ops);
                }
                op.pop();
            }
            else {
                if (op.size() == 0) op.push(ch);
                else {
                    if (ch == '+' || ch == '-') {
                        if (op.peek()!='(') {
                            String val2 = st.pop();
                            String val1 = st.pop();
                            char ops = op.pop();
                            if (ops=='+') st.push(val1+val2+ops);
                            else if (ops=='-') st.push(val1+val2+ops);
                            else if (ops=='/')st.push(val1+val2+ops);
                            else if (ops=='*')st.push(val1+val2+ops);

                        }
                        op.push(ch);
                    }
                    else if (ch == '*' || ch == '/') {
                        if (op.peek() == '*' || op.peek() == '/') {
                            String val2 = st.pop();
                            String val1 = st.pop();
                            char ops = op.pop();
                            if (ops == '/') st.push(val1+val2+ops);
                            else if (ops == '*') st.push(val1+val2+ops);
                        }
                        op.push(ch);
                    }
                }
            }
        }

        while (st.size()>1){
            String val2 = st.pop();
            String val1 = st.pop();
            char ops = op.pop();
            if (ops=='+') st.push(val1+val2+ops);
            else if (ops=='-') st.push(val1+val2+ops);
            else if (ops=='/')st.push(val1+val2+ops);
            else if (ops=='*')st.push(val1+val2+ops);
        }
        System.out.println(st.peek());
    }
}
