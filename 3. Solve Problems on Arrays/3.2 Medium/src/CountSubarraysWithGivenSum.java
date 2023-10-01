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
}
