
public class ImplementingLinkedList {
     static class Node{
        int data;
        Node next;

        Node(){}
        Node(int data){
            this.data=data;
        }
    }
    static class Linkedlist{
         Node head = null;
         int size = 0;
         void insertAtBeg(int data){
                 Node temp = new Node(data);
                 temp.next=head;
                 head = temp;
                 size++;
         }
        void insertAtEnd(int data){
             if (head==null) {
                 insertAtBeg(data);
                 return;
             }
             Node newNode = new Node(data);
             Node temp = head;
            while (temp.next != null) {
                temp=temp.next;
            }
            temp.next=newNode;
            size++;
        }
        //13 -> 4 -> 5 -> 12->10
        void insertAt(int idx, int data){
             if (head==null) {
                 insertAtBeg(data);
                 return;
             }
             int i = 0;
             Node temp = head;
            System.out.println(head.data);
             Node newNode = new Node(data);
             while (i<=idx-1){
                 temp=temp.next;
                 i++;
             }
             if (temp!=null) {
                 newNode.next = temp.next;
                 temp.next = newNode;
             }
        }

        void display(){
             Node temp = head;
             while (temp!=null){
                 System.out.println(temp.data+" ");
                 temp=temp.next;
             }
        }
        void deleteBeg(){
             if (head==null) return;
             head=head.next;
        }
        void deleteEnd(){
             if (head==null) return;
             if (head.next==null){
                 head=null;
                 return;
             }
             Node temp = head;
             while (temp.next.next!=null){
                 temp=temp.next;
             }
             temp.next=null;

        }
        //        idx = 3
        //1->2->3->4->5->6->7
        void deleteIdx(int idx){
             if (head==null){
                 deleteBeg();
                 return;
             }
             Node temp = head;
             int i=0;
             while(i<idx-1){
                 temp=temp.next;
                 i++;
             }
             if (temp!=null && temp.next!=null)
             temp.next=temp.next.next;
        }
        int getAt(int idx){
             int i = 0;
             Node temp = head;
             while (i<idx){
                 temp=temp.next;
                 i++;
             }
             return temp.data;
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        //        System.out.println(ll.size());//
        // only use ll.size without parentheses now as we are keeping size as int in the linked list class
//        ll.insertAtHead(10);
        ll.insertAtEnd(4);//4
//        ll.display();
        ll.insertAtEnd(5);//4 -> 5
//        ll.display();
        ll.insertAtEnd(12);//4 -> 5 -> 12
//        ll.display();
        ll.insertAtBeg(13);//13 -> 4 -> 5 -> 12
//        ll.display();
        //ll.insertAt(2,10);//13 -> 4 -> 10 -> 5 -> 12
//        ll.display();
        ll.insertAt(4,10);//13 -> 4 -> 5 -> 12 ->10
//        ll.display();
//        System.out.println(ll.tail.data);//it will print wrong if we are inserting at index = size

        ll.insertAt(0,100);//100-> 13 -> 4 -> 5 -> 12 ->10
        //it will be wrong when idx = 0 so we have added if else to maintain these 2 cases
        ll.display();

//        System.out.println(ll.getAt(3));

//        System.out.println(ll.size);
        ll.deleteIdx(5);
        ll.deleteIdx(0);

        //resolving code when idx = 0
        //and when idx is for last element

        ll.display();

    }
}
