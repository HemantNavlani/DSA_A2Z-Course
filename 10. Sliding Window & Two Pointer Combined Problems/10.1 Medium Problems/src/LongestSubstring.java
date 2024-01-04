import java.util.HashMap;

public class LongestSubstring {
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
//    https://www.codingninjas.com/studio/problems/longest-substring-without-repeating-characters_630418?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//good approach

    //class Solution {
    //    public int lengthOfLongestSubstring(String s) {
    //        int n =s.length();
    //        int l = 0;
    //        int r = 0;
    //        int len = 0;
    //        HashSet<Character> st =new HashSet<>();
    //        while (r<n){
    //            if (!st.contains(s.charAt(r))){
    //                len = Math.max(len,r-l+1);
    //                st.add(s.charAt(r));
    //                r++;
    //            }
    //            else {
    //                while (s.charAt(l)!=s.charAt(r)){
    //                    st.remove(s.charAt(l));
    //                    l++;
    //                }
    //                st.remove(s.charAt(l));
    //                l++;
    //            }
    //        }
    //        return len;
    //    }
    //}


    //best approach
    //class Solution {
    //    public int lengthOfLongestSubstring(String s) {
    //        int n =s.length();
    //        int l = 0;
    //        int r = 0;
    //        int len = 0;
    //        HashMap<Character,Integer> st =new HashMap<>();
    //        while (r<n){
    //            if (st.containsKey(s.charAt(r))){
    //                l = Math.max(st.get(s.charAt(r))+1,l);
    //            }
    //            st.put(s.charAt(r),r);
    //            len = Math.max(len,r-l+1);
    //            r++;
    //        }
    //        return len;
    //    }
    //}
}