public class MergeMSortedLinkedLists {
    //class Solution {
    //    public ListNode mergeKLists(ListNode[] lists) {
    //        PriorityQueue<Integer> pq = new PriorityQueue<>();
    //        for (int i = 0;i<lists.length;i++){
    //            ListNode temp = lists[i];
    //            while (temp!=null){
    //                pq.add(temp.val);
    //                temp = temp.next;
    //            }
    //        }
    //        ListNode head = new ListNode(0);
    //        ListNode temp = head;
    //        while (pq.size()!=0){
    //            ListNode newNode = new ListNode(pq.remove());
    //            temp.next = newNode;
    //            temp = temp.next;
    //        }
    //        return head.next;
    //    }
    //}
}
