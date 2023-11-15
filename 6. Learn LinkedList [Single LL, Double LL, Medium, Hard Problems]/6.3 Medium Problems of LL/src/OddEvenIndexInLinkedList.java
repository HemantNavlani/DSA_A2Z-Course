public class OddEvenIndexInLinkedList {
    //leetcode 328
    //https://leetcode.com/problems/odd-even-linked-list/description/
    //class Solution {
    //    public ListNode oddEvenList(ListNode head) {
    //        if (head==null || head.next==null) return head;
    //        int i = 2;
    //        ListNode temp = head.next.next;
    //        ListNode ho = head.next;
    //        ListNode hte = head;
    //        ListNode hto = ho;
    //        while (temp!=null){
    //            if (i%2==0){
    //                hte.next=temp;
    //                hte=temp;
    //            }
    //            else {
    //                hto.next=temp;
    //                hto=temp;
    //            }
    //            temp=temp.next;
    //            i++;
    //        }
    //        if(temp==null){
    //            hto.next=null;
    //            hte.next=null;
    //        }
    //        hte.next = ho;
    //        return head;
    //    }
    //}
}
