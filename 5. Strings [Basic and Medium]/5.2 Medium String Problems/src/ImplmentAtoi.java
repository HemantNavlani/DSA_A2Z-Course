public class ImplmentAtoi {
    //leetcode 8
    //https://leetcode.com/problems/string-to-integer-atoi/description/


    //https://www.codingninjas.com/studio/problems/implement-atoi-function_981270?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //logic simple hai but mai har bar kuch jugad karta gaya according to the test cases thoda simple to understand karne ki koshish niche ki hai
    //class Solution {
    //    public int myAtoi(String s) {
    //        long ans = 0;
    //        String num = "";
    //        boolean sign = true;
    //        boolean changed = false;
    //        boolean numberKeBaad = false;
    //        for (int i = 0;i<s.length();i++){
    //            char ch = s.charAt(i);
    //            if (ch=='-' && !changed && !numberKeBaad) {
    //                sign = false;
    //                changed=true;
    //            }
    //            else if (ch=='+' && !changed && !numberKeBaad) {
    //                sign = true;
    //                changed=true;
    //            }
    //            else if (ch>=48 && ch<=57) {
    //                num+=ch;
    //                numberKeBaad = true;
    //            }
    //            else if (ch==' ' && !numberKeBaad && !changed) continue;
    //            else break;
    //        }
    //        for (int i = 0;i<num.length();i++){
    //
    //            if (ans>2147483647) {
    //            if (sign) return 2147483647;
    //            else return -2147483648;
    //            }
    //
    //            ans = ans*10;
    //            ans += num.charAt(i) - 48;
    //        }
    //        if (ans>2147483647) {
    //            if (sign) return 2147483647;
    //            else return -2147483648;
    //        }
    //        else if (!sign) return -1*(int)ans;
    //        return (int)ans;
    //    }
    //}



    //thoda acha code



    //class Solution {
    //    public int myAtoi(String s) {
    //        int i = 0;
    //        while (i<s.length() && s.charAt(i)==' ') i++;
    //        boolean sign = true;
    //        String num = "";
    //        if (i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+')){
    //            if (s.charAt(i)=='-') sign = false;
    //            i++;
    //        }
    //        while (i<s.length()){
    //            char ch = s.charAt(i);
    //            if (ch>=48 && ch<=57) num+=ch;
    //            else break;
    //            i++;
    //        }
    //        long ans = 0;
    //
    //        for (int j = 0;j<num.length();j++){
    //            if (ans>Integer.MAX_VALUE) {
    //            if (sign) return Integer.MAX_VALUE;
    //            else return Integer.MIN_VALUE;
    //            }
    //
    //            ans = ans*10;
    //            ans += num.charAt(j) - 48;
    //        }
    //         if (ans>Integer.MAX_VALUE) {
    //            if (sign) return Integer.MAX_VALUE;
    //            else return Integer.MIN_VALUE;
    //        }
    //        else if (!sign) return -1*(int)ans;
    //        return (int)ans;
    //    }
    //}
}
