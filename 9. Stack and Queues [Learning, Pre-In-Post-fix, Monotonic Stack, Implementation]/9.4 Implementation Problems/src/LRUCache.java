import java.util.HashMap;

public class LRUCache {

    //https://www.codingninjas.com/studio/problems/lru-cache-implementation_670276?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //https://leetcode.com/problems/lru-cache/

    //easy hi hai ache se socho bas aur dhyan rakho ki ye ek Least Recently used cache hai uski functionality add karo sari
   //class LRUCache {
    //    HashMap<Integer,Node> mp;
    //    int size;
    //    Node head = new Node(0,0);
    //    Node tail = new Node(0,0);
    //
    //    public LRUCache(int capacity) {
    //        size = capacity;
    //        mp = new HashMap<>();
    //        head.next = tail;
    //        tail.prev = head;
    //    }
    //    private void remove (Node n){
    //        mp.remove(n.key);
    //        n.prev.next = n.next;
    //        n.next.prev = n.prev;
    //    }
    //
    //    private void insert(Node n){
    //        mp.put(n.key,n);
    //
    //        n.next = head.next;
    //        n.prev = head;
    //        head.next.prev = n;
    //        head.next = n;
    //    }
    //    public int get(int key) {
    //        if (mp.containsKey(key)){
    //            Node n = mp.get(key);
    //            remove(n);
    //            insert(n);
    //            return  n.value;
    //        }
    //        else return -1;
    //    }
    //
    //    public void put(int key, int value) {
    //        if (mp.containsKey(key)){
    //            Node n = mp.get(key);
    //            remove(n);
    //        }
    //        if (mp.size()==size){
    //            remove(tail.prev);
    //        }
    //        Node newNode = new Node (key,value);
    //        insert(newNode);
    //    }
    //}
    //class Node {
    //    int key;
    //    int value;
    //    Node next;
    //    Node prev;
    //    Node(int key,int value){
    //        this.key = key;
    //        this.value = value;
    //    }
    //}
    ///**
    // * Your LRUCache object will be instantiated and called as such:
    // * LRUCache obj = new LRUCache(capacity);
    // * int param_1 = obj.get(key);
    // * obj.put(key,value);
    // */
}
