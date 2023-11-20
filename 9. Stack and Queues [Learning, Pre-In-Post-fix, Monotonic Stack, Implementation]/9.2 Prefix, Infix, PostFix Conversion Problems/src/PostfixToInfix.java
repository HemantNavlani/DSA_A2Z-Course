import java.util.Stack;

public class PostfixToInfix {
    //https://www.codingninjas.com/studio/problems/postfix-to-infix_8382386?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
    public static void main(String[] args) {
        String str = "ab+c+";
        Stack<String> st = new Stack<>();
        for (int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if ((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) st.push(ch+"");
            else {

                String val2 = st.pop();
                String val1 = st.pop();
                st.push("("+val1+ch+val2+")");
            }
        }
        System.out.println(st.peek());
    }

}
