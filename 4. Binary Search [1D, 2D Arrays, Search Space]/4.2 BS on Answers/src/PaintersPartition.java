public class PaintersPartition {
    //https://www.codingninjas.com/studio/problems/painter-s-partition-problem_1089557?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1

    //Book allocation, split array largest sum , painters partition has exacct same codes
    //import java.util.ArrayList;
    //
    //public class Solution {
    //
    //
    //    public static int subarrays(ArrayList<Integer> nums, int k,int mid) {
    //        int subArr = 1;
    //        int sum = 0;
    //        for (int i=0;i<nums.size();i++){
    //            sum+=nums.get(i);
    //            if (sum>=mid) {
    //                subArr++;
    //                sum = nums.get(i);
    //            }
    //        }
    //        return subArr;
    //    }
    //    public static int findLargestMinDistance(ArrayList<Integer> nums, int k){
    //        int n = nums.size();
    //        int max = Integer.MIN_VALUE;
    //        int sum = 0;
    //        for (int i=0;i<n;i++){
    //            max = Math.max(max, nums.get(i));
    //            sum += nums.get(i);
    //        }
    //        int st = max+1;
    //        int end = sum;
    //        while (st<=end){
    //            int mid = st+(end-st)/2;
    //            if (subarrays(nums,k,mid)>k) st = mid+1;
    //            else end = mid-1;
    //        }
    //        return end;
    //    }
    //}
    //

}
