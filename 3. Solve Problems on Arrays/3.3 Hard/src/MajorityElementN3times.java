public class MajorityElementN3times {
//    Leetcode 229 https://leetcode.com/problems/majority-element-ii/
//
//    https://www.codingninjas.com/studio/problems/majority-element_6915220?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
//
//    This question is similar to majority element n/2 times done in array medium section
//
//    Brute --> using two for loops but O(n^2)
//
//    better  --> using hash map here TC is O(N) and SC is O(N)
//
//
//    class Solution {
//        public List<Integer> majorityElement(int[] nums) {
//            HashMap<Integer,Integer> mp = new HashMap<>();
//            ArrayList<Integer> ans = new ArrayList<>();
//            for (int i=0;i<nums.length;i++){
//                if (mp.containsKey(nums[i])){
//                    int c = mp.get(nums[i]);
//                    mp.put(nums[i],c+1);
//                }
//                else mp.put(nums[i],1);
//                if (mp.get(nums[i])==nums.length/3+1){
//                    ans.add(nums[i]);
//                }
//                if (ans.size()==2) break;
//            }
//            return ans;
//        }
//
//        This is the optimal approach Moore Voting algorithm as done in Maj Element n/2 it is just the extension of that
//
//import java.util.*;
//        public class Solution {
//            public static List< Integer > majorityElement(int []nums) {
//                List<Integer> ans = new ArrayList<>();
//                int cnt1 = 0;
//                int cnt2 = 0;
//                int el1 = 0;
//                int el2 = 0;
//                for (int i =0;i<nums.length;i++){
//                    if (cnt1==0 && el2 !=nums[i]){
//                        cnt1++;
//                        el1 = nums[i];
//                    }
//                    else if (cnt2==0 && el1!=nums[i]){
//                        cnt2++;
//                        el2=nums[i];
//                    }
//                    else if (el1==nums[i]) cnt1++;
//                    else if (el2==nums[i]) cnt2++;
//                    else {
//                        cnt1--;
//                        cnt2--;
//                    }
//                }
//
//                cnt1 = 0;
//                cnt2 = 0;
//                for (int i=0;i<nums.length;i++){
//                    if (el1==nums[i]) cnt1++;
//                    else if (el2==nums[i]) cnt2++;
//                }
//
//                if (cnt1>nums.length/3) ans.add(el1);
//                if (cnt2>nums.length/3) ans.add(el2);
//                Collections.sort(ans);
//                return ans;
//            }
//        }
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//
}
