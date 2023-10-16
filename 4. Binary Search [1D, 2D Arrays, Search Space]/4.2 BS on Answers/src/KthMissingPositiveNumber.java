public class KthMissingPositiveNumber {
    //https://www.codingninjas.com/studio/problems/kth-missing-element_893215?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
    //leetcode 1539
    //https://leetcode.com/problems/kth-missing-positive-number/


    //This is the basic approach we have to find the k th positive missing number so we start with k and see if someone less than k is there in this array if yes then increment k by 1 and do this for whole array and return k at the end
    //TC O(N)
    //class Solution {
    //    public int findKthPositive(int[] arr, int k) {
    //        for (int i=0;i<arr.length;i++){
    //            if (arr[i]<=k) k++;
    //            else break;
    //        }
    //        return k;
    //    }
    //}

    //optimal-> binary search TC O(logn) and SC O(1)
    //we calculate missing by seeing that which number is present at the index minus (idx+1) which should be present if no number is missed
    //if the number of missing numbers are less than k then eliminate that and see ahead

    //arr[high] + more we have to return more is basically k - missing(till arr[high])
    // and missing till index high will be arr[high] - (high+1)
    // so formula badhao arr[high] + k - missing
    // arr[high] + k - (  arr[high] - (high+1)    )
    // high + k + 1
    //and low = high + 1
    //so finally we are returning low + k


    //class Solution {
    //    public int findKthPositive(int[] arr, int k) {
    //        int st = 0;
    //        int end = arr.length-1;
    //        while (st<=end){
    //            int mid = st+(end-st)/2;
    //            int missing = arr[mid]-(mid+1);
    //            if(missing<k) st = mid+1;
    //            else end=mid-1;
    //        }
    //        return st+k;
    //    }
    //}

}
