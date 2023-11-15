public class AddTwoNumbers {
    //leetcode 2
    //https://leetcode.com/problems/add-two-numbers/

    //https://www.codingninjas.com/studio/problems/add-two-numbers_1170520?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //class Solution {
    //    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //        int carry = 0;
    //        ListNode t1 = l1;
    //        ListNode t2 = l2;
    //        ListNode ans = new ListNode();
    //        ListNode temp = ans;
    //
    //        while (t1!=null && t2!=null){
    //            int sum = t1.val + t2.val + carry;
    //            if (sum>9) {
    //                carry = 1;
    //                sum = sum%10;
    //            }
    //            else {
    //                carry=0;
    //            }
    //            ListNode newNode = new ListNode(sum);
    //            temp.next = newNode;
    //            temp = temp.next;
    //
    //            t1=t1.next;
    //            t2=t2.next;
    //        }
    //
    //        while (t1!=null){
    //            int sum = t1.val+carry;
    //            if (sum>9) {
    //                carry = 1;
    //                sum = sum%10;
    //            }
    //            else {
    //                carry=0;
    //            }
    //            ListNode newNode = new ListNode(sum);
    //            temp.next=newNode;
    //            temp=temp.next;
    //            t1=t1.next;
    //        }
    //         while (t2!=null){
    //            int sum = t2.val+carry;
    //            if (sum>9) {
    //                carry = 1;
    //                sum = sum%10;
    //            }
    //            else {
    //                carry=0;
    //            }
    //            ListNode newNode = new ListNode(sum);
    //            temp.next=newNode;
    //            temp=temp.next;
    //            t2=t2.next;
    //        }
    //        if (carry==1) {
    //            ListNode newNode = new ListNode(carry);
    //            temp.next=newNode;
    //            temp=temp.next;
    //        }
    //        return ans.next;
    //    }
    //}
}
