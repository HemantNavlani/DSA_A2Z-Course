import java.util.HashMap;

public class MajorityElement {
    //https://www.codingninjas.com/studio/problems/majority-element_6783241?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //https://leetcode.com/problems/majority-element/submissions/980189803/
    //leetcode 169

    //brute force is by using two loops
//This is a better approach we use haashing here
    //class Solution {
    //    public int majorityElement(int[] nums) {
    //       HashMap<Integer,Integer> mp = new HashMap<>();
    //            for(int i=0;i<nums.length;i++){
    //
    //                if (mp.containsKey(nums[i])){
    //                    int c = mp.get(nums[i]);
    //                    mp.put(nums[i],c+1);
    //                }
    //                else {
    //                mp.put(nums[i],1);
    //                }
    //            }
    //            System.out.println(mp);
    //            int max = 0;
    //            int ans = 0;
    //            for (int k : mp.keySet()){
    //                if (mp.get(k)>max){
    //                    max = mp.get(k);
    //                    ans = k;
    //                }
    //            }
    //            return ans;
    //    }
    //}

    //optimal approach -> Moore's voting algorithm
    //here we select the element as result when count was zero then iterated in array if the nums[i] is same as element then
    //then count++ else count -- if in between count becomes zero then we select the nums[i] as the new element and proceed further in similar way
    //at the end if count > 0 then the element still there may be the answer
    // now just run a for loop and check if it occurs more than nums.length/2 times then it is the majority element
    //class Solution {
    //    public int majorityElement(int[] nums) {
    //        int ele = 0;
    //        int c = 0;
    //        for (int i=0;i<nums.length;i++){
    //            if (c == 0) ele = nums[i];
    //            if(nums[i]==ele) c++;
    //            else {
    //                c--;
    //            }
    //        }
    //        c = 0;
    //        for (int i=0;i<nums.length;i++){
    //            if (nums[i]==ele) c++;
    //        }
    //        if (c>nums.length/2) return ele;
    //        else return -1;
    //    }
    //}
}