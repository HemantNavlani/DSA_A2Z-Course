
public class ValidAnagram {

    //leetcode 242
    //https://leetcode.com/problems/valid-anagram/description/
    //https://www.codingninjas.com/studio/problems/anagram-pairs_626517?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //class Solution {
    //    public boolean isAnagram(String s, String t) {
    //        if (s.length()!=t.length()) return false;
    //        HashMap<Character,Integer> mp = new HashMap<>();
    //        for (int i=0;i<s.length();i++){
    //            if (mp.containsKey(s.charAt(i))) {
    //                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
    //            }
    //            else{
    //                mp.put(s.charAt(i),0);
    //            }
    //        }
    //        for (int i=0;i<t.length();i++){
    //            if (!mp.containsKey(t.charAt(i))) return false;
    //            else {
    //                mp.put(t.charAt(i),mp.get(t.charAt(i))-1);
    //                if (mp.get(t.charAt(i))==-1) mp.remove(t.charAt(i));
    //            }
    //        }
    //        if (mp.size()==0) return true;
    //        else return false;
    //    }
    //}
}
