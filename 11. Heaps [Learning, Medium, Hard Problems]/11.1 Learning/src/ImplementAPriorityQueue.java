public class ImplementAPriorityQueue {
//    /https://www.codingninjas.com/studio/problems/implement-a-priority-queue-_1743878?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
    //import java.util.List;
    //public class Solution {
    //    public static int pop(List<Integer> heap) {
    //        if (heap.size()==0) return -1;
    //
    //        int temp = heap.get(0);
    //        heap.set(0,heap.get(heap.size()-1));
    //        heap.set(heap.size()-1,temp);
    //        int ans = heap.remove(heap.size()-1);
    //        int pos = 0;
    //        while (pos<heap.size()){
    //            int child1 = 2*pos+1;
    //            int child2 = 2*pos+2;
    //            int big = pos;
    //            if (child1<heap.size() && heap.get(child1)>heap.get(big)) big = child1;
    //            if (child2<heap.size() && heap.get(child2)>heap.get(big)) big = child2;
    //            if (big == pos) return ans;
    //            int t = heap.get(pos);
    //            heap.set(pos,heap.get(big));
    //            heap.set(big,t);
    //            pos = big;
    //        }
    //        return ans;
    //    }
    //
    //    // Code Snippet of the push function:
    //    // public static void push(List<Integer> heap, int x) {
    //    //         heap.add(x);
    //
    //    //         // Position of the current inserted element.
    //    //         int pos = heap.size() - 1;
    //
    //    //         // Shifting the element up until it reaches the topmost node if it is larger than its parent.
    //    //         while (pos > 0) {
    //    //             int parent = (pos - 1) / 2;
    //    //             if (heap.get(pos) > heap.get(parent)) {
    //    //                 // Swapping the elements.
    //    //                 int temp = heap.get(parent);
    //    //                 heap.set(parent, heap.get(pos));
    //    //                 heap.set(pos, temp);
    //    //                 pos = parent;
    //    //             } else {
    //    //                 // As parent is larger, the element is now in its correct position.
    //    //                 break;
    //    //             }
    //    //         }
    //    //     }
    //}
}
