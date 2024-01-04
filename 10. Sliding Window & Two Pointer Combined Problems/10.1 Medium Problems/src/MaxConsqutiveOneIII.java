public class MaxConsqutiveOneIII {
    //https://www.codingninjas.com/studio/problems/maximum-consecutive-ones_892994?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/max-consecutive-ones-iii/submissions/1135487532/
//    import java.util.ArrayList;
//
//public class Solution {
//	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
//		int ans = 0;
//		int zeros = 0;
//		int l = 0;
//		int r = 0;
//		while (r<n){
//			if (arr.get(r)==0){
//				zeros++;
//			}
//			while (zeros>k){
//				if (arr.get(l)==0) zeros--;
//				l++;
//			}
//			ans = Math.max(ans,r-l+1);
//			r++;
//		}
//		return ans;
//	}
//}
}
