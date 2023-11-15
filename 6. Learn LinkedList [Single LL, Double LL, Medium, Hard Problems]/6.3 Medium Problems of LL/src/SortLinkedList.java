public class SortLinkedList {
    //Bahut simple and basic approach to sort phle linked list se list me bharo and then fir sort karo and vapas ek linked list bana do toh ye bht hi faltu approach hai
    //but submit hoga offcourse without TLE

    //leetcode 148
    //https://leetcode.com/problems/sort-list/

    //https://www.codingninjas.com/studio/problems/sort-linked-list_625193?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
    //    public ListNode sortList(ListNode head) {
    //        if (head == null)   return null;
    //        List<Integer> list = new ArrayList<>();
    //        ListNode temp = head;
    //        while (temp != null){
    //            list.add(temp.val);
    //            temp=temp.next;
    //        }
    //        Collections.sort(list);
    //        ListNode ans = new ListNode(list.get(0));
    //        temp = ans;
    //        for (int i=1;i<list.size();i++){
    //            ListNode newNode = new ListNode(list.get(i));
    //            temp.next = newNode;
    //            temp = temp.next;
    //        }
    //        return ans;
    //    }
    //}

    //Better approach using merge sort
    //// TC is O(N)
    //// SC is O(1)
    //class Solution {
    //     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    //        ListNode h = new ListNode(-1);
    //        ListNode t = h;
    //        ListNode t1 = list1;
    //        ListNode t2 = list2;
    //        while (t1!=null && t2!=null){
    //            if (t1.val<t2.val){
    //                t.next = t1;
    //                t = t1;
    //                t1=t1.next;
    //            }
    //            else{
    //                t.next = t2;
    //                t = t2;
    //                t2=t2.next;
    //            }
    //        }
    //        if (t1==null){
    //            t.next = t2;
    //        }
    //        if (t2==null){
    //            t.next = t1;
    //        }
    //        return h.next;
    //    }
    //    public ListNode sortList(ListNode head) {
    //        if (head==null || head.next==null) return head;
    //         ListNode prev = null;
    //        ListNode slow = head;
    //        ListNode fast = head;
    //        while (fast!=null && fast.next!=null){
    //            prev = slow;
    //            slow = slow.next;
    //            fast = fast.next.next;
    //        }
    //        prev.next = null;
    //        ListNode l1 = sortList(head);
    //        ListNode l2 = sortList(slow);
    //
    //        return mergeTwoLists(l1,l2);
    //    }
    //}
}
