public class DeleteAllOccurrencesofaKeyinDLL {
    ////https://www.codingninjas.com/studio/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list_8160461?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //
    //public class Solution {
    //
    //    //jugad se kiya hai logic toh smjh aaya easy hi hai but edge cases ne dikkat ki
    //    public static Node deleteAllOccurrences(Node head, int k) {
    //        if (head == null) return null;
    //        Node t1 = null;
    //        Node t2 = head;
    //        boolean isDeleted = false;
    //        while (t2!=null){
    //            if (t2.data==k){
    //                if (t2.next!=null) t2.next.prev=t1;
    //                if (t1!=null) {
    //                    isDeleted = true;
    //                    t1.next=t2.next;
    //                }
    //                else isDeleted = true;
    //            }
    //            else isDeleted = false;
    //
    //
    //            if (!isDeleted){
    //                t1=t2;
    //                t2 = t2.next;
    //            }
    //            else{
    //            Node temp = t2.next;
    //            t2.next = null;
    //            t2.prev = null;
    //            if (temp!=null && temp.prev==null) head = temp;
    //            t2=temp;
    //            }
    //        }
    //        if (head.data==k) return null;
    //        return head;
    //    }
    //}
}
