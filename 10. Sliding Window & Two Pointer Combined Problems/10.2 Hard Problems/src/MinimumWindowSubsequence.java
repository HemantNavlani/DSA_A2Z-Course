public class MinimumWindowSubsequence {
    //https://www.codingninjas.com/studio/problems/minimum-window-subsequence_2181133?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //youtube pe video dekhi this kam hava lagi is question ki
    //public class Solution {
    //    public static String minWindow(String s, String t) {
    //        int j = 0;
    //        String ans = "";
    //        int min = s.length()+1;
    //        for (int i = 0;i<s.length();i++){
    //            if (s.charAt(i)==t.charAt(j)) j++;
    //            if (j>=t.length()){
    //                int end = i+1;
    //                j--;
    //                while (j>=0){
    //                    if (s.charAt(i)==t.charAt(j)) j--;
    //                    i--;
    //                }
    //                i++;
    //                j++;
    //                if (end-i<min) {
    //                    min = end-i;
    //                    ans = s.substring(i,end);
    //                }
    //            }
    //        }
    //        return ans;
    //    }
    //}
}
