public class ShortestPalindrome {
    //https://leetcode.com/problems/shortest-palindrome/submissions/1254361378/

    //easy hai but dikkat ye hai ki hamne yaha kmp vagarah use nhi kiya direct kiya longest palindrome nikala hai aur end me jo bach gaye unhe reverse karke front pe laga diya hai bas
    //class Solution {
    //    public String shortestPalindrome(String s) {
    //        int i = 0;
    //        int j = s.length()-1;
    //        while (j>=0){
    //            if (isPalindrome(i,j,s)) break;
    //            j--;
    //        }
    //        String ans = "";
    //        for (int k = s.length()-1;k>j;k--){
    //            ans+=s.charAt(k);
    //        }
    //        return ans+s;
    //    }
    //    boolean isPalindrome(int i,int j,String s){
    //        while (i<j){
    //            if (s.charAt(i)!=s.charAt(j)) return false;
    //            i++;
    //            j--;
    //        }
    //        return true;
    //    }
    //}

}
