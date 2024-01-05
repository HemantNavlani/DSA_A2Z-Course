import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithAtmostKDisticnt {
//https://www.codingninjas.com/studio/problems/longest-substring-with-at-most-k-distinct-characters_2221410?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
//import java.util.*;
//    public class Solution {
//        public static int kDistinctChars(int k, String str) {
//            int l = 0;
//            int r = 0;
//            int n = str.length();
//            int ans = 0;
//            HashMap<Character,Integer> mp = new HashMap<>();
//            while (r<n){
//                mp.put(str.charAt(r), 1+mp.getOrDefault(str.charAt(r),0));
//                while (mp.size()>k){
//                    mp.put(str.charAt(l),mp.get(str.charAt(l))-1);
//                    if(mp.get(str.charAt(l))==0) mp.remove(str.charAt(l));
//                    l++;
//                }
//                ans=Math.max(ans,r-l+1);
//                r++;
//            }
//            return ans;
//        }
//    }

}