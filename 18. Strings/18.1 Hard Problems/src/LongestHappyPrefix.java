public class LongestHappyPrefix {

    //yaha pe hamne phle pi Table banai uski madaad se hua hai
    //https://leetcode.com/problems/longest-happy-prefix/
    //https://www.youtube.com/watch?v=JEpzIoudXVo&ab_channel=RamandeepSingh
//    is video se dekha tha
    //class Solution {
    //    int[] piTable (String s){
    //        int n = s.length();
    //        int [] pi = new int[n];
    //        int i =1;
    //        int len=0;
    //        while (i<n){
    //            if (s.charAt(i)==s.charAt(len)){
    //                len++;
    //                pi[i]=len;
    //                i++;
    //            }
    //            else{
    //                if (len!=0) len = pi[len-1];
    //                else {
    //                    pi[i] = 0;
    //                    i++;
    //                }
    //            }
    //        }
    //        return pi;
    //    }
    //    public String longestPrefix(String s) {
    //        int[] pi = piTable(s);
    //        int maxLen = pi[pi.length-1];
    //        return s.substring(0,maxLen);
    //    }
    //}
}
