public class IntersectionofTwoLinkedList {
    //leetcode 160
    //https://leetcode.com/problems/intersection-of-two-linked-lists/description/

    //https://www.codingninjas.com/studio/problems/-intersection-of-two-linked-lists_630457?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //public class Solution {
    //    public int size (ListNode head){
    //        ListNode temp = head;
    //        int count = 0;
    //        while (temp!=null){
    //            temp=temp.next;
    //            count++;
    //        }
    //        return count;
    //    }
    //
    //    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //        int sizeA = size(headA);
    //        int sizeB = size(headB);
    //        int diff = Math.abs(sizeA-sizeB);
    //
    //        ListNode tempA = headA;
    //        ListNode tempB = headB;
    //
    //        for (int i = 0;i<diff;i++){
    //            if (sizeA>sizeB) tempA=tempA.next;
    //            else tempB=tempB.next;
    //        }
    //
    //        while (tempA!=null || tempB!=null){
    //            if (tempA==tempB){
    //                return tempA;
    //            }
    //            tempA=tempA.next;
    //            tempB=tempB.next;
    //        }
    //        return null;
    //    }
    //}
}
