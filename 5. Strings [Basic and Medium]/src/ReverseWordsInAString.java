public class ReverseWordsInAString {
    //https://leetcode.com/problems/reverse-words-in-a-string/
    // leetcode 151

    // https://www.codingninjas.com/studio/problems/reverse-words-in-a-string_696444?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
    //Just go through the code you will get it


    //import java.util.*;
    //public class Solution {
    //	public static String reverseString(String s) {
    //        s = s.trim();
    //        List<String> list = Arrays.asList(s.split("\\s+"));
    //        Collections.reverse(list);
    //        return String.join(" ",list);
    //    }
    //}


//    or


    //class Solution {
    //    public String reverseWords(String s) {
    //        int i =0;
    //        int n = s.length();
    //        String ans = "";
    //        while (i<n){
    //            String temp = "";
    //            while (i<n && s.charAt(i)==' ') i++;
    //            while (i<n && s.charAt(i)!=' ') {
    //                temp += s.charAt(i);
    //                i++;
    //            }
    //            if(temp.length()>0){
    //            if (ans.length()==0) ans=temp;
    //            else ans= temp + " " +ans;
    //            }
    //        }
    //        return ans;
    //    }
    //}

}
