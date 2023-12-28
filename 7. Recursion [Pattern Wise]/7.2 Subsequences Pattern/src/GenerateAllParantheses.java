import java.util.ArrayList;
import java.util.List;

public class GenerateAllParantheses {
    //https://leetcode.com/problems/generate-parentheses/

    //https://www.codingninjas.com/studio/problems/generate-all-parenthesis_920445?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
    //    public List<String> generateParenthesis(int n) {
    //        List<String> ans = new ArrayList<>();
    //        helper (0,"",ans,0,0,n);
    //        return ans;
    //    }
    //    public void helper(int idx,String keeper, List<String> ans,int open, int close,int n){
    //        if (idx >= n*2){
    //            ans.add(keeper);
    //            return;
    //        }
    //
    //        if (keeper.length()==0 || open<n) helper(idx+1,keeper+"(",ans,open+1,close,n);
    //        if (close<n && close<open) helper(idx+1,keeper+")",ans,open,close+1,n);
    //
    //    }
    //}
}
