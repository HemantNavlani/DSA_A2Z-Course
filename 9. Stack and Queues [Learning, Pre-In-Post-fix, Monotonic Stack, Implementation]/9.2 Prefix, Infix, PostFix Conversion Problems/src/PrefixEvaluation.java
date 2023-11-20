import java.util.Stack;

public class PrefixEvaluation {

        public static void main(String[] args) {
            String str = "-9/*+5346";
            Stack<Integer> st = new Stack<>();
            for (int i =str.length()-1;i>=0;i--){
                char ch = str.charAt(i);
                if (ch>=48 && ch<=57){
                    st.push(ch-48);
                }
                else{
                    int val1 = st.pop();
                    int val2 = st.pop();
                    if (ch=='+') st.push(val1+val2);
                    else if (ch=='-') st.push(val1-val2);
                    else if (ch=='*') st.push(val1*val2);
                    else if (ch=='/') st.push(val1/val2);
                }
            }
            System.out.println(st.peek());
        }
    }
