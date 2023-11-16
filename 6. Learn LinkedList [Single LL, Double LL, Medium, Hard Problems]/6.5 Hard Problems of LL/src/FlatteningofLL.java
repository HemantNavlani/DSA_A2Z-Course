public class FlatteningofLL {
    //https://www.codingninjas.com/studio/problems/flatten-a-linked-list_1112655?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //maine jo kara tha vo bus flatten tha but yaha we need sorted and flatten toh mera approach is not of much use so ye approach hai jisme recursion laga rahe hai simple read the code you will understand
//https://youtu.be/ysytSSXpAI0?si=Gid0phuyui8_Nd4i

    //https://youtu.be/rM5EEA_rbNY?si=us8_RY3vyqp-bBZA
    //public class Solution {
    //     public static Node merge(Node a, Node b){
    //        Node temp = new Node (0);
    //        Node res = temp;
    //        while (a!=null && b!=null){
    //            if (a.data<b.data){
    //                temp.child=a;
    //                temp=temp.child;
    //                a=a.child;
    //            }
    //            else {
    //                temp.child=b;
    //                temp=temp.child;
    //                b=b.child;
    //            }
    //        }
    //        if (a!=null) temp.child=a;
    //        else temp.child=b;
    //        return res.child;
    //    }
    //    public static Node flattenLinkedList(Node head) {
    //        if (head==null || head.next==null) return head;
    //
    //        //recursion for list on right
    //        head.next = flattenLinkedList(head.next);
    //
    //        //now merge
    //        head = merge(head,head.next);
    //        //return the head
    //        //it will be in turn merge with its left
    //        return head;
    //    }
    //}
}
