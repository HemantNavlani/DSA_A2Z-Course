public class DeleteTheMiddleofLL {

    //leetcode 2095
    //https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/

    //https://www.codingninjas.com/studio/problems/delete-middle-node_763267?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
 //optimised hi hai slow and fast use kiye hai

    //class Solution {
    //    public ListNode deleteMiddle(ListNode head) {
    //        ListNode temp = new ListNode();
    //        temp.next = head;
    //        ListNode slow = temp;
    //        ListNode fast = head;
    //        while (fast!=null && fast.next!=null){
    //            slow = slow.next;
    //            fast = fast.next.next;
    //        }
    //        slow.next = slow.next.next;
    //        return temp.next;
    //    }
    //}
}
