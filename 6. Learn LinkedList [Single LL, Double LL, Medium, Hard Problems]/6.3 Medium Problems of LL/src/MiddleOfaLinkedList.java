public class MiddleOfaLinkedList {
    //leetcode 876
    //https://leetcode.com/problems/middle-of-the-linked-list/

    //https://www.codingninjas.com/studio/problems/middle-of-linked-list_973250?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION


    //Here we have done two traversal 1st for count and then we go to the middle after iterating
    //class Solution {
    //    public int size (ListNode head){
    //        int count = 0;
    //        ListNode temp = head;
    //        while (temp != null){
    //            count ++;
    //            temp = temp.next;
    //        }
    //        return count;
    //    }
    //    public ListNode middleNode(ListNode head) {
    //        int len = size(head);
    //        int mid = len/2;
    //        int i = 0;
    //        ListNode temp = head;
    //        while (i<mid && temp!=null){
    //            temp = temp.next;
    //            i++;
    //        }
    //        return temp;
    //    }
    //}

    //The better approach is the Tortoise Hare method

    //Isme kuch nhi easy hai we just take two temp nodes and move temp1 by one iteration and temp2 by two iteration and of the temp2 reaches the end we return the temp1 as it is the middle now

    //class Solution {
    //    public ListNode middleNode(ListNode head) {
    //        ListNode temp1 = head;
    //        ListNode temp2 = head;
    //        while (temp2 != null && temp2.next!=null){
    //            temp1 = temp1.next;
    //            temp2 = temp2.next.next;
    //        }
    //        return temp1;
    //    }
    //}
}
