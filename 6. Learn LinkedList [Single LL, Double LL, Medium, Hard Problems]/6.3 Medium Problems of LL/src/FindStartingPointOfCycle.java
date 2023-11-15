public class FindStartingPointOfCycle {

    //thoda dekhna pada same hai copy se jo PW se padha tha usme se
    // phle toh detect karo and then when slow == fast the break
    // and fir ek temp pointer banao pointing to head and usko and slow ko badhate rho untill both are same hence return slow

    //public class Solution {
    //    public ListNode detectCycle(ListNode head) {
    //        if (head==null) return null;
    //        ListNode slow = head;
    //        ListNode fast = head;
    //        while (fast!=null && fast.next!=null){
    //            slow = slow.next;
    //            fast = fast.next.next;
    //            if (slow == fast) break;
    //        }
    //        if (fast==null || fast.next==null) return null;
    //        ListNode temp = head;
    //        while (temp!=slow){
    //            temp=temp.next;
    //            slow=slow.next;
    //        }
    //        return slow;
    //    }
    //}
}
