import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ThreeSumProblem {
    //leetcode 15
    //https://leetcode.com/problems/3sum/

    //https://www.codingninjas.com/studio/problems/three-sum_6922132?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


//This is the brute force approach by using three for loops O(n^3) time complexity and some space is also used = number of triplets found (we have used a hashset and answer list)


    //class Solution {
//        public static List<List<Integer>> threeSum(int[] nums) {
//            int n = nums.length;
//            HashSet<List<Integer>> st = new HashSet<>();
//            for (int i=0;i<n;i++){
//                for (int j=i+1;j<n;j++){
//                    for (int k=j+1;k<n;k++){
//                        if (nums[i]+nums[j]+nums[k]==0){
//                            List<Integer> l = new ArrayList<>();
//                            l.add(nums[i]);
//                            l.add(nums[j]);
//                            l.add(nums[k]);
//                            Collections.sort(l);
//                            st.add(l);
//                        }
//                    }
//                }
//            }
//            List<List<Integer>> ans = new ArrayList<>(st);
//            return ans;
//        }
    //}


    //Better approach is that we do it in O(N^2)  and space complexity around 2* O(N)
    // how ??
    //simple we will do like this by maths ==> arr[k] = -(arr[i] +arr[j])
    //so we will do hashing and run two loops only and continuously we will see that arr[k] came out by simplw maths is in the hashset or not
    //class Solution {
    //    public List<List<Integer>> threeSum(int[] nums) {
    //        int n = nums.length;
    //            HashSet<List<Integer>> st = new HashSet<>();
    //        for (int i =0;i<n;i++){
    //            HashSet<Integer> sett = new HashSet<>();
    //            for (int j=i+1;j<n;j++){
    //                int arrK = - (nums[i]+nums[j]);
    //                if (sett.contains(arrK)){
    //                    List<Integer> list = new ArrayList<>();
    //                    list.add(nums[i]);
    //                    list.add(nums[j]);
    //                    list.add(arrK);
    //                    Collections.sort(list);
    //                    st.add(list);
    //                }
    //                else{
    //                    sett.add(nums[j]);
    //                }
    //            }
    //        }
    //        List<List<Integer>> ans = new ArrayList<>(st);
    //        return ans;
    //    }
    //}

    //Optimal approach
    //Here we have first sorted the given array and then used pointers approach first pointer is kept from start to each element that is i and second pointer j at i+1 and third pointer at arr.length-1;

    //Then if sum < 0 then we do j++ and sum>0 then we do k--; and if sum == 0 we add it in answer and do j++ and k--;
    // for avoiding duplicates we have added the logic if the number at a pointer is same at next loaction also then skip it
    // see the code below it is easy

    // TC => nlogn for sorting + near aboutO(N^2) for the loops

    //SC => for storing ans O(number of triplets)
    //class Solution {
    //    public List<List<Integer>> threeSum(int[] nums) {
    //        List<List<Integer>> ans = new ArrayList<>();
    //        Arrays.sort(nums);
    //        int n = nums.length;
    //        for (int i =0;i<n;i++){
    //            if (i>0 && nums[i]==nums[i-1]) continue;
    //            int j = i+1;
    //            int k = n-1;
    //            while (j<k){
    //                int sum = nums[i]+nums[j]+nums[k];
    //                if (sum<0){
    //                    j++;
    //                }
    //                else if (nums[i]+nums[j]+nums[k]>0){
    //                   k--;
    //                }
    //                else {
    //                    List<Integer> l = new ArrayList<>();
    //                    l.add(nums[i]);
    //                    l.add(nums[j]);
    //                    l.add(nums[k]);
    //                    ans.add(l);
    //                    j++;
    //                    k--;
    //                    while(j<k && nums[j]==nums[j-1]) j++;
    //                    while(j<k && nums[k]==nums[k+1]) k--;
    //                }
    //            }
    //        }
    //        return ans;
    //    }
    //}


}
