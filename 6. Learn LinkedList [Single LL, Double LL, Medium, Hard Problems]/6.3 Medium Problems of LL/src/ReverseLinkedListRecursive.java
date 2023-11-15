public class ReverseLinkedListRecursive {
    //leetcode 206

    //https://leetcode.com/problems/reverse-linked-list/

    //https://www.codingninjas.com/studio/problems/reverse-linked-list_920513?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //class Solution {
    //     ListNode reverse(ListNode temp, ListNode t1, ListNode t2){
    //        if(t1 == null) return temp;
    //        t1.next=temp;
    //        return reverse(t1,t2,(t2!=null) ? t2.next:null);
    //    }
    //    public ListNode reverseList(ListNode head) {
    //        ListNode temp = null;
    //        ListNode t1 = head;
    //        ListNode t2 = null;
    //        if (head!=null) t2 = head.next;
    //        return reverse(temp,t1,t2);
    //    }
    //}
}
