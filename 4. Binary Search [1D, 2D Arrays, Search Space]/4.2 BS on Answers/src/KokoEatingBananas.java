public class KokoEatingBananas {
    //leetcode 875
    //https://leetcode.com/problems/koko-eating-bananas/description/

    //https://www.codingninjas.com/studio/problems/minimum-rate-to-eat-bananas_7449064?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //yaha jo bhi khel karna hai vo k ke sath
    // k is the number of bananas per hour
    //brute force approach start with k =1 and check whether with this k you can finish in time or not if yes then increment the count of k and see for next

    //so haan toh hame binary search k pe hi lagani hai k kis range me lie karega us base pe

    //so k will always lie in the range of 1 and max element of the array and now when we will check for each k in the brute force approach then
    //the TC would O(max element of array * N), this will give a TLE

    //By applying binary search we will reduce the time complexity to O(N * log(max element in array))
   //class Solution {
    //    public int timeTaken(int[] piles, int k) {
    //        int time = 0;
    //        for (int i=0;i<piles.length;i++){
    //            time += Math.ceil((double)piles[i]/(double)k);
    //        }
    //        return time;
    //    }
    //
    //    public int minEatingSpeed(int[] piles, int h) {
    //        int n = piles.length;
    //        int max = Integer.MIN_VALUE;
    //        for (int i=0;i<n;i++){
    //            max = Math.max(max,piles[i]);
    //        }
    //        int st = 1;
    //        int end = max;
    //        while (st<=end){
    //            int mid = st+(end-st)/2;
    //            if (timeTaken(piles,mid)>h) st = mid+1;
    //            else end=mid-1;
    //        }
    //        return st;
    //    }
    //}
}