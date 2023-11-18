import java.util.Stack;

public class SortStack {
    static void sortRec(Stack<Integer> st,Stack<Integer> st1){
        if (st.size()==0) return;
        int a = st.pop();
        Stack<Integer> st2 = new Stack<>();
        while (st1.size()!=0 && a>st1.peek()){
            st2.push(st1.pop());
        }
        st1.push(a);
        while (st2.size()!=0){
            st1.push(st2.pop());
        }
        sortRec(st,st1);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(2);
        st.push(5);
        st.push(4);


        Stack<Integer> st1 = new Stack<>();
        st1.push(st.pop());

//        while (st.size()!=0){
//            int a = st.pop();
//            Stack<Integer> st2 = new Stack<>();
//                while (st1.size()!=0 && a>st1.peek()){
//                    st2.push(st1.pop());
//                }
//                st1.push(a);
//                while (st2.size()!=0){
//                    st1.push(st2.pop());
//                }
//        }

        sortRec(st,st1);

        //decreasing sort chahiye toh vo pada hi hai kisme st1 me and increasing order chahiye then just put st1 to st
        System.out.println(st1);

        while (st1.size()!=0){
            st.push(st1.pop());
        }
        System.out.println(st);
    }
}

