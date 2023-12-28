public class CombinationSumIII {
    //https://www.codingninjas.com/studio/problems/combination-sum-iii_5038357?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/combination-sum-iii/
    //class Solution {
    //    public List<List<Integer>> combinationSum3(int k, int n) {
    //        List<List<Integer>> ans = new ArrayList<>();
    //        helper(1,new ArrayList<Integer>(), ans,n,k);
    //        return ans;
    //    }
    //    public void helper(int idx, List<Integer> keeper, List<List<Integer>> ans ,int target,int k){
    //        if (keeper.size()==k){
    //            if (target==0) ans.add(new ArrayList<Integer>(keeper));
    //            return;
    //        }
    //
    //        if (idx>=10 || target<=0) return;
    //
    //        keeper.add(idx);
    //        helper(idx+1,keeper,ans,target-idx,k);
    //        keeper.remove(keeper.size()-1);
    //        helper(idx+1,keeper,ans,target,k);
    //    }
    //}
}
