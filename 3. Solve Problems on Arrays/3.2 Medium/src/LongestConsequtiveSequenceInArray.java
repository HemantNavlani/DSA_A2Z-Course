public class LongestConsequtiveSequenceInArray {
//leetcode 128
//https://leetcode.com/problems/longest-consecutive-sequence/description/
//
//https://www.codingninjas.com/studio/problems/longest-successive-elements_6811740?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//
//Brute Force Approach -
//Ki element uthao aur poore me dekho usse just ek bada hai toh length badhate jao isme almost O(n^2) time lag jayega
//
//Better Approach -
//First sort the array and then find its logical enough
//Here O(n logn) is the time complexity and here given array is distorted
//public class Solution {
//    public static int longestSuccessiveElements(int []a) {
//        Arrays.sort(a);
//        int longest = 1;
//        int currCount = 0;
//        int lastSmaller = Integer.MIN_VALUE;
//        for (int i=0;i<a.length;i++){
//            if (a[i]-1 == lastSmaller){
//                currCount++;
//                lastSmaller=a[i];
//            }
//            else if (a[i]!=lastSmaller){
//                currCount=1;
//                lastSmaller = a[i];
//            }
//            longest = Math.max(longest, currCount);
//        }
//        return longest;
//    }
//}
//
//
//Optimal approach - O(N)
//
//Here we will use hashset and find the solution
//
//import java.util.HashSet;
//
//public class Solution {
//    public static int longestSuccessiveElements(int []a) {
//        if (a.length==0) return 0;
//        int longest = 1;
//        HashSet<Integer> st = new HashSet<>();
//        for (int i=0;i<a.length;i++){
//            st.add(a[i]);
//        }
//        int num =0;
//        for (int curr : st){
//
//            if (!st.contains(curr-1)){
//                int cnt = 1;
//                int x = curr;
//                while(st.contains(x+1)){
//                    x=x+1;
//                    cnt++;
//                }
//                longest=Math.max(longest, cnt);
//            }
//        }
//        return longest;
//    }
//}
}
