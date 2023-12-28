public class SubsetSum2 {
    //https://www.codingninjas.com/studio/problems/get-all-unique-subsets_624393?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //https://leetcode.com/problems/subsets-ii/


    //class Solution {
    //    public List<List<Integer>> subsetsWithDup(int[] nums) {
    //        Arrays.sort(nums);
    //        List<List<Integer>> ans = new ArrayList<>();
    //        helper(0,new ArrayList<Integer>(),ans,nums);
    //        return ans;
    //    }
    //    public void helper (int idx, ArrayList<Integer> keeper, List<List<Integer>> ans,int[] nums){
    //        ans.add(new ArrayList<>(keeper));
    //        for (int i = idx;i<nums.length;i++){
    //            if (i>idx && nums[i]==nums[i-1]) continue;
    //            keeper.add(nums[i]);
    //            helper(i+1,keeper,ans,nums);
    //            keeper.remove(keeper.size()-1);
    //        }
    //    }
    //}
    public static void main(String[] args) {
    }
}
