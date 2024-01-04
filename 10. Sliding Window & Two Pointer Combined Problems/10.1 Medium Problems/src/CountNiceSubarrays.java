public class CountNiceSubarrays {
    //https://www.codingninjas.com/studio/problems/count-distinct-subarrays-with-at-most-k-odd-elements_1069335?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

//    Exact same pattern hai jaisa pichla hai atmostK - atmostK-1

    //https://leetcode.com/problems/count-number-of-nice-subarrays/
    //class Solution {
    //    public int numberOfSubarrays(int[] nums, int k) {
    //        return atmostK(nums,k) - atmostK(nums,k-1);
    //    }
    //    int atmostK(int[] nums, int k){
    //        int n = nums.length;
    //        int l = 0;
    //        int r = 0;
    //        int count = 0;
    //        int odd = 0;
    //        while (r<n){
    //            if ((nums[r]&1) == 1) odd ++;
    //            while (odd>k){
    //                if ((nums[l]&1) == 1) odd--;
    //                l++;
    //            }
    //            count += r-l+1;
    //            r++;
    //        }
    //        return count;
    //    }
    //}
}
