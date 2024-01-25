import java.util.Objects;

public class KMostFrequentElements {
    //https://leetcode.com/problems/top-k-frequent-elements/
    //https://www.codingninjas.com/studio/problems/k-most-frequent-elements_3167808?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //class Solution {
    //    class Pair{
    //        int el;
    //        int cnt;
    //        Pair (int el,int cnt){
    //            this.el = el;
    //            this.cnt = cnt;
    //        }
    //    }
    //    class PairComparator implements Comparator<Pair> {
    //           public int compare(Pair pair1, Pair pair2) {
    //               return -1*Integer.compare(pair1.cnt, pair2.cnt);
    //           }
    //       }
    //    public int[] topKFrequent(int[] nums, int k) {
    //        HashMap<Integer,Integer> mp = new HashMap<>();
    //        for (int i = 0;i<nums.length;i++){
    //            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
    //        }
    //        PriorityQueue<Pair> pq = new PriorityQueue<>(new PairComparator());
    //        for (int i:mp.keySet()){
    //            pq.add(new Pair(i,mp.get(i)));
    //        }
    //        int[]ans = new int[k];
    //        for (int i=0;i<k;i++){
    //            Pair p = pq.remove();
    //            ans[i] = p.el;
    //        }
    //        return ans;
    //    }
    //}
}
