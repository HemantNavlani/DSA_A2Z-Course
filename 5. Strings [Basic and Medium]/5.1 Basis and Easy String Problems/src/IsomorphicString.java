public class IsomorphicString {
    //leetcode 205

    //https://leetcode.com/problems/isomorphic-strings/
    //class Solution {
    //    public boolean isIsomorphic(String s, String t) {
    //        HashMap<Character,Character> mp = new HashMap();
    //        HashSet<Character> st = new HashSet();
    //        for (int i = 0;i<s.length();i++){
    //            if (!mp.containsKey(s.charAt(i))){
    //                mp.put(s.charAt(i),t.charAt(i));
    //                if (st.contains(t.charAt(i))) return false;
    //                else st.add(t.charAt(i));
    //            }
    //            else{
    //                if (t.charAt(i) != mp.get(s.charAt(i))) return false;
    //            }
    //        }
    //        return true;
    //    }
    //}

    //https://www.codingninjas.com/studio/problems/isomorphic-strings-_1117636?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //import java.util.*;
    //public class Solution {
    //    public static boolean areIsomorphic(String s, String t) {
    //        if (s.length()!=t.length()) return false;
    //        HashMap<Character,Character> mp = new HashMap();
    //        HashSet<Character> st = new HashSet();
    //        for (int i = 0;i<s.length();i++){
    //            if (!mp.containsKey(s.charAt(i))){
    //                mp.put(s.charAt(i),t.charAt(i));
    //                if (st.contains(t.charAt(i))) return false;
    //                else st.add(t.charAt(i));
    //            }
    //            else{
    //                if (t.charAt(i) != mp.get(s.charAt(i))) return false;
    //            }
    //        }
    //        return true;
    //    }
    //}
}
