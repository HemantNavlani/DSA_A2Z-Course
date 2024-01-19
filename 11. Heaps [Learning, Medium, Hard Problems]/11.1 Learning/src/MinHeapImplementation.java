public class MinHeapImplementation {
    //import java.util.*;
    //public class Solution {
    //
    //    static class MinHeap {
    //        List<Integer> heap;
    //        // Constructor for the class.
    //        MinHeap(int size) {
    //            heap = new ArrayList<>();
    //        }
    //        private void heapify(int i){
    //            // System.out.println("kjd");
    //            int parent = i;
    //            while (parent<heap.size()){
    //                int child1 = 2*parent+1;
    //                int child2 = 2*parent+2;
    //                int small = parent;
    //                if (child1<heap.size() && heap.get(small)>heap.get(child1)) small = child1;
    //                if (child2<heap.size() && heap.get(small)>heap.get(child2)) small = child2;
    //
    //                if (small == parent) break;
    //                else {
    //                    int temp = heap.get(small);
    //                    heap.set(small,heap.get(parent));
    //                    heap.set(parent,temp);
    //                }
    //                parent=small;
    //            }
    //        }
    //
    //        // Implement the function to remove minimum element.
    //        int extractMinElement() {
    //
    //            if (heap.size()==0) return -1;
    //            int ans = heap.get(0);
    //            // int t = heap.get(0);
    //            // heap.set(0,heap.get(heap.size()-1));
    //            // heap.set(heap.size()-1,t);
    //            // heap.remove(heap.size()-1);
    //            // heapify(0);
    //            deleteElement(0);
    //            return ans;
    //        }
    //
    //        // Implement the function to delete an element.
    //        void deleteElement(int ind) {
    //            if (ind>=heap.size()) return;
    //            int t = heap.get(ind);
    //            heap.set(ind,heap.get(heap.size()-1));
    //            heap.set(heap.size()-1,t);
    //            heap.remove(heap.size()-1);
    //            heapify(ind);
    //        }
    //
    //        // Implement the function to insert 'val' in the heap.
    //        void insert(int val) {
    //            heap.add(val);
    //            int pos = heap.size()-1;
    //            while (pos>0){
    //                int parent = (pos-1)/2;
    //                if (parent>=0 && heap.get(parent)>heap.get(pos)){
    //                    int temp = heap.get(parent);
    //                    heap.set(parent,heap.get(pos));
    //                    heap.set(pos,temp);
    //                }
    //                else break;
    //                pos = parent;
    //            }
    //        }
    //    }
    //};
}
