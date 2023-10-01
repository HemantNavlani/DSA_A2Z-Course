public class NextPermutation {
    ////Next Permutation
    //
    //Yaha brute force approach ye hai ki sre permutations likho fir usse sort laro aur simple fir usske according next permutation answer kardo
    //But this will take huge time complexity around N * N !
    //
    //Optimal approach
    //
    //Array ko piche se dekho
    //
    //Observation 1 - Longer Prefix match matlab ki jaise raj rax ram rbx me ra teen me same hai is tareeke se
    //Isme jaha pe bhi rearrange ki possibility dikhe kardo but dhyan rahe it should be next permutation not previous
    //Matlab array me piche se traverse karo aur jaha dip aaye vaha ruk jana hai
    //
    //Observation 2 - toh jis element pe ruk jao let it be X toh bache hue array me aage dekho jo bhi element X se just greater mile ussse X ko swap kardo
    //
    //Dhyan rahe abhi bhi piche se array sorted in increasing order hai piche se
    //
    //acha ab X ko jab swap kar diya ab jo piche se iss index tak hai ussse poora reverse kardo (matlab sorted kardo )
    //
    //Vohi answer hoga
    //
    ////leetcode 31
    //https://leetcode.com/problems/next-permutation/
    ////https://www.codingninjas.com/studio/problems/next-greater-permutation_6929564?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
    //
    //class Solution {
    //    public void nextPermutation(int[] nums) {
    //        int j = nums.length-1;
    //        int idx = -1;
    //        while (j>0){
    //            if (nums[j]>nums[j-1]){
    //                idx = j-1;
    //                break;
    //            }
    //            j--;
    //        }
    //        if(idx == -1) reverse(nums,0,nums.length-1);
    //        else{
    //            for (j=nums.length-1;j>=0;j--){
    //                if (nums[j]>nums[idx]) break;
    //            }
    //            swap(nums,idx,j);
    //            reverse(nums,idx+1,nums.length-1);
    //        }
    //
    //    }
    //    public void reverse (int [] nums, int i, int j){
    //        while (i<j){
    //            swap(nums,i,j);
    //            i++;
    //            j--;
    //        }
    //    }
    //    public void swap (int []nums,int i,int j){
    //        int temp = nums[i];
    //        nums[i] = nums[j];
    //        nums[j] = temp;
    //    }
    //
    //}
}
