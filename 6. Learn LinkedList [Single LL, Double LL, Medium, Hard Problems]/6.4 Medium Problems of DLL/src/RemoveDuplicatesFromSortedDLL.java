public class RemoveDuplicatesFromSortedDLL {
    ///********************************************************
    ////https://www.codingninjas.com/studio/problems/remove-duplicates-from-a-sorted-doubly-linked-list_2420283?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
    //
    //Jab iska folder bano toh vha run karke dekh lena IDE par kyunki yaha toh ye chal raha nhi on coding ninja unke internal code me kuch issue hai isliye
    //
    //    Following is the class structure of the Node class:
    //    class Node
    //    {
    //        public:
    //            int data;
    //            Node next;
    //            Node(int data)
    //            {
    //                this.data = data;
    //                this.next = null;
    //            }
    //    };
    //********************************************************/
    //
    //public class Solution {
    //    public static Node uniqueSortedList(Node head) {
    //        Node temp = head;
    //        while (temp!=null){
    //            if (temp.data == temp.next.data){
    //                if (temp.next!=null)
    //                temp.next.prev = temp.prev;
    //                if (temp.prev!=null)
    //                temp.prev.next = temp.next;
    //                if (temp==head) head = head.next;
    //                temp=temp.next;
    //            }
    //            else {
    //                temp=temp.next;
    //            }
    //        }
    //        return head;
    //    }
    //}
}
