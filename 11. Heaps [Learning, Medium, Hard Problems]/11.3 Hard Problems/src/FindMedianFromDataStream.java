public class FindMedianFromDataStream {
    //badiya question hai neetcode ki video dekhi thi, max and min dono heap rakhni padegi, read the code once to understand
    //https://leetcode.com/problems/find-median-from-data-stream/description/
    //https://www.codingninjas.com/studio/problems/median-in-a-stream_975268?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class MedianFinder {
    //    PriorityQueue<Integer> max;
    //    PriorityQueue<Integer> min;
    //    public MedianFinder() {
    //        max = new PriorityQueue<>(Comparator.reverseOrder());
    //        min = new PriorityQueue<>();
    //    }
    //
    //    public void addNum(int num) {
    //        max.add(num);
    //        if (max.size()!=0 && min.size()!=0 && max.peek()>min.peek()){
    //            min.add(max.remove());
    //        }
    //        int sizeA = max.size();
    //        int sizeB = min.size();
    //        int diff = Math.abs(sizeA-sizeB);
    //        if (diff>1){
    //            if (sizeA>sizeB) min.add(max.remove());
    //            else max.add(min.remove());
    //        }
    //    }
    //
    //    public double findMedian() {
    //        int sizeA = max.size();
    //        int sizeB = min.size();
    //        if (sizeA == sizeB) return (double)((double) (max.peek()+min.peek())/(double)2);
    //        else if (sizeA>sizeB) return (double) max.peek();
    //        else return (double)min.peek();
    //    }
    //}
    //
    ///**
    // * Your MedianFinder object will be instantiated and called as such:
    // * MedianFinder obj = new MedianFinder();
    // * obj.addNum(num);
    // * double param_2 = obj.findMedian();
    // */
}
