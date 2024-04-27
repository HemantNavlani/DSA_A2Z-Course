import java.util.Arrays;
import java.util.Comparator;

public class LongestStringChain {

    //slight change in LIS bas compare function likha hai and since we need a sunset and not a subsequence we can sort the array according to the length
    //class Solution {
    //    public int longestStrChain(String[] words) {
    //        Arrays.sort(words, Comparator.comparingInt(String::length));
    //        int n = words.length;
    //        int[] dp = new int [n];
    //        for (int i = 0;i<n;i++) dp[i] = 1;
    //        int max = 1;
    //        for (int i =0;i<n;i++){
    //            for (int j= 0;j<i;j++){
    //                if (compare(words[i],words[j]) && 1+dp[j]>dp[i]) dp[i] = 1+dp[j];
    //            }
    //            max = Math.max(max,dp[i]);
    //        }
    //        return max;
    //    }
    //    boolean compare (String s1,String s2){
    //        if (s1.length()!=s2.length()+1) return false;
    //        int i = 0;
    //        int j = 0;
    //        while (i<s1.length()){
    //            if (j<s2.length() && s1.charAt(i)==s2.charAt(j)){
    //                i++;
    //                j++;
    //            }
    //            else i++;
    //        }
    //        if (i==s1.length() && j == s2.length()) return true;
    //        else return false;
    //    }
    //}
}
