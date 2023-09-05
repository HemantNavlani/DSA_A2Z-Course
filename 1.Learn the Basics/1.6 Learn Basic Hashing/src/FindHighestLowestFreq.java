public class FindHighestLowestFreq {
    //import java.util.TreeMap;
    //https://www.codingninjas.com/studio/problems/k-most-occurrent-numbers_625382?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
    //
    //public class Solution {
    //    public static int[] getFrequencies(int []v) {
    //        TreeMap<Integer,Integer> mp= new TreeMap<Integer,Integer>();
    //        for (int i=0;i<v.length;i++){
    //            if (mp.containsKey(v[i])) mp.replace(v[i], mp.get(v[i])+1);
    //            else mp.put(v[i], 1);
    //        }
    //        int min = Integer.MAX_VALUE;
    //        int max = Integer.MIN_VALUE;
    //
    //
    //        int [] ans = new int[2];
    //        for (int key : mp.keySet()) {
    //            if (mp.get(key)<min) {
    //                min = mp.get(key);
    //                ans[1] = key;
    //            }
    //            if (mp.get(key)>max) {
    //                max = mp.get(key);
    //                ans[0] = key;
    //            }
    //        }
    //
    //        return ans;
    //    }
    //}
}
