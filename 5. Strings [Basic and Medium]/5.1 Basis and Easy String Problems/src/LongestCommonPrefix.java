public class LongestCommonPrefix {

    //This is brute force jo mere dimnag aaya phli bar me
    //class Solution {
    //    public String longestCommonPrefix(String[] strs) {
    //        String prefix = strs[0];
    //        for (int i=1;i<strs.length;i++){
    //            int a = 0;
    //            String pre = "";
    //            while (a<prefix.length() && a<strs[i].length() && prefix.charAt(a)==strs[i].charAt(a)){
    //                pre+=strs[i].charAt(a);
    //                a++;
    //            }
    //            prefix = pre;
    //        }
    //        return prefix;
    //    }
    //}

    //it can be improved by first sorting the strings and then just checking only the first and last strings of the array just we have checked for all strings in our code
    //class Solution {
    //    public String longestCommonPrefix(String[] strs) {
    //        Arrays.sort(strs);
    //        String str1st = strs[0];
    //        String strLast = strs[strs.length-1];
    //        int a = 0;
    //        String pre = "";
    //        while (a<str1st.length() && a<strLast.length() && str1st.charAt(a)==strLast.charAt(a)){
    //            pre+=strLast.charAt(a);
    //            a++;
    //        }
    //        return pre;
    //    }
    //}
}
