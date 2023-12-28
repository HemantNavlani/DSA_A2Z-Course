public class CombinationSum {
    //https://www.codingninjas.com/studio/problems/combination-sum_981296?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/combination-sum/description/

    //class Solution {
    //    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    //        List<List<Integer>> ans = new ArrayList<>();
    //        List<Integer> keeper = new ArrayList<>();
    //        helper(0,keeper,ans,target,candidates);
    //        return ans;
    //    }
    //    public void helper (int idx,List<Integer> keeper,List<List<Integer>> ans, int target,int[] arr){
    //        if (target == 0){
    //            List<Integer> l = new ArrayList<>(keeper);
    //            ans.add(l);
    //            return;
    //        }
    //        if (target<0 || idx>=arr.length){
    //            return;
    //        }
    //
    //        keeper.add(arr[idx]);
    //        helper(idx,keeper,ans,target-arr[idx],arr);
    //        keeper.remove(keeper.size()-1);
    //        helper(idx+1,keeper,ans,target,arr);
    //    }
    //
    //}
}
