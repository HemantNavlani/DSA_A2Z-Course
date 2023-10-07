import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FourSumProblem {
//    //This is the brute force approach using 4 for loops o(n^4) tc and space of set for answer is SC
//        public static ArrayList<ArrayList<Integer>> fourSum(int [] nums, int target) {
//            int n = nums.length;
//            HashSet<ArrayList<Integer>> st = new HashSet<>();
//            for(int i =0;i<n;i++){
//                for (int j=i+1;j<n;j++){
//                    for (int k=j+1;k<n;k++){
//                        for (int l = k+1;l<n;l++){
//                            if (nums[i]+nums[j]+nums[k]+nums[l]==target){
//                                ArrayList<Integer> list = new ArrayList<>();
//                                list.add(nums[i]);
//                                list.add(nums[j]);
//                                list.add(nums[k]);
//                                list.add(nums[l]);
//                                Collections.sort(list);
//                                st.add(list);
//                            }
//                        }
//                    }
//                }
//            }
////            ArrayList<ArrayList<Integer>> ans = new ArrayList<>(st);
////            return ans;
////        }
//This is a better approach we do in o(n^3) and O(1) for unorderd hashset accessing or O(logn) if any other hashset is used
    //hence tc is O(n^3 logn) or O(n^3)
    //SC for internal hashset is O(n)
    // and for returning the answer is O(quad) * 2


    //class Solution {
    //    public List<List<Integer>> fourSum(int[] nums, int target) {
    //        int n = nums.length;
    //        HashSet<List<Integer>> st = new HashSet<>();
    //        for(int i =0;i<n;i++){
    //            for (int j=i+1;j<n;j++){
    //                HashSet<Long> set = new HashSet<>();
    //                for (int k=j+1;k<n;k++){
    //                    long sum = nums[i]+nums[j];
    //                    sum+=nums[k];
    //                    long  fourth = target - sum;
    //                    if (set.contains(fourth)){
    //                        List<Integer> l = new ArrayList<>();
    //                        l.add(nums[i]);
    //                        l.add(nums[j]);
    //                        l.add(nums[k]);
    //                        l.add((int)fourth);
    //                        Collections.sort(l);
    //                        st.add(l);
    //                    }
    //                    else {
    //                        set.add((long)nums[k]);
    //                    }
    //                }
    //            }
    //        }
    //        List<List<Integer>> ans = new ArrayList<>(st);
    //        return ans;
    //    }
    //}
    //Optimal approach -> Here just we have done the same thing as done in 3Sum problem checkout from there
    //TC is around O(n^3)
    // SC is O(quads) only for returning the answer

    //class Solution {
    //    public List<List<Integer>> fourSum(int[] nums, int target) {
    //        Arrays.sort(nums);
    //        List<List<Integer>> ans = new ArrayList<>();
    //        int n = nums.length;
    //        for(int i =0;i<n;i++){
    //            if (i>0 && nums[i]==nums[i-1]) continue;
    //            for (int j=i+1;j<n;j++){
    //                if (j!=(i+1) && nums[j]==nums[j-1]) continue;
    //                int k = j+1;
    //                int l = n-1;
    //                while (k<l){
    //                    long sum = nums[i];
    //                    sum+=nums[j];
    //                    sum+=nums[k];
    //                    sum+=nums[l];
    //                    if (sum<target){
    //                        k++;
    //                    }
    //                    else if (sum>target){
    //                        l--;
    //                    }
    //                    else {
    //                        List<Integer> list = new ArrayList<>();
    //                        list.add(nums[i]);
    //                        list.add(nums[j]);
    //                        list.add(nums[k]);
    //                        list.add(nums[l]);
    //                        ans.add(list);
    //                        k++;
    //                        l--;
    //                        while (k<l && nums[k]==nums[k-1]) k++;
    //                        while (k<l && nums[l]==nums[l+1]) l--;
    //
    //                    }
    //                }
    //            }
    //        }
    //        return ans;
    //    }
    //}
//
//    }
}