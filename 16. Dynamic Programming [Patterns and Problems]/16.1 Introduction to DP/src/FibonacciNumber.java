import java.util.Scanner;

public class FibonacciNumber {

    //Recursion
    //import java.util.Scanner;
    //public class Solution {
    //	static int rec (int n){
    //		if (n<=1) return n;
    //		return rec(n-1) + rec(n-2);
    //	}
    //	public static void main(String[] args) {
    //		Scanner in = new Scanner(System.in);
    //		int n = in.nextInt();
    //		int ans = rec(n);
    //		System.out.print(ans);
    //	}
    //
    //}

    // DP --> Memoization
    //import java.util.Scanner;
    //public class Solution {
    //	static int dp (int n,int[] dp){
    //		if (n<=1) return n;
    //		if (dp[n]!=-1) return dp[n];
    //		return dp[n] = dp(n-1,dp) + dp(n-2,dp);
    //	}
    //	public static void main(String[] args) {
    //		Scanner in = new Scanner(System.in);
    //		int n = in.nextInt();
    //		int[] dp = new int[n+1];
    //		for (int i = 0;i<=n;i++) dp[i] = -1;
    //		int ans = dp(n,dp);
    //		System.out.print(ans);
    //	}
    //
    //}

    //Tabulation
    //import java.util.Scanner;
    //public class Solution {
    //	public static void main(String[] args) {
    //		Scanner in = new Scanner(System.in);
    //		int n = in.nextInt();
    //		int[] dp = new int[n+1];
    //		dp[0] = 0;
    //		dp[1] = 1;
    //		for (int i = 2;i<=n;i++){
    //			dp[i] = dp[i-1]+dp[i-2];
    //		}
    //		int ans = dp[n];
    //		System.out.print(ans);
    //	}
    //
    //}


    //Tabulation with space optimised
    //import java.util.Scanner;
    //public class Solution {
    //	public static void main(String[] args) {
    //		Scanner in = new Scanner(System.in);
    //		int n = in.nextInt();
    //		int prev2 = 0;
    //		int prev = 1;
    //		for (int i = 2;i<=n;i++){
    //			int curr = prev2 + prev;
    //			prev2 = prev;
    //			prev = curr;
    //		}
    //		System.out.print(prev);
    //	}
    //
    //}
}
