import java.util.LinkedList;

public class ReverseLLinGroupOfGivenSizeK {
    //leetcode 25
    //https://leetcode.com/problems/reverse-nodes-in-k-group/description/

    //https://www.codingninjas.com/studio/problems/reverse-list-in-k-groups_983644?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf



    //Ye mera approach hai ye accept hogaya but video me alag approach hai
    //class Solution {
    //    public ListNode reverse(ListNode head){
    //        ListNode prev = null;
    //        ListNode curr = null;
    //        ListNode agla = head;
    //        while (agla!=null){
    //            curr = agla;
    //            agla = agla.next;
    //            curr.next = prev;
    //            prev=curr;
    //        }
    //        return curr;
    //    }
    //    public ListNode reverseKGroup(ListNode head, int k) {
    //        ListNode ans = new ListNode(-1);
    //        ListNode tans = ans;
    //        ListNode t = head;
    //        while (t!=null){
    //        ListNode temp = t;
    //        ListNode t1 = temp;
    //        int i = 0;
    //        while (i<k-1){
    //            if (t1!=null) t1=t1.next;
    //            i++;
    //        }
    //        if (t1==null){
    //            tans.next=temp;
    //            t=null;
    //        }
    //        else{
    //        t=t1.next;
    //        t1.next = null;
    //        tans.next = reverse(temp);
    //        }
// //            while (tans.next!=null) tans=tans.next;



    //yaha upar vali line ki jagah ye kardo ekdum badya solution vo bhi maine khudse kiya bina dekhe video
//    tans=temp;






    //        }
    //        return ans.next;
    //    }
    //}
    //jyada alag nhi hai same hi time vagarah hai toh dekhlo which to use phla vala maine khud hi kiya tha
    ///**
    // * Definition for singly-linked list.
    // * public class ListNode {
    // *     int val;
    // *     ListNode next;
    // *     ListNode() {}
    // *     ListNode(int val) { this.val = val; }
    // *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    // * }
    // */
    //class Solution {
    //    public ListNode reverseKGroup(ListNode head, int k) {
    //        if (head==null || k==1) return head;
    //        ListNode dummy = new ListNode(0);
    //        dummy.next = head;
    //
    //        ListNode cur = dummy;
    //        ListNode nex = dummy;
    //        ListNode pre = dummy;
    //        int count = 0;
    //        while (cur.next!=null){
    //            cur=cur.next;
    //            count++;
    //        }
    //
    //        while (count>=k){
    //            cur = pre.next;
    //            nex=cur.next;
    //            for (int i =0;i<k-1;i++){
    //                cur.next = nex.next;
    //                nex.next = pre.next;
    //                pre.next = nex;
    //                nex = cur.next;
    //            }
    //            pre=cur;
    //            count-=k;
    //        }
    //        return dummy.next;
    //    }
    //}
}
