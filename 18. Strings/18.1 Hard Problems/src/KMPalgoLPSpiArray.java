public class KMPalgoLPSpiArray {
    //https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
  //class Solution {
    //    int[] piTable(String str){
    //        int n = str.length();
    //        int []pi = new int[n];
    //        int i = 1;
    //        int len=0;
    //        while (i<n){
    //            if (str.charAt(i)==str.charAt(len)){
    //                len++;
    //                pi[i] = len;
    //                i++;
    //            }
    //            else {
    //                if (len!=0) len = pi[len-1];
    //                else {
    //                    pi[i]=0;
    //                    i++;
    //                }
    //            }
    //        }
    //        return pi;
    //    }
    //    public int strStr(String text, String pat) {
    //        int[] pi = piTable(pat);
    //        int ans = -1;
    //        int i = 0;
    //        int j = 0;
    //        int n = text.length();
    //        int m = pat.length();
    //        if (m>n) return -1;
    //        while (i<n){
    //            if(text.charAt(i)==pat.charAt(j)){
    //                i++;
    //                j++;
    //            }
    //            else{
    //                if (j!=0) j = pi[j-1];
    //                else i++;
    //            }
    //            if (j==m) return i-m;
    //        }
    //        return -1;
    //    }
    //}
}
