public class RecursiveImplementationofAtoi {
    //https://www.codingninjas.com/studio/problems/implement-atoi-function_981270?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //leetcode 8
    //https://leetcode.com/problems/string-to-integer-atoi/description/

    //easy hai done with recursion but khud se socho kaun kaun se test case pe fas skta hai toh accodingly code likho IT SHOULD RUN IN ONE TIME FOR ALL TEST CASES ye nhi ki bar bar submit karke dekhte raho
//class Solution {
//    public long helper(String s, int i,boolean sign,long num){
//        if (i<s.length() && s.charAt(i)>=48 && s.charAt(i)<=57){
//            num=num*10+s.charAt(i)-48;
//            if (sign && num>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
//            else if(!sign && num>=(-1)*(long)Integer.MIN_VALUE) return Integer.MIN_VALUE;
//            return helper(s,i+1,sign,num);
//        }
//        else{
//        if (sign) {
//            if(num>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
//            else return (int) num;
//        }
//        else{
//            if(num>=(-1)*(long)Integer.MIN_VALUE) return Integer.MIN_VALUE;
//            else return (-1)*(int) num;
//        }
//        }
//    }
//    public int myAtoi(String s) {
//        boolean sign = true;
//        int i = 0;
//        while (i<s.length() && s.charAt(i)==' '){
//            i++;
//        }
//        if (i<s.length() && (s.charAt(i)=='-'|| s.charAt(i)=='+')){
//            if (s.charAt(i)=='-') sign=false;
//            i++;
//        }
//        return (int)helper(s,i,sign,0);
//    }
//}
}
