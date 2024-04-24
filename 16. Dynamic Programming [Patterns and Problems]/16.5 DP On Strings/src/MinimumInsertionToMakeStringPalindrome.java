public class MinimumInsertionToMakeStringPalindrome {
    //https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/submissions/1238412757/
    //https://www.naukri.com/code360/problems/minimum-insertions-to-make-a-string-palindrome_985293?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //bht easy hai read the code bas pichle questions ke easy concepts hi hai
    //class Solution {
    //    public int minInsertions(String s) {
    //        String str= "";
    //        for (int i = s.length()-1;i>=0;i--) str+=s.charAt(i);
    //        return s.length()-longestPalindromicSubsequence(s,str);
    //    }
    //    int longestPalindromicSubsequence(String s1,String s2){
    //        int n = s1.length();
    //        int [] prev = new int[n+1];
    //        for (int i = 1;i<=n;i++){
    //            int [] cur = new int [n+1];
    //            for (int j = 1;j<=n;j++){
    //                if (s1.charAt(i-1)==s2.charAt(j-1)) cur[j]=1+prev[j-1];
    //                else cur[j] = Math.max(prev[j],cur[j-1]);
    //            }
    //            prev = cur;
    //        }
    //        return prev[n];
    //    }
    //}
}
