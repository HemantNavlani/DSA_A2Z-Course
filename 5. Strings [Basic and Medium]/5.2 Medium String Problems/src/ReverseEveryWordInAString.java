public class ReverseEveryWordInAString {
    //import java.util.*;
    //leetcode 151
    //https://leetcode.com/problems/reverse-words-in-a-string/

    //https://www.codingninjas.com/studio/problems/reverse-words_7037425?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    //class Solution {
    //    public String reverseWords(String s) {
    //        int i = 0;
    //        String ans = "";
    //        while (i<s.length()){
    //            String temp = "";
    //            while (i<s.length() && s.charAt(i)==' ') i++;
    //
    //            while (i<s.length() && s.charAt(i)!=' '){
    //                temp += s.charAt(i);
    //                i++;
    //            }
    //            if (temp.length()>0){
    //                if (ans.length()==0) ans= temp;
    //                else ans = temp +" "+ ans;
    //            }
    //        }
    //        return ans;
    //    }
    //}

    // //public class Solution {
    //    //    public static String revWords(String s) {
    //    //        //remove the extra space in string
    //    //        s=s.trim();
    //    //        //create a list which only contains words using split function
    //    //        //   \\s+ is used for spliting on bases of space
    //    //        List<String> stringList = Arrays.asList(s.split("\\s+"));
    //    //        //reverse the words in the list
    //    //        Collections.reverse(stringList);
    //    //        //return the result in the form of string
    //    //        return String.join(" ",stringList);
    //    //    }
    //    //}
}
