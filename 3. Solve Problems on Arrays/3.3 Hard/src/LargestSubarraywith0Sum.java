public class LargestSubarraywith0Sum {
//https://www.codingninjas.com/studio/problems/longest-subarray-with-zero-sum_6783450?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
    //Brute force approach using two loops -> O(N^2)

    //public class Solution {
    //    public static int getLongestZeroSumSubarrayLength(int []arr){
    //        int n = arr.length;
    //        int max = 0;
    //        for (int i=0;i<n;i++){
    //            int sum =0;
    //            for (int j=i;j<n;j++){
    //                sum += arr[j];
    //                if (sum==0){
    //                    max = Math.max(max, j-i+1);
    //                }
    //            }
    //        }
    //        return max;
    //    }
    //}

    //Optimal approach
    //TC -> O(N * 1) or O(N logn) (logn and 1 depends on the type of hashset we use)
//    and sc is O(n) of the hashset
    //We will use a Hash set
    //and store prefix sum in hashmap with the index if the prefix sum == 0 then len = i+1
    //and if we see that current prefix sum jo aaya hai abhii and yahi phle se Hash map me phle se hai toh beech ke jo
    //numbers hai unka sum is zero len nikalege by currIndex - index stored in hashmap
    //and iske baad hashmap me prefix sum ka index update nhi karenge as aage bhi aisa ho skta hai and we need maxlength
    //import java.util.HashMap;
    //
    //public class Solution {
    //    public static int getLongestZeroSumSubarrayLength(int []arr){
    //        int n = arr.length;
    //        int max = 0;
    //        int sum = 0;
    //        HashMap<Integer,Integer> mp = new HashMap<>();
    //        for (int i=0;i<n;i++){
    //            sum+=arr[i];
    //            if (sum==0) max = Math.max(max,i+1);
    //            if (mp.containsKey(sum)) max =  Math.max(max,i-mp.get(sum));
    //            else mp.put(sum,i);
    //        }
    //        return max;
    //    }
    //}
}
