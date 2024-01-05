import java.util.HashMap;

public class MinimumWindowSubstring {
    //https://www.codingninjas.com/studio/problems/minimum-window-substring_1215004?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //https://leetcode.com/problems/minimum-window-substring/

    //Maine todha soch liya tha purane patterns pe based hi hai

    //class Solution {
    //    public String minWindow(String s, String t) {
    //        HashMap<Character,Integer> mpT = new HashMap<>();
    //        for (int i = 0;i<t.length();i++){
    //            mpT.put(t.charAt(i), 1 + mpT.getOrDefault(t.charAt(i),0));
    //        }
    //
    //        int l = 0;
    //        int r = 0;
    //        HashMap<Character,Integer> window = new HashMap<>();
    //        int min = Integer.MAX_VALUE;
    //        String ans = "";
    //        int need = mpT.size();
    //        int have = 0;
    //        while(r<s.length()){
    //            if (mpT.containsKey(s.charAt(r))){
    //                window.put(s.charAt(r), 1 + window.getOrDefault(s.charAt(r),0));
    //                if (mpT.get(s.charAt(r)).equals(window.get(s.charAt(r)))){
    //                    have++;
    //                }
    //            }
    //            while (need==have){
    //                min = Math.min(min,r-l+1);
    //                String temp = s.substring(l,r+1);
    //                if (temp.length()<=min){
    //                    ans = temp;
    //                }
    //
    //                if (window.containsKey(s.charAt(l))){
    //                    window.put(s.charAt(l),window.get(s.charAt(l))-1);
    //                    if (window.get(s.charAt(l))<mpT.get(s.charAt(l))) have--;
    //                }
    //                l++;
    //            }
    //            r++;
    //        }
    //        return ans;
    //    }
    //}
}