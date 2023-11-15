public class MergeTwoLinkedList {
    //basic approach is two make a entirely new linked list while merging which means we are taking an extra space

    //leetcode 21
    //https://leetcode.com/problems/merge-two-sorted-lists/description/


    //class Solution {
    //    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    //        ListNode ans = new ListNode(-1);
    //        ListNode temp = ans;
    //        ListNode temp1 = list1;
    //        ListNode temp2 = list2;
    //        while (temp1!=null && temp2!=null){
    //            if (temp1.val<=temp2.val){
    //                ListNode newNode = new ListNode(temp1.val);
    //                temp.next=newNode;
    //                temp=temp.next;
    //                temp1=temp1.next;
    //            }
    //            else {
    //                ListNode newNode = new ListNode(temp2.val);
    //                temp.next=newNode;
    //                temp=temp.next;
    //                temp2=temp2.next;
    //            }
    //        }
    //        while (temp1!=null){
    //            ListNode newNode = new ListNode(temp1.val);
    //                temp.next=newNode;
    //                temp=temp.next;
    //                temp1=temp1.next;
    //        }
    //        while (temp2!=null){
    //               ListNode newNode = new ListNode(temp2.val);
    //                temp.next=newNode;
    //                temp=temp.next;
    //                temp2=temp2.next;
    //        }
    //        return ans.next;
    //
    //    }
    //}

    //Now better approach is that we are going to do it inplace without extra space

    //class Solution {
    //    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
    //}
}
