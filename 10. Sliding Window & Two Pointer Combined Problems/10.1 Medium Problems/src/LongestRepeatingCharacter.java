import java.util.HashMap;

public class LongestRepeatingCharacter {
    //https://www.codingninjas.com/studio/problems/longest-repeating-substring_980523?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/longest-repeating-character-replacement/description/

    //class Solution {
    //    public int characterReplacement(String s, int k) {
    //        int left = 0;
    //        int right = 0;
    //        int n = s.length();
    //        int maxFreq = 0;
    //        int ans =0;
    //        HashMap<Character,Integer> mp = new HashMap<>();
    //        while (right<n){
    //            if (mp.containsKey(s.charAt(right))) mp.put(s.charAt(right),mp.get(s.charAt(right))+1);
    //            else mp.put(s.charAt(right),1);
    //            maxFreq = Math.max(maxFreq,mp.get(s.charAt(right)));
    //            while (((right-left+1)-maxFreq)>k){
    //                if (mp.containsKey(s.charAt(left))){
    //                    mp.put(s.charAt(left),mp.get(s.charAt(left))-1);
    //                }
    //                left++;
    //            }
    //            ans = Math.max(ans,right-left+1);
    //            right++;
    //        }
    //        return ans;
    //    }
    //}
}
