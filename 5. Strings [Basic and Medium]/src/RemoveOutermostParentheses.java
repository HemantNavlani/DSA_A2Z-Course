public class RemoveOutermostParentheses {



    //leetcode 1021
    //https://leetcode.com/problems/remove-outermost-parentheses/

    //Just go through the code you will get it
    //class Solution {
    //    public String removeOuterParentheses(String s) {
    //        int st = 0;
    //        int open = 0;
    //        int close = 0;
    //        String res="";
    //        for(int i =0;i<s.length();i++){
    //            if (s.charAt(i)=='(') open++;
    //            else if (s.charAt(i)==')') close++;
    //            if (open == close) {
    //                res+=s.substring(st+1,i);
    //                st=i+1;
    //            }
    //        }
    //        return res;
    //    }
    //}


    //https://www.codingninjas.com/studio/problems/maximum-nesting-depth-of-the-parentheses_8144741?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

//    public class Solution {
//        public static int maxDepth(String s) {
//            int open = 0;
//            int close = 0;
//            int depth = 0;
//            for (int i=0;i<s.length();i++){
//                if (s.charAt(i)=='(') open++;
//                else if (s.charAt(i)==')') close++;
//                depth = Math.max(depth,(open-close));
//            }
//            return depth;
//        }
//    }
}
