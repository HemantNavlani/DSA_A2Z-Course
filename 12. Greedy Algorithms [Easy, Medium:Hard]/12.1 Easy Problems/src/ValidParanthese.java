public class ValidParanthese {
    //https://www.codingninjas.com/studio/problems/balanced-parentheses_8162202?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/valid-parenthesis-string/

    //isme hame leftmin and leftmax rakha hai kyunki * ko hatana hai isliye bas read the code
    //class Solution {
    //    public boolean checkValidString(String s) {
    //        int leftMin = 0;
    //        int leftMax = 0;
    //        for (int i = 0;i<s.length();i++){
    //            char ch = s.charAt(i);
    //            if (ch=='('){
    //                leftMin++;
    //                leftMax++;
    //            }
    //            else if (ch==')'){
    //                leftMin--;
    //                leftMax--;
    //            }
    //            else{
    //                leftMin--;
    //                leftMax++;
    //            }
    //            if (leftMax<0) return false;
    //            if (leftMin<0) leftMin = 0;
    //        }
    //        return (leftMin==0);
    //    }
    //}
}
