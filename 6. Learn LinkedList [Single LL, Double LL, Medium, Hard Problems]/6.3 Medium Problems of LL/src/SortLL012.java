public class SortLL012 {

    //https://www.codingninjas.com/studio/problems/sort-linked-list-of-0s-1s-2s_1071937?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //This is the most basic approach that traverse through the list and 0 1 and 2 sbka count store karo fir nayi linked list banake usme daldo

    //public class Solution{
    //    public static Node sortList(Node head) {
    //        Node temp = head;
    //        int zero = 0;
    //        int one = 0;
    //        int two = 0;
    //        while (temp!=null){
    //            if (temp.data ==0) zero++;
    //            else if (temp.data==1) one++;
    //            else two++;
    //            temp=temp.next;
    //        }
    //        temp = new Node (-1);
    //        Node ans = temp;
    //        while(zero!=0){
    //            Node a = new Node(0);
    //            temp.next = a;
    //            temp=temp.next;
    //            zero--;
    //        }
    //        while(one!=0){
    //            Node a = new Node(1);
    //            temp.next = a;
    //            temp=temp.next;
    //            one--;
    //        }
    //        while(two!=0){
    //            Node a = new Node(2);
    //            temp.next = a;
    //            temp=temp.next;
    //            two--;
    //        }
    //        return ans.next;
    //    }
    //}
    //isme ek better thing ye hai ki kyun nayi list bananii hai usme hi zero and one dalte jao

    //public class Solution{
    //    public static Node sortList(Node head) {
    //        Node temp = head;
    //        int zero = 0;
    //        int one = 0;
    //        int two = 0;
    //        while (temp!=null){
    //            if (temp.data ==0) zero++;
    //            else if (temp.data==1) one++;
    //            else two++;
    //            temp=temp.next;
    //        }
    //        temp = head;
    //        while (temp!=null){
    //            if (zero != 0){
    //                temp.data = 0;
    //                zero--;
    //            }
    //            else if (one != 0){
    //                temp.data = 1;
    //                one--;
    //            }
    //            else if (two != 0){
    //                temp.data = 2;
    //                two--;
    //            }
    //                            temp=temp.next;
    //
    //        }
    //        return head;
    //    }
    //}

    //approach 2
    //ab man lo we are not allowed to change the data of the linked list so we are making three linked list for zero one and two and at the end we will combine them
    //public class Solution{
    //    public static Node sortList(Node head) {
    //        Node zero = new Node(-1);
    //        Node zeroTail = zero;
    //        Node one  = new Node(-1);
    //        Node oneTail = one;
    //        Node two  = new Node(-1);
    //        Node twoTail = two;
    //        Node temp = head;
    //        while (temp!=null){
    //            if (temp.data==0){
    //                Node newNode = new Node(0);
    //                zeroTail.next=newNode;
    //                zeroTail=zeroTail.next;
    //            }
    //            else if (temp.data==1){
    //                Node newNode = new Node(1);
    //                oneTail.next=newNode;
    //                oneTail=oneTail.next;
    //            }
    //            else if (temp.data==2){
    //                Node newNode = new Node(2);
    //                twoTail.next=newNode;
    //                twoTail=twoTail.next;
    //            }
    //            temp=temp.next;
    //        }
    //
    //        zeroTail.next = one.next;
    //        oneTail.next=two.next;
    //        return zero.next;
    //    }
    //}
}
