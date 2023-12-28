public class CombinationSumII {
    //https://www.codingninjas.com/studio/problems/combination-sum-ii_1112622?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

//    https://leetcode.com/problems/combination-sum-ii/description/
    //import java.util.*;
    //

    //isme hame subsequence vale concept ko hi aage le jana hai phle array sort karlo fir jab tak same hai element toh aage bado kyunki ek hi bar uthana ek element ko baki read the code its easy to understand
    //public class Solution {
    //    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> candidates, int n, int target){
    //        Collections.sort(candidates);
    //        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    //        ArrayList<Integer> keeper = new ArrayList<>();
    //        helper(0,keeper,ans,candidates,target);
    //        return ans;
    //    }
    //    public static void helper(int idx, ArrayList<Integer> keeper, ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> arr,int target){
    //        if (target==0){
    //            ans.add(new ArrayList<>(keeper));
    //            return;
    //        }
    //        for (int i =idx;i<arr.size();i++){
    //            if (i>idx && arr.get(i)==arr.get(i-1))continue;
    //            if (arr.get(i)>target) break;
    //            keeper.add(arr.get(i));
    //            helper(i+1,keeper,ans,arr,target-arr.get(i));
    //            keeper.remove(keeper.size()-1);
    //        }
    //    }
    //}
}
