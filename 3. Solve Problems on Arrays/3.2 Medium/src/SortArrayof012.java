public class SortArrayof012 {
    //class Solution {
    //leetcode 75
    //https://leetcode.com/problems/sort-colors/
    //    public void sortColors(int[] nums) {
    //        int i =0;
    //        int j =nums.length-1;
    //        int curr = 0;
    //        while(curr<=j){
    //            if (nums[curr]==0){
    //                int temp = nums[curr];
    //                nums[curr] = nums[i];
    //                nums[i]= temp;
    //                i++;
    //                curr++;
    //            }
    //            else if (nums[curr] == 2){
    //                int temp = nums[curr];
    //                nums[curr] = nums[j];
    //                nums[j]  = temp;
    //                j--;
    //            }
    //            else{
    //                curr++;
    //            }
    //        }
    //    }
    //}

    //https://www.codingninjas.com/studio/problems/sort-an-array-of-0s-1s-and-2s_892977?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
    //import java.util.* ;
    //import java.io.*;
    //public class Solution {
    //    public static void sortArray(ArrayList<Integer> nums, int n) {
    //        int i =0;
    //        int j =nums.size()-1;
    //        int curr = 0;
    //        while(curr<=j){
    //            if (nums.get(curr)==0){
    //                int temp = nums.get(curr);
    //                nums.add(curr,nums.get(i));
    //                nums.remove(curr+1);
    //                nums.add(i,temp);
    //                nums.remove(i+1);
    //                i++;
    //                curr++;
    //            }
    //            else if (nums.get(curr) == 2){
    //                int temp = nums.get(curr);
    //                nums.add(curr,nums.get(j));
    //                nums.remove(curr+1);
    //                nums.add(j,temp);
    //                nums.remove(j+1);
    //                j--;
    //            }
    //            else{
    //                curr++;
    //            }
    //        }
    //    }
    //}
}
