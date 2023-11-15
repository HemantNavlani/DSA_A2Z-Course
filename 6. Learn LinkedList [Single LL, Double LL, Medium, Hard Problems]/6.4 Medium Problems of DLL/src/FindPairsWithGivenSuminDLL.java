import java.util.HashSet;
//https://www.codingninjas.com/studio/problems/find-pairs-with-given-sum-in-doubly-linked-list_1164172?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&count=25&page=1&search=&sort_entity=order&sort_order=ASC&leftPanelTabValue=PROBLEM
//It is not correct on Coding Ninjas hence yaha kar diya hai solve
public class FindPairsWithGivenSuminDLL {
    static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
        }
    }
    public static boolean findPair(Node head, int k) {
        HashSet<Integer> st = new HashSet<>();
        Node temp = head;
        while (temp!=null){
            if (st.contains(k-temp.data)) return true;
                st.add(temp.data);
                temp=temp.next;
            }
        return false;
    }

    public static void main(String[] args) {
        Node a = new Node (1);
        Node b = new Node (2);
        Node c = new Node (3);
        Node d = new Node (4);
        Node e = new Node (9);

        a.next=b;
        a.prev=null;

        b.next=c;
        b.prev=a;

        c.next=d;
        c.prev=b;

        d.next=e;
        d.prev=c;

        e.next=null;
        e.prev=d;

        System.out.println(findPair(a,5));

    }
}
