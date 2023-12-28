import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequencePowerSet {

    //ye hai cheez samjhne vali isme ek bar rakho ki ham le rahe hai aur call karo fuction aur ek bar rakho ki ham nhi le rahe and call karo function issi tarah se kam karna hai isme

    //https://www.codingninjas.com/studio/problems/print-subsequences_8416366?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //import java.util.*;
    //public class Solution {
    //    public static List<String> generateSubsequences(String s) {
    //        List<String> ans = new ArrayList<>();
    //        helper(0,ans,"",s);
    //        return ans;
    //    }
    //
    //    public static void helper (int idx, List<String> ans, String keeper ,String s){
    //        if (idx>=s.length()){
    //            ans.add(keeper);
    //            return;
    //        }
    //        String str = keeper;
    //        helper(idx+1,ans,keeper,s);
    //        keeper+=s.charAt(idx);
    //        helper(idx+1,ans,keeper,s);
    //        keeper = str;
    //    }
    //}

    //https://leetcode.com/problems/subsets/description/

    //class Solution {
    //    public List<List<Integer>> subsets(int[] nums) {
    //        List<List<Integer>> ans = new ArrayList<>();
    //        List<Integer> keeper = new ArrayList<>();
    //        helper(0,ans,keeper,nums);
    //        return ans;
    //    }
    //    public void helper (int idx,List<List<Integer>> ans,List<Integer> keeper,int[] nums){
    //        if (idx>=nums.length){
    //            List<Integer> l = new ArrayList<>();
    //            for (int i = 0;i<keeper.size();i++){
    //                l.add(keeper.get(i));
    //            }
    //            ans.add(l);
    //            return;
    //        }
    //        keeper.add(nums[idx]);
    //        helper (idx+1,ans,keeper,nums);
    //        keeper.remove(keeper.size()-1);
    //        helper(idx+1,ans,keeper,nums);
    //    }
    //}

    //Power set approach using Bit Manipulation
    //import java.util.*;
    //public class Solution {
    //    public static List<String> generateSubsequences(String s) {
    //        List<String> ans = new ArrayList<>();
    //        for (int a = 0;a<Math.pow(2,s.length());a++){
    //            String substring = "";
    //            for (int i = 0;i<s.length();i++){
    //                if ((a&(1<<i)) !=0) substring+= s.charAt(i);
    //            }
    //            ans.add(substring);
    //        }
    //        return ans;
    //    }
    //}
}