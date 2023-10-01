public class TwoSum {
    //leetcode 1
    //https://leetcode.com/problems/two-sum/description/
    //class Solution {
    //    public int[] twoSum(int[] nums, int target) {
    //        int [] ans = new int[2];
    //        HashMap<Integer,Integer> mp = new HashMap<>();
    //        for (int i=0;i<nums.length;i++){
    //            if(mp.containsKey(target-nums[i])){
    //                ans[0]=i;
    //                ans[1]=mp.get(target-nums[i]);
    //                return ans;
    //            }
    //            mp.put(nums[i],i);
    //        }
    //        return ans;
    //    }
    //}

    //import java.util.HashMap;
    //https://www.codingninjas.com/studio/problems/reading_6845742?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
    //public class Solution {
    //    public static String read(int n, int []book, int target){
    //        HashMap<Integer,Integer> mp = new HashMap<>();
    //        for (int i=0;i<book.length;i++){
    //            if(mp.containsKey(target-book[i])){
    //                return "YES";
    //            }
    //            mp.put(book[i],i);
    //        }
    //        return "NO";
    //    }
    //}
}
