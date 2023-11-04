public class DeletingANodeInALinkedList {
    //leetcode 237
//    https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/1091369446/
    ///**
    // * Definition for singly-linked list.
    // * public class ListNode {
    // *     int val;
    // *     ListNode next;
    // *     ListNode(int x) { val = x; }
    // * }
    // */
    //class Solution {
    //    public void deleteNode(ListNode node) {
    //        node.val=  node.next.val;
    //        node.next = node.next.next;
    //    }
    //}
    //https://www.codingninjas.com/studio/problems/delete-node-of-linked-list_8160463?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION


    ///****************************************************************
    //
    // Following is the class structure of the Node class:
    //
    // class Node {
    //     public int data;
    //     public Node next;
    //
    //     Node()
    //     {
    //         this.data = 0;
    //         this.next = null;
    //     }
    //
    //     Node(int data)
    //     {
    //         this.data = data;
    //         this.next = null;
    //     }
    //
    //     Node(int data, Node next)
    //     {
    //         this.data = data;
    //         this.next = next;
    //     }
    // };
    //
    // *****************************************************************/
    //
    //public class Solution {
    //    public static Node deleteLast(Node list){
    //        Node temp = list;
    //        while (temp.next!=null && temp.next.next!=null){
    //            temp=temp.next;
    //        }
    //        temp.next=null;
    //        return list;
    //    }
    //}
}
