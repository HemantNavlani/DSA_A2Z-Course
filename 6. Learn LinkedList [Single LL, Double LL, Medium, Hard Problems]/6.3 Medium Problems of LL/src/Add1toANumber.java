public class Add1toANumber {
    //https://www.codingninjas.com/studio/problems/add-one-to-a-number-represented-as-linked-list_920557?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //coding ninjas pe submit nhi ho raha hai
    static class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

     static Node addNode(Node head) {
        //Basic approach is that first form the number from the list and then do plus 1 in it and then again form the linkedlist by it.
         //yaha phle mai number reverse kar raha tha par vo shi nhi hai as agar
         //jaise number 200 bana toh us case me reverse hokar 2 banega and fir linked list shi nhi banegi isliye reverse the linked list instead

         //ek approach ye bhi hai ki linkedlist reverse karo fir usme 1 ka addition is easy just kuch cases handle karne honge bas and fir usse again reverse kardo for the right answer fayda ye hai isme space bach jayegi as compared to my solution

            Node temp = head;
            int ans = 0;
            while (temp!=null){
                ans=ans*10+temp.data;
                temp=temp.next;
            }
            ans+=1;

             temp = new Node(-1);
            Node anshead = temp;
        while (ans!=0){
            Node t = new Node(ans%10);
            temp.next = t;
            temp = temp.next;
            ans/=10;
        }
        return reverse(anshead.next);
        }

     static Node reverse(Node head){
        Node prev = null;
        Node curr = null;
        Node agla = head;
        while (agla!=null){
            curr = agla;
            agla = agla.next;
            curr.next = prev;
            prev = curr;
        }
        return curr;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(9);
        Node b = new Node(9);
        head.next=a;
        a.next=b;
        b.next=null;
        Node ans = addNode(head);
        Node temp = ans;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
