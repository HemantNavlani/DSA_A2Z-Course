public class ImplementStackUsingQueue {
    //leetcode 225
    //https://leetcode.com/problems/implement-stack-using-queues/description/

    //https://www.codingninjas.com/studio/problems/stack-using-queue_795152?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class MyStack {
    //    Queue<Integer> q = new LinkedList<>();
    //    public MyStack() {
    //    }
    //
    //    public void push(int x) {
    //        q.add(x);
    //    }
    //
    //    public int pop() {
    //        for (int i = 0;i<q.size()-1;i++){
    //            q.add(q.remove());
    //        }
    //        int val = q.remove();
    //        return val;
    //    }
    //
    //    public int top() {
    //         for (int i = 0;i<q.size()-1;i++){
    //            q.add(q.remove());
    //        }
    //        int val = q.peek();
    //        q.add(q.remove());
    //        return val;
    //    }
    //
    //    public boolean empty() {
    //        if (q.size()==0) return true;
    //        return false;
    //    }
    //}
    //

    //class MyStack {
    //    Queue<Integer> q = new LinkedList<>();
    //    public MyStack() {
    //    }
    //
    //    public void push(int x) {
    //        q.add(x);
    //        for (int i=0;i<q.size()-1;i++){
    //            q.add(q.remove());
    //        }
    //    }
    //
    //    public int pop() {
    //        return  q.remove();
    //    }
    //
    //    public int top() {
    //        return q.peek();
    //    }
    //
    //    public boolean empty() {
    //        if (q.size()==0) return true;
    //        return false;
    //    }

    //import java.util.LinkedList;
    //import java.util.Queue;
    //
    //public class Solution{
    //    static class Stack {
    //        Queue<Integer> q = new LinkedList<>();
    //
    //        public Stack() {
    //            // Implement the Constructor.
    //        }
    //
    //        /*----------------- Public Functions of Stack -----------------*/
    //
    //        public int getSize() {
    //            return q.size();
    //        }
    //
    //        public boolean isEmpty() {
    //            if(q.size()==0) return true;
    //            return false;
    //        }
    //
    //        public void push(int element) {
    //            q.add(element);
    //            for(int i =0;i<q.size()-1;i++){
    //                q.add(q.remove());
    //            }
    //        }
    //
    //        public int pop() {
    //            if (isEmpty()) return -1;
    //            return q.remove();
    //        }
    //
    //        public int top() {
    //            if (isEmpty()) return -1;
    //            return q.peek();
    //        }
    //    }
    //}
}