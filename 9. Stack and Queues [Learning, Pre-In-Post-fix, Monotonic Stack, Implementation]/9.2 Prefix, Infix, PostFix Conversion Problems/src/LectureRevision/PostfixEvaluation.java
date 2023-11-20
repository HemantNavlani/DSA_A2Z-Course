package LectureRevision;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> st = new Stack<>();
        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch>=48 && ch<=57){
                st.push(ch-48);
            }
            else{
                int val2 = st.pop();
                int val1 = st.pop();
                if (ch=='+') st.push(val1+val2);
                else if (ch=='-') st.push(val1-val2);
                else if (ch=='*') st.push(val1*val2);
                else if (ch=='/') st.push(val1/val2);
            }
        }
        System.out.println(st.peek());
    }
}
