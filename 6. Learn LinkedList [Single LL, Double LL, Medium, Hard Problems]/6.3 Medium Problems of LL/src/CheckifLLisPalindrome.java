public class CheckifLLisPalindrome {
 //leetcode 234
    //https://leetcode.com/problems/palindrome-linked-list/description/

    //https://www.codingninjas.com/studio/problems/check-if-linked-list-is-palindrome_985248?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
    //    public ListNode reverse(ListNode node){
    //        ListNode temp = null;
    //        ListNode t1 = node;
    //        ListNode t2 = null;
    //        while (t1!=null){
    //            t2=t1.next;
    //            t1.next=temp;
    //            temp=t1;
    //            t1=t2;
    //        }
    //        return temp;
    //    }
    //    public boolean isPalindrome(ListNode head) {
    //        ListNode slow = head;
    //        ListNode fast = head;
    //        while (fast.next!=null && fast.next.next!=null){
    //            slow=slow.next;
    //            fast=fast.next.next;
    //        }
    //        ListNode temp = reverse(slow.next);
    //        slow.next = temp;
    //
    //        ListNode p1 = head;
    //        ListNode p2 = slow.next;
    //        while (p2!=null){
    //            if (p1.val!=p2.val) return false;
    //            p2=p2.next;
    //            p1=p1.next;
    //        }
    //        return true;
    //    }
    //}
}
