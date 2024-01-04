public class NumberOfSubastringWithAtleastOneOccurence {
    //isme bhi same pattern tha todha dimag lagana hai sliding window
    //https://www.codingninjas.com/studio/problems/count-substring-with-abc_8160465?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
    //class Solution {
    //    public int numberOfSubstrings(String s) {
    //        int l = 0;
    //        int r = 0;
    //        int ans = 0;
    //        int n = s.length();
    //        int [] abc = new int [3];
    //        while (r<n){
    //            abc[s.charAt(r)-'a']++;
    //            while (abc[0]>=1 && abc[1]>=1 & abc[2]>=1) {
    //                ans += n-r;
    //                abc[s.charAt(l)-'a']--;
    //                l++;
    //            }
    //            r++;
    //        }
    //        return ans;
    //    }
    //}
}
