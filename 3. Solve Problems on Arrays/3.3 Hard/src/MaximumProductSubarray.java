public class MaximumProductSubarray {
    //leetcode 493
    //https://leetcode.com/problems/maximum-product-subarray/description/
    //https://www.codingninjas.com/studio/problems/subarray-with-maximum-product_6890008?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    //brute force using simple two loops TC around O(N^2) and SC is O(1)
    //public class Solution {
    //    public static int subarrayWithMaxProduct(int []nums){
    //        int n = nums.length;
    //        long max = Integer.MIN_VALUE;
    //        for (int i=0;i<n;i++){
    //            long prod = 1;
    //            for (int j=i;j<n;j++){
    //                prod *= (long) nums[j];
    //                max = Math.max (max,prod);
    //            }
    //        }
    //        return (int) max;
    //    }
    //}

    //optimal approach is that we have some obsevations
//    1. if we have all positives then whole array is the answer and
    //2 if we have even negative then also whole array is answer
    // 3 if we have odd negatives then we should try to remove 1 negative and get the max product
    //4 if the array has zeros then we should be having the arrays divided in some parts

    //simple just keep prefixproduct and suffixproduct in one go and the max between them is the answer see the code its preety easy

    //TC O(N) and SC is O(1)
    //class Solution {
    //    public int maxProduct(int[] nums) {
    //        int n = nums.length;
    //        long max = Integer.MIN_VALUE;
    //        long prefix = 1;
    //        long suffix = 1;
    //        for (int i=0;i<n;i++){
    //            if (prefix == 0) prefix = 1 ;
    //            if (suffix == 0) suffix = 1 ;
    //
    //            prefix*=nums[i];
    //            suffix*=nums[n-i-1];
    //
    //            max = Math.max(max,Math.max(prefix,suffix));
    //        }
    //        return (int)max;

    //    }
    //}

}
