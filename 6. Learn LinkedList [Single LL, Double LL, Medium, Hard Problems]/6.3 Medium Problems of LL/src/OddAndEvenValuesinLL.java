public class OddAndEvenValuesinLL {
    //https://www.codingninjas.com/studio/problems/segregate-even-and-odd-nodes-in-a-linked-list_1116100?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //public class Solution{
    //    public static Node segregateEvenOdd(Node head){
    //        if (head==null) return null;
    //        Node temp = head;
    //        Node he = null;
    //        Node ho = null;
    //        while (temp!=null && temp.data%2==1){
    //            temp=temp.next;
    //        }
    //        he=temp;
    //        temp=head;
    //        while (temp!=null && temp.data%2==0){
    //            temp=temp.next;
    //        }
    //        ho=temp;
    //        temp=head;
    //        Node hte = he;
    //        Node hto = ho;
    //        while (temp!=null){
    //            if (temp.data%2==0){
    //                if (hte!=temp){
    //                hte.next=temp;
    //                hte=temp;
    //                }
    //            }
    //            else {
    //                if (hto!=temp){
    //                hto.next=temp;
    //                hto=temp;
    //                }
    //            }
    //            temp=temp.next;
    //        }
    //        if (temp==null){
    //            hte.next=null;
    //            hto.next=null;
    //        }
    //        hte.next=ho;
    //        return he;
    //    }
    //}
}
