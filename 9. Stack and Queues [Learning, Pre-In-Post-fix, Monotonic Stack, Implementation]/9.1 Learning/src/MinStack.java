public class MinStack {
    //https://www.youtube.com/watch?v=B5RbUqdPK80

    //leetcode 155


    //https://www.codingninjas.com/studio/problems/min-stack_3843991?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    //approach 1 using two stacks ek normal vala aur ek min name se usme har ek ke liye minimum value daldenge aur fir jab pop karenge toh curret minimum hi top pe rahega
    //class MinStack {
    //    Stack<Integer> st;
    //    Stack<Integer> min;
    //    public MinStack() {
    //        st = new Stack<>();
    //        min = new Stack<>();
    //    }
    //    public void push(int val) {
    //        st.push(val);
    //        if (min.size()==0) min.push(val);
    //        else {
    //            if (val<min.peek()){
    //                min.push(val);
    //            }
    //            else{
    //                min.push(min.peek());
    //            }
    //        }
    //    }
    //
    //    public void pop() {
    //        st.pop();
    //        min.pop();
    //    }
    //
    //    public int top() {
    //        return st.peek();
    //    }
    //
    //    public int getMin() {
    //        return min.peek();
    //    }
    //}


    //approach 2 isme just ek single extra variable rakhte hai aur uss se hi kar lete hai

    //us variable se ham old min restore karne ki koshish karte hai
    //read the code aur watch out the video once again


    //class MinStack {
    //    Stack<Long> st;
    //    long min;
    //    public MinStack() {
    //        st=new Stack<>();
    //    }
    //
    //    public void push(int val) {
    //        if (st.size()==0){
    //            st.push((long)val);
    //            min = (long)val;
    //        }
    //        else{
    //            if (val<min){
    //                st.push(2*(long)val-min);
    //                min=(long)val;
    //            }
    //            else{
    //                st.push((long)val);
    //            }
    //        }
    //    }
    //
    //    public void pop() {
    //        if(st.peek()>=min){
    //            st.pop();
    //        }
    //        else{
    //            min = 2*min-st.pop();
    //        }
    //    }
    //
    //    public int top() {
    //        long q = st.peek();
    //        if (st.peek()>=min) return (int)q;
    //        if (st.peek()<min) return (int)min;
    //    }
    //
    //    public int getMin() {
    //        return(int) min;
    //    }
}