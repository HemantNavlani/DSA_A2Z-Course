public class ReverseStack {
    //https://www.codingninjas.com/studio/problems/reverse-stack-using-recursion_631875?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

    //without recursion

    //import java.util.Stack;
    //
    //public class Solution {
    //
    //	public static void reverseStack(Stack<Integer> stack) {
    //		Stack<Integer> st = new Stack<>();
    //		Stack<Integer> st2 = new Stack<>();
    //		while (stack.size()!=0){
    //			int a = stack.pop();
    //			st.push(a);
    //		}
    //		while (st.size()!=0){
    //			int a = st.pop();
    //			st2.push(a);
    //		}
    //		while (st2.size()!=0){
    //			int a = st2.pop();
    //			stack.push(a);
    //		}
    //	}
    //
    //}


    //Using recursion
    //import java.util.ArrayList;
    //import java.util.List;
    //import java.util.Stack;
    //
    //public class Solution {
    //    public static void reverse(Stack<Integer> st, List<Integer> l){
    //		if (st.size()==0){
    //			for(int i =0;i<l.size();i++){
    //				st.push(l.get(i));
    //			}
    //			return;
    //		}
    //		l.add(st.pop());
    //		reverse(st,l);
    //	}
    //	public static void reverseStack(Stack<Integer> stack) {
    //		List<Integer> list = new ArrayList<>();
    //		reverse(stack,list);
    //	}
    //
    //}
}
