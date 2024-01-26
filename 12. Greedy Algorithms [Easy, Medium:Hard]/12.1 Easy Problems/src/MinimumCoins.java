import java.util.Arrays;

public class MinimumCoins {
    //https://www.codingninjas.com/studio/problems/find-minimum-number-of-coins_975277?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
//https://www.geeksforgeeks.org/problems/number-of-coins1824/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

    //coding ninja vala khali greedy se ho jayega but gfg vale me we need dp because if sum of two coins is greater than next coin then it will create problem
    //for example I have an array 1,5,6,9 and we have to make 11 rupees then it is difficult and will use dp because by greedy approach we will go with 9+1+1 that are 3 coins hence greedy approach fails here as coins 6 + 5 exceeds the coin 9

    //import java.util.*;
    //public class Solution {
    //    public static List<Integer> MinimumCoins(int n) {
    //        int [] coins = {1000,500,100,50,20,10,5,2,1};
    //        List<Integer> res = new ArrayList<>();
    //        int i = 0;
    //        while (i<coins.length && n!=0){
    //            if (coins[i]<=n){
    //                n-=coins[i];
    //                res.add(coins[i]);
    //            }
    //            else i++;
    //        }
    //        return res;
    //    }
    //}
}
