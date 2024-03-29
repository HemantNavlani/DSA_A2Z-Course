import java.util.*;

public class HandOfStraights {
    //isme bhi simple hai minheap ko avoid kar diya treemap ka use karke logic dekha tha code khud hi kar liya tha
    //https://leetcode.com/problems/hand-of-straights/
    //https://www.codingninjas.com/studio/problems/groups-in-ninja-land._1459215?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
    //    public boolean isNStraightHand(int[] hand, int groupSize) {
    //        if (hand.length%groupSize!=0) return false;
    //        TreeMap<Integer,Integer> mp = new TreeMap<>();
    //        for (int i=0;i<hand.length;i++){
    //            mp.put(hand[i],mp.getOrDefault(hand[i],0)+1);
    //        }
    //        while (!mp.isEmpty()){
    //            int i = mp.firstKey();
    //            int cnt = mp.get(i);
    //            if ((cnt-1) == 0) mp.remove(i);
    //            else mp.put(i,mp.get(i)-1);
    //            for (int a = 1;a<groupSize;a++){
    //                if (!mp.containsKey(i+a)) return false;
    //                else {
    //                    int c = mp.get(i+a);
    //                    if ((c-1)==0) mp.remove(i+a);
    //                    else mp.put(i+a,mp.get(i+a)-1);
    //                }
    //            }
    //        }
    //        return true;
    //   }
    //}
    static int minCoins(int []coins, int M, int V) {
        int res = 0;
        int i = 0;
        while (i<coins.length && V!=0){
            if (coins[i]<=V){
                V-=coins[i];
                res+=1;
            }
            else i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] coins = {25,10,5};
        int ans = minCoins(coins,3,30);
        System.out.println(ans);
    }
}