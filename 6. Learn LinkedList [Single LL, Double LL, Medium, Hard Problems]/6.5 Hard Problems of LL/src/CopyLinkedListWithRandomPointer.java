public class CopyLinkedListWithRandomPointer {
    //https://www.codingninjas.com/studio/problems/clone-a-linked-list-with-random-pointers_983604?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //leetcode 138
    //https://leetcode.com/problems/copy-list-with-random-pointer/description/



    //step wise hi hai
    //phle ek normal deep copy banao using only next pointers
    //the alternate connections banao
    //uske baad random pointers assign karo fir
    //list ko normal karke us deep copy ka head return kardo

    //https://youtu.be/FrGKsNBaq_4?si=i84Mvba0u9LxZfUL


    //class Solution {
    //    public Node copyRandomList(Node head) {
    //        Node temp = head;
    //        Node h = new Node(-1);
    //        Node t = h;
    //        while (temp!=null){
    //            Node n = new Node(temp.val);
    //            t.next = n;
    //            t=t.next;
    //            temp=temp.next;
    //        }
    //        h=h.next;
    //
    //
    //        Node h3 = new Node(-1);
    //        Node t1 = head;
    //        Node t2 = h;
    //        Node t3 = h3;
    //        while (t1!=null){
    //            t3.next=t1;
    //            t1=t1.next;
    //            t3=t3.next;
    //
    //            t3.next=t2;
    //            t2=t2.next;
    //            t3=t3.next;
    //        }
    //
    //        t2 = h;
    //        t1 = head;
    //
    //        while (t1!=null){
    //            if (t1.random == null) t2.random=null;
    //            else t2.random = t1.random.next;
    //            t1=t1.next.next;
    //            if (t2.next!=null) t2=t2.next.next;
    //        }
    //
    //        t1 = head;
    //        t2=h;
    //
    //        while (t1!=null){
    //            t1.next = t1.next.next;
    //            t1=t1.next;
    //
    //            if(t2.next!=null)
    //            t2.next = t2.next.next;
    //            t2=t2.next;
    //        }
    //
    //        return h;
    //    }
    //}
}
