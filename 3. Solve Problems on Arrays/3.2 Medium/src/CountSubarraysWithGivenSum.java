import java.lang.reflect.Array;
import java.util.ArrayList;

public class CountSubarraysWithGivenSum {
    //leetcode 560
    //https://leetcode.com/problems/subarray-sum-equals-k/description/

    //https://www.codingninjas.com/studio/problems/subarray-sums-i_1467103?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
    //    public int subarraySum(int[] nums, int k) {
    //        HashMap<Integer,Integer> mp = new HashMap<>();
    //        mp.put(0,1);
    //        int sum = 0;
    //        int cnt = 0;
    //        for (int i=0;i<nums.length;i++){
    //            sum+=nums[i];
    //            if (mp.containsKey(sum-k)) {
    //                cnt += mp.get(sum-k);
    //            }
    //            if (!mp.containsKey(sum)){
    //                 mp.put(sum,1);
    //            }
    //            else {
    //                int x = mp.get(sum);
    //                mp.put(sum,x+1);
    //            }
    //        }
    //        return cnt;
    //    }
    //}
        public static ArrayList<ArrayList<Integer>> generate(int numRows) {
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            for (int i=1;i<=numRows;i++){
                ArrayList<Integer> l = new ArrayList<>();
                long a = 1;
//                l.add((int)a);
                for (int j=1;j<i+1;j++){
                    l.add((int)a);
                    a*=i-j;
                    a/=j;
                }
                ans.add(l);
            }
            return ans;
        }
    public static void main(String[] args) {
        System.out.println(generate(5));

    }
}
