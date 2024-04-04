public class CountPartitionsWithGivenDifference {
//    https://www.naukri.com/code360/problems/partitions-with-given-difference_3751628?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //isme bhi pichle question ki tarah hi hua kyunki yaha tha -->

    //s1 -s2 = d
    //s1 = totalsum-s2
    //therfore-->  totalsum-s2-s2 = d
//    (totalsum-d)/2 = s2
    //matlab ab hame bas target  = (totalsum-d)/2 vale sare subsets count karne hai toh bas pichle question ka code uthao aur lagao
    //import java.util.* ;
    //import java.io.*;
    //public class Solution {
    //	public static int countPartitions(int n, int d, int[] arr) {
    //		int totalSum = 0;
    //		for (int i : arr) totalSum+=i;
    //		if (totalSum-d<0 || (totalSum-d)%2!=0) return 0;
    //		return solver(n,arr,(totalSum-d)/2) % ((int)(1e9+7));
    //	}
    //	static int solver(int n,int[] nums,int k){
    //		int[] dp = new int [k+1];
    //		if (nums[0]==0) dp[0] = 2;
    //		else dp[0]=1;
    //
    //		if (nums[0]!=0 && nums[0]<=k) dp[nums[0]] =1;
    //
    //		for (int i = 1;i<n;i++){
    //			int []cur = new int[k+1];
    //			cur[0] =1 ;
    //			for (int target = 0;target<=k;target++){
    //				int pick = 0;
    //				if (nums[i]<=target) pick = dp[target-nums[i]];
    //				int notPick = dp[target];
    //				cur[target] =( pick+notPick) % ((int)(1e9+7));
    //			}
    //			dp = cur;
    //		}
    //		return dp[k] % ((int)(1e9+7));
    //	}
    //}
}
