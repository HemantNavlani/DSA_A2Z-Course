public class LemonadeChange {
    //https://www.codingninjas.com/studio/problems/lemonade-change_8224112?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/lemonade-change/
    //class Solution {
    //    public boolean lemonadeChange(int[] bills) {
    //        HashMap<Integer,Integer> mp = new HashMap<>();
    //        mp.put(5,0);
    //        mp.put(10,0);
    //        mp.put(20,0);
    //        for (int i = 0;i<bills.length;i++){
    //            int curr = bills[i];
    //            if (curr == 5) mp.put(5,mp.get(5)+1);
    //            else if (curr == 10){
    //                mp.put(10,mp.get(10)+1);
    //                if (mp.get(5)==0) return false;
    //                else mp.put(5,mp.get(5)-1);
    //            }
    //            else{
    //                mp.put(20,mp.get(20)+1);
    //                if (mp.get(5)>=3 || (mp.get(10)>=1 && mp.get(5)>=1)){
    //                    if (mp.get(10)>=1 && mp.get(5)>=1){
    //                        mp.put(10,mp.get(10)-1);
    //                        mp.put(5,mp.get(5)-1);
    //                        continue;
    //                    }
    //                    if (mp.get(5)>=3) mp.put(5,mp.get(5)-3);
    //                }
    //                else return false;
    //            }
    //        }
    //        return true;
    //    }
    //}
    ////
}
