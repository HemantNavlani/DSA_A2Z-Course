public class SortCharactersByFrequency {
    //leetcode 451
    //https://leetcode.com/problems/sort-characters-by-frequency/

    //https://www.codingninjas.com/studio/problems/sorting-characters-by-frequency_1263699?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=DISCUSS
    //class Solution {
    //    public  String frequencySort(String s) {
    //        HashMap<Character,Integer> mp = new HashMap<>();
    //        for (int i=0;i<s.length();i++){
    //            if (mp.containsKey(s.charAt(i))){
    //                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
    //            }
    //            else {
    //                mp.put(s.charAt(i),1);
    //            }
    //        }
    //        String ans = "";
    //        while (mp.size()!=0){
    //            int max = Integer.MIN_VALUE;
    //            char mxc='0';
    //                for (char a : mp.keySet()){
    //                    if (mp.get(a)>max){
    //                        max = mp.get(a);
    //                        mxc = a;
    //                    }
    //                }
    //
    //                for (int i=0;i<mp.get(mxc);i++){
    //                    ans= ans + "" +mxc;
    //                }
    //                mp.remove(mxc);
    //            }
    //            return ans;
    //        }
    //}

    //optimised used sorting so phle O(N^2) tha ab O(n logn) hai
    //class Solution {
    //    public  String frequencySort(String s) {
    //        HashMap<Character,Integer> mp = new HashMap<>();
    //        for (int i=0;i<s.length();i++){
    //            if (mp.containsKey(s.charAt(i))){
    //                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
    //            }
    //            else {
    //                mp.put(s.charAt(i),1);
    //            }
    //        }
    //        String ans = "";
    //        List<Character> list = new ArrayList(mp.keySet());
    //        list.sort((a,b)->mp.get(b)-mp.get(a));
    //
    //        for (int i=0;i<list.size();i++){
    //            for (int j=0;j<mp.get(list.get(i));j++){
    //                ans+=list.get(i);
    //            }
    //        }
    //        return ans;
    //    }
    //}
}
