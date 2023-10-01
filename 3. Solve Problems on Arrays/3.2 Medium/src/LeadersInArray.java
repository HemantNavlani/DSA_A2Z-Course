public class LeadersInArray {
    //https://www.codingninjas.com/studio/problems/superior-elements_6783446?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //
    //Basic hai ki brute force approach me ye karo ki 2 loops lagao toh element pakdo aur fir right tak dekho sb chote hi hone chahiye
    //
    //Optimal me piche se chalo aur jo max mile usse superior mante jao fir dekho issi max se bada koi mila toh vo bhi superior add it also into the answer aise hi karte jao poore array me bus
    //
    //Ye list me add karte jana aur end me jis roop me answer manga ho dedena
    //
    //https://www.codingninjas.com/studio/problems/superior-elements_6783446?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
    //
    //import java.util.*;
    //public class Solution {
    //    public static List< Integer > superiorElements(int []a) {
    //        List<Integer> ans = new ArrayList<>();
    //        int sup = Integer.MIN_VALUE;
    //        for (int i=a.length-1;i>=0;i--){
    //            if (a[i]>sup) {
    //                sup = a[i];
    //                ans.add(sup);
    //            }
    //        }
    //        Collections.sort(ans);
    //        return ans;
    //    }
    //}
}
