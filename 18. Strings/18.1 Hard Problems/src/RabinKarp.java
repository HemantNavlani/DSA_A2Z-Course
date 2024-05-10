public class RabinKarp {
    //https://leetcode.com/problems/repeated-string-match/
    //ye rabin karp nhi hai vo Hashing in Strings vale me likha ye toh sheet me jo name tha isliye rabin karp rakh diya hai iska name

    //iss video se smhjha tha maine bht easy hai
    // https://www.youtube.com/watch?v=1WGtcErMPrQ&ab_channel=SURAJKUMAR
    //ye simple sa approach hai

    //class Solution {
    //    public int repeatedStringMatch(String a, String b) {
    //        String A = a;
    //        int repeatCnt = b.length()/a.length();
    //        int cnt = 1;
    //        for (int i =0;i<repeatCnt+2;i++){
    //            if (a.contains(b)) return cnt;
    //            else {
    //                a+=A;
    //                cnt++;
    //            }
    //        }
    //        return -1;
    //    }
    //}


    //Rabin Karp ye hoti hai
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
