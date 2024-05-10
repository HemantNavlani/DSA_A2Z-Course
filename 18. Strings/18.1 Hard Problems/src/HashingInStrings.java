public class HashingInStrings {
    //https://www.geeksforgeeks.org/problems/index-of-the-first-occurrence-of-pattern-in-a-text/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=index-of-the-first-occurrence-of-pattern-in-a-text%2F


//
//class Solution {
//    public int findMatching(String text, String pat) {
//        int n = text.length();
//        int m = pat.length();
//        int  i= 0;
//        while (i<n){
//            if (text.charAt(i)==pat.charAt(0)){
//                int j = 0;
//                boolean flag = true;
//                while (i+j<n && j<m){
//                    if (text.charAt(i+j)!=pat.charAt(j)){
//                        flag = false;
//                        break;
//                    }
//                    j++;
//                }
//                if (j!=m) flag = false;
//                if (flag) return i;
//            }
//            i++;
//        }
//        return -1;
//    }
//}
    //doing according to Rabin Karp but it creates problem when the string sizes are too large to handle
    //class Solution {
    //    public int strStr(String text, String pattern) {
    //        int n = text.length();
    //        int m = pattern.length();
    //        if (n<m) return -1;
    //        int d = 10;
    //        long q = Long.MAX_VALUE;
    //        long h = (int)(Math.pow(d,m-1)) % q;
    //        long p = 0;
    //        long t = 0;
    //        for (int i = 0;i<m;i++){
    //            p = (d*p + pattern.charAt(i)) % q;
    //            t = (d*t + text.charAt(i)) % q;
    //        }
    //        for (int s= 0;s<=n-m;s++){
    //            if (p==t){
    //                boolean flag = true;
    //                for (int i = 0;i<m;i++){
    //                    if (pattern.charAt(i)!=text.charAt(s+i)) {
    //                        flag = false;
    //                        break;
    //                    }
    //                }
    //                if (flag) return s;
    //            }
    //            if (s<n-m) t = (d*(t-text.charAt(s)*h) + text.charAt(s+m)) %q;
    //        }
    //        return -1;
    //    }
    //}

}
