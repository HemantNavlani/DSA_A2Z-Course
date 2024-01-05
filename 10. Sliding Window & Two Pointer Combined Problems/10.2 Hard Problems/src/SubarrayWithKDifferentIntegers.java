public class SubarrayWithKDifferentIntegers {
    //https://leetcode.com/problems/subarrays-with-k-different-integers/description/
    //https://www.codingninjas.com/studio/problems/subarrays-with-at-most-%E2%80%98k%E2%80%99-distinct-values_1473804?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
    //    public int subarraysWithKDistinct(int[] nums, int k) {
    //        return atmostK(nums,k) - atmostK(nums,k-1);
    //    }
    //    int atmostK(int[] nums, int k){
    //        int count = 0;
    //        int l = 0;
    //        int r = 0;
    //        int n = nums.length;
    //        HashMap<Integer,Integer> mp = new HashMap<>();
    //        while (r<n){
    //            mp.put(nums[r], 1 + mp.getOrDefault(nums[r],0));
    //            while(mp.size()>k){
    //                mp.put(nums[l],mp.get(nums[l])-1);
    //                if (mp.get(nums[l])==0) mp.remove(nums[l]);
    //                l++;
    //            }
    //            count += r-l+1;
    //            r++;
    //        }
    //        return count;
    //    }
    //}
}
