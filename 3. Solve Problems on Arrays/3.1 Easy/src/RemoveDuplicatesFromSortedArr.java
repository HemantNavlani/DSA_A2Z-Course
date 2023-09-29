public class RemoveDuplicatesFromSortedArr {
    //https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/
    //class Solution {
    //    public int removeDuplicates(int[] nums) {
    //        int i = 0;
    //        int idx = 0;
    //        while (i<nums.length){
    //            nums[idx] = nums[i];
    //            int c = nums[i];
    //            idx += 1;
    //            while (i<nums.length && nums[i]==c) i++;
    //        }
    //        return idx;
    //    }
    //}


    //
    //import java.util.ArrayList;
    //https://www.codingninjas.com/studio/problems/remove-duplicates-from-sorted-array_1102307?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
    //public class Solution {
    //	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
    //        int i = 0;
    //        int idx = 0;
    //        while (i<arr.size()){
    //            int c = arr.get(i);
    //            idx += 1;
    //            while (i<arr.size() && arr.get(i)==c) i++;
    //        }
    //        return idx;
    //    }
    //}
    //
}
