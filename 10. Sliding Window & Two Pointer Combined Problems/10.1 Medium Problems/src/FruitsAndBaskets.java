public class FruitsAndBaskets {
    //https://leetcode.com/problems/fruit-into-baskets/
    //https://www.codingninjas.com/studio/problems/fruits-and-baskets_985356?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //class Solution {
    //    public int totalFruit(int[] fruits) {
    //        int l = 0;
    //        int r = 0;
    //        int ans = 0;
    //        int n = fruits.length;
    //        int total = 0;
    //        HashMap<Integer,Integer> mp = new HashMap<>();
    //        while (r<n){
    //            if (mp.containsKey(fruits[r])) mp.put(fruits[r],mp.get(fruits[r])+1);
    //            else  mp.put(fruits[r],0);
    //            total+=1;
    //            while (mp.size()>2){
    //                int f = fruits[l];
    //                if (mp.containsKey(f)){
    //                    mp.put(f,mp.get(f)-1);
    //                }
    //                total-=1;
    //                l++;
    //                if (mp.get(f)==-1) mp.remove(f);
    //            }
    //            ans = Math.max(ans,total);
    //            r++;
    //        }
    //        return ans;
    //    }
    //}
}
