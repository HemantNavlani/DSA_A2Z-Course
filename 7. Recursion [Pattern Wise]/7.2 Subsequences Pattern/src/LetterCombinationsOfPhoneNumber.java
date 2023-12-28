public class LetterCombinationsOfPhoneNumber {
    //https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/1130454789/

    //https://www.codingninjas.com/studio/problems/letter-phone_626178?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    //yaha pe thoda socho code read karo smjh me aa jayega itna kuch difficult nhi hai hai loop bhi use hoga recursion ke sath sath
    //class Solution {
    //    public List<String> letterCombinations(String digits) {
    //        String[] l = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    //        List<String> ans = new ArrayList<>();
    //        helper (0,l,ans,digits,"");
    //        return ans;
    //    }
    //    public void helper (int idx, String[] l,List<String> ans, String digits,String keeper){
    //        if (digits.length()==0){
    //            return;
    //        }
    //        if (idx == digits.length()){
    //            ans.add(keeper);
    //            return;
    //        }
    //        int a = digits.charAt(idx) - '0';
    //        for (int i = 0;i<l[a].length();i++){
    //            helper(idx+1,l,ans,digits,keeper+l[a].charAt(i));
    //        }
    //    }
    //}
}
