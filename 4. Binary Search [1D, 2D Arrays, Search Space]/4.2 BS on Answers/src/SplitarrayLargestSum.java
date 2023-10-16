//public class SplitarrayLargestSum {
//    //leetcode 410
//    //https://leetcode.com/problems/split-array-largest-sum/
////https://www.codingninjas.com/studio/problems/largest-subarray-sum-minimized_7461751?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//    //same as previous some of the questions like allocate books or aggresive cows I solved it by myself completely
//
//Book allocation, split array largest sum , painters partition has exacct same codes
//    class Solution {
//        public int subarrays(int[] nums, int k,int mid) {
//            int subArr = 1;
//            int sum = 0;
//            for (int i=0;i<nums.length;i++){
//                sum+=nums[i];
//                if (sum>=mid) {
//                    subArr++;
//                    sum = nums[i];
//                }
//            }
//            return subArr;
//        }
//        public int splitArray(int[] nums, int k) {
//            int n = nums.length;
//            int max = Integer.MIN_VALUE;
//            int sum = 0;
//            for (int i=0;i<n;i++){
//                max = Math.max(max, nums[i]);
//                sum += nums[i];
//            }
//            int st = max+1;
//            int end = sum;
//            while (st<=end){
//                int mid = st+(end-st)/2;
//                if (subarrays(nums,k,mid)>k) st = mid+1;
//                else end = mid-1;
//            }
//            return end;
//        }
//    }
//}
