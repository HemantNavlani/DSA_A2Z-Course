public class RotateaLL {
    //leetcode 61

    //https://leetcode.com/problems/rotate-list/description/

    //https://www.codingninjas.com/studio/problems/rotate-linked-list_920454?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

//shi tareke se submit hogaya hai khudse kiya lekin har iteration me hame vo temp dhundna pad raha hai yaha going to the last second node
    //TC is O(N*K)
    //SC is O(1)
    //class Solution {
    //    public int length(ListNode head){
    //        ListNode temp = head;
    //        int cnt = 0;
    //        while (temp!=null){
    //            temp=temp.next;
    //            cnt++;
    //        }
    //        return cnt;
    //    }
    //    public ListNode rotateRight(ListNode head, int k) {
    //        if (length(head)<k && length(head)!=0) k=k%length(head);
    //        if (head==null || head.next == null) return head;
    //        for (int i = 0;i<k;i++){
    //        ListNode temp = head;
    //        while (temp.next.next!=null){
    //            temp=temp.next;
    //        }
    //        temp.next.next=head;
    //        head = temp.next;
    //        temp.next=null;
    //        }
    //        return head;
    //    }
    //}

//Simple hai ye TC O(N)
    //ye easy hai bus phle end node ko head pe kardiya fir required node pe jake usse null pe kardo
//    public class Solution {
//        public static Node rotate(Node head, int k) {
//            if (head==null || head.next==null || k==0) return head;
//            int len = 1;
//            Node temp = head;
//            while (temp.next!=null){
//                temp=temp.next;
//                len++;
//            }
//            temp.next=head;
//            k=k%len;
//            k = len-k;
//            temp = head;
//            for (int i =1;i<k;i++){
//                temp=temp.next;
//            }
//            head=temp.next;
//            temp.next=null;
//            return head;
//        }
//    }

    //
}
