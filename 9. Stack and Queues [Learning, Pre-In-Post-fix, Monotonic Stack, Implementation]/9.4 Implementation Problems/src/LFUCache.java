public class LFUCache {
    //https://leetcode.com/problems/lfu-cache/

    //https://www.codingninjas.com/studio/problems/lfu-cache_8381892?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    //hai todha tagda question ache se smjho do tin bar aur hai iske liye LRU cache important hai

    //class LFUCache {
    //    final int capacity;
    //    int curSize;
    //    int minFreq;
    //    HashMap<Integer,DLLNode> cache;
    //    HashMap<Integer,DoubleLinkedList> freqMap;
    //
    //    public LFUCache(int capacity) {
    //        this.capacity = capacity;
    //        curSize = 0;
    //        minFreq = 0;
    //        cache = new HashMap<>();
    //        freqMap = new HashMap<>();
    //    }
    //
    //    public int get(int key) {
    //        DLLNode curNode = cache.get(key);
    //        if (curNode == null) return -1;
    //        updateNode(curNode);
    //        return curNode.val;
    //    }
    //
    //    public void put(int key, int value) {
    //        if (capacity == 0) return;
    //
    //        if (cache.containsKey(key)){
    //            DLLNode curNode = cache.get(key);
    //            curNode.val = value;
    //            updateNode(curNode);
    //        }
    //        else{
    //            curSize++;
    //            if (curSize>capacity){
    //                DoubleLinkedList minFreqList = freqMap.get(minFreq);
    //                cache.remove(minFreqList.tail.prev.key);
    //                minFreqList.removeNode(minFreqList.tail.prev);
    //                curSize--;
    //            }
    //
    //            minFreq = 1;
    //            DLLNode newNode = new DLLNode(key,value);
    //
    //            DoubleLinkedList curList = freqMap.getOrDefault(1,new DoubleLinkedList());
    //            curList.addNode(newNode);
    //            freqMap.put(1,curList);
    //            cache.put(key,newNode);
    //        }
    //    }
    //
    //    public void updateNode (DLLNode curNode){
    //        int curFreq = curNode.frequency;
    //        DoubleLinkedList curList = freqMap.get(curFreq);
    //        curList.removeNode(curNode);
    //
    //        if (curFreq == minFreq && curList.listSize==0) minFreq++;
    //
    //        curNode.frequency++;
    //
    //        DoubleLinkedList newList = freqMap.getOrDefault(curNode.frequency,new DoubleLinkedList());
    //        newList.addNode(curNode);
    //        freqMap.put(curNode.frequency,newList);
    //    }
    //}
    //class DLLNode{
    //    int key;
    //    int val;
    //    int frequency;
    //    DLLNode prev;
    //    DLLNode next;
    //    DLLNode(int key,int val){
    //        this.key = key;
    //        this.val = val;
    //        frequency = 1;
    //    }
    //}
    //
    //class DoubleLinkedList{
    //    int listSize;
    //    DLLNode head;
    //    DLLNode tail;
    //    DoubleLinkedList(){
    //        listSize =0;
    //        head = new DLLNode(0,0);
    //        tail = new DLLNode(0,0);
    //        head.next = tail;
    //        tail.prev = head;
    //    }
    //    public void addNode(DLLNode curNode){
    //        DLLNode nextNode = head.next;
    //        curNode.next = nextNode;
    //        curNode.prev = head;
    //        head.next = curNode;
    //        nextNode.prev = curNode;
    //        listSize++;
    //    }
    //    public void removeNode(DLLNode curNode){
    //        DLLNode prevNode = curNode.prev;
    //        DLLNode nextNode = curNode.next;
    //        prevNode.next = nextNode;
    //        nextNode.prev = prevNode;
    //        listSize--;
    //    }
    //}
    ///**
    // * Your LFUCache object will be instantiated and called as such:
    // * LFUCache obj = new LFUCache(capacity);
    // * int param_1 = obj.get(key);
    // * obj.put(key,value);
    // */
}
