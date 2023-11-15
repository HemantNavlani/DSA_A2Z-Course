import java.util.HashMap;

public class RemoveNthNodefromBacl {

    //leetcode 19
    //https://leetcode.com/problems/remove-nth-node-from-end-of-list/

    //https://www.codingninjas.com/studio/problems/delete-kth-node-from-end_799912?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //This is the simple solution taking O(2N) time but we need do it in O(N)

    //class Solution {
    //    public int size(ListNode head){
    //        ListNode temp = head;
    //        int count = 0;
    //        while (temp!=null){
    //            temp=temp.next;
    //            count++;
    //        }
    //        return count;
    //    }
    //    public ListNode removeNthFromEnd(ListNode head, int n) {
    //        if (head.next==null) return null;
    //        n = size(head)-n;
    //        if (n==0) return head.next;
    //        ListNode temp = head;
    //        int i = 0;
    //        while (i<n-1){
    //            temp=temp.next;
    //            i++;
    //        }
    //        temp.next=temp.next.next;
    //        return head;
    //    }
    //}

    //Better approach in O(N) here we involved the concept of fast and slow pointers
//    class Solution {
//        public ListNode removeNthFromEnd(ListNode head, int n) {
//            ListNode temp = new ListNode();
//            temp.next = head;
//            ListNode slow = temp;
//            ListNode fast = temp;
//            for (int i=0;i<=n;i++){
//                fast = fast.next;
//            }
//            while (fast!=null){
//                slow=slow.next;
//                fast=fast.next;
//            }
//            slow.next = slow.next.next;
//            return temp.next;
//        }
//    }
}
