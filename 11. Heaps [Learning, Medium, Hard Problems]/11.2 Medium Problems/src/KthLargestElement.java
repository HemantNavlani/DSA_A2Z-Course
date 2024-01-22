public class KthLargestElement {
    //https://leetcode.com/problems/kth-largest-element-in-an-array/

    //https://www.codingninjas.com/studio/problems/k-largest-elements_796005?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //isko min heap banaya hai k size ka usme loop karte karte end me uske andar k laregst elements store ho jayenge
    //class Solution {
    //    public int findKthLargest(int[] nums, int k) {
    //        PriorityQueue<Integer> pq = new PriorityQueue<>();
    //        for (int i =0;i<nums.length;i++){
    //            if (pq.size()==k){
    //                if(pq.peek()<nums[i]){
    //                    pq.remove();
    //                    pq.add(nums[i]);
    //                }
    //            }
    //            else{
    //                pq.add(nums[i]);
    //            }
    //        }
    //        return pq.peek();
    //    }
    //}
}
