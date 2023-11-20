package LectureRevision;

import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        String str = "8-5+3*4/6";

        Stack<Integer> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch>=48 && ch <=57){
                st.push(ch-48);
            }
            else {
                if (op.size() == 0) op.push(ch);
                else {
                    if (ch == '+' || ch == '-') {
                        int val2 = st.pop();
                        int val1 = st.pop();
                        char ops = op.pop();
                        if (ops == '+') st.push(val1 + val2);
                        else if (ops == '-') st.push(val1 - val2);
                        else if (ops == '/') st.push(val1 / val2);
                        else if (ops == '*') st.push(val1 * val2);
                        op.push(ch);
                    } else if (ch == '*' || ch == '/') {
                        if (op.peek() == '*' || op.peek() == '/') {
                            int val2 = st.pop();
                            int val1 = st.pop();
                            char ops = op.pop();
                            if (ops == '/') st.push(val1 / val2);
                            else if (ops == '*') st.push(val1 * val2);
                        }
                        op.push(ch);
                    }
                }
            }
        }

        while (st.size()>1){
            int val2 = st.pop();
            int val1 = st.pop();
            char ops = op.pop();
            if (ops=='+') st.push(val1+val2);
            else if (ops=='-') st.push(val1-val2);
            else if (ops=='/')st.push(val1/val2);
            else if (ops=='*')st.push(val1*val2);
        }
        System.out.println(st.peek());
    }
}
