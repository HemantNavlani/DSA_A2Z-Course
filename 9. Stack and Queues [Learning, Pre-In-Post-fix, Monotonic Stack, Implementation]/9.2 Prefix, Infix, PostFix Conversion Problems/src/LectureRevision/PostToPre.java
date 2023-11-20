package LectureRevision;

import java.util.Stack;

public class PostToPre {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> st = new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch>=48 && ch<=57){
                st.push(ch+"");
            }
            else{
                String val2 = st.pop();
                String val1 = st.pop();
                st.push(ch+val1+val2);
            }
        }
        System.out.println(st.peek());
    }
}
