import java.util.HashMap;

public class StringRotate {
    //leetcode 796
    //https://leetcode.com/problems/rotate-string/

    //https://www.codingninjas.com/studio/problems/check-if-one-string-is-a-rotation-of-another-string_1115683?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=DISCUSS
    //very simple approach

    //class Solution {
    //    public boolean rotateString(String s, String goal) {
    //        if (s.length()!=goal.length()) return false;
    //        if (s.equals(goal)) return true;
    //        for (int i=0;i<s.length();i++){
    //            s = s.substring(1) + s.charAt(0);
    //            if (s.equals(goal)) return true;
    //        }
    //        return false;
    //    }
    //}

    //majedar approach
    //class Solution {
    //    public boolean rotateString(String s, String goal) {
    //        if (s.length()==goal.length() && (s+s).contains(goal)) return true;
    //        return false;
    //    }
    //}
}
