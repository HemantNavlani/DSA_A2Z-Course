public class LongestPalindromicSubstring {
    //leetcode 5
    //https://leetcode.com/problems/longest-palindromic-substring/description/
    //    //This is brute force optimised after learning DP I think
    // class Solution {
    //    public boolean isPalindrome(String s) {
    //        int i = 0;
    //        int j = s.length()-1;
    //        while (i<j){
    //            if (s.charAt(i)==s.charAt(j)){
    //                i++;
    //                j--;
    //            }
    //            else return false;
    //        }
    //        return true;
    //    }
    //    public String longestPalindrome(String s) {
    //        int len=0;
    //        String ans = "";
    //        for (int i = 0;i<s.length();i++){
    //            String str = "";
    //            for (int j=i;j<s.length();j++){
    //                str += s.charAt(j);
    //                if (str.length()>len && isPalindrome(str)){
    //                    len = str.length();
    //                    ans = str;
    //                }
    //            }
    //        }
    //        return ans;
    //    }
    //}
}
