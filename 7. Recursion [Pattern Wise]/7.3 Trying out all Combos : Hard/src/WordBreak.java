import java.util.ArrayList;

public class WordBreak {
    //https://www.codingninjas.com/studio/problems/word-break-1_758963?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

//    https://leetcode.com/problems/word-break/
    //hai toh question purane hi pattern pe based par pata nahi kyun isme dp lagi hai jo maine ab tak nhi padi hai isliye dp vala baad me smjh aa jaayega
    //class Solution {
    //    public boolean wordBreak(String s, List<String> wordDict) {
    //        int[] dp = new int [301];
    //        for (int i = 0;i<dp.length;i++){
    //            dp[i]=-1;
    //        }
    //        return helper(0,s,wordDict,dp);
    //    }
    //    public boolean helper (int idx,String s, List<String> wordDict,int[]dp){
    //        if (dp[idx]!=-1) return dp[idx]==1 ? true : false;
    //       if (idx >= s.length() || wordDict.contains(s.substring(idx))) return true;
    //        for (int i = idx;i<s.length();i++){
    //            if (wordDict.contains(s.substring(idx,i+1))){
    //               if (helper (i+1,s,wordDict,dp)){
    //                   dp[i]=1;
    //                   return true;
    //               }
    //            }
    //        }
    //        dp[idx]=0;
    //        return false;
    //    }
    //}


    //import java.util.*;
    //public class Solution {
    //    public static List< String > getAllValidSentences(String s, String []dict) {
    //        List<String> ans = new ArrayList<>();
    //        HashSet<String> st = new HashSet<>();
    //        for (int i =0;i<dict.length;i++){
    //            st.add(dict[i]);
    //        }
    //        helper (0,"",ans,s,st);
    //        return ans;
    //    }
    //    public static void helper (int idx,String keeper, List<String> ans,String s, HashSet<String> wordDict){
    //
    //     if (idx >= s.length()){
    //        ans.add(keeper);
    //           return;
    //       }
    //        for (int i = idx;i<s.length();i++){
    //            if (wordDict.contains(s.substring(idx,i+1))){
    //                String str = keeper;
    //                if (keeper.length()==0) keeper = s.substring(idx,i+1);
    //                else keeper=keeper+" "+s.substring(idx,i+1);
    //                helper (i+1,keeper,ans,s,wordDict);
    //                keeper = str;
    //            }
    //        }
    //    }
    //}
}
