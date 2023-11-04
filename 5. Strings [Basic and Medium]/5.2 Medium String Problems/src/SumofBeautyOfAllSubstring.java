import java.util.Collections;
import java.util.HashMap;

public class SumofBeautyOfAllSubstring {
    //https://www.codingninjas.com/studio/problems/sum-of-beauty-of-all-substrings_8143656?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //leetcode 1781
    //https://leetcode.com/problems/sum-of-beauty-of-all-substrings/

    //leetcode pe tle dikha raha haio
    //class Solution {
    //    public int sumOfOneSubstring(String s) {
    //        HashMap<Character,Integer> mp = new HashMap<>();
    //        for (int i = 0;i<s.length();i++){
    //            if (mp.containsKey(s.charAt(i))) mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
    //            else mp.put(s.charAt(i),1);
    //        }
    //        int max = Integer.MIN_VALUE;
    //        int min = Integer.MAX_VALUE;
    //        for (char a: mp.keySet()){
    //            if (mp.get(a)>max) max = mp.get(a);
    //            if (mp.get(a)<min) min = mp.get(a);
    //        }
    //        return max-min;
    //    }
    //    public int beautySum(String s) {
    //        int sum = 0;
    //        for (int i = 0;i<s.length();i++){
    //            String str = "";
    //            for (int j=i;j<s.length();j++){
    //                str += s.charAt(j);
    //                sum += sumOfOneSubstring(str);
    //            }
    //        }
    //        return sum;
    //    }
    //}

}
