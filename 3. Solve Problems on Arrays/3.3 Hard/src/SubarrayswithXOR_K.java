public class SubarrayswithXOR_K {
//    https://www.codingninjas.com/studio/problems/subarrays-with-xor-k_6826258?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
    //brute approach => using two loops O(n^2)
    //public class Solution {
    //    public static int subarraysWithSumK(int []a, int b) {
    //        int n = a.length;
    //        int ans = 0;
    //        for (int i=0;i<n;i++){
    //            int xor = 0;
    //            for (int j=i;j<n;j++){
    //                xor^=a[j];
    //                if (xor==b) ans ++;
    //            }
    //        }
    //        return ans;
    //    }
    //}

    //Optimal approach just like longest subarray with sum 0
    // keep a track of xor of all the elements let say prexor
    //for any elements to have target xor we have to look if there is xor present in hashset = x
    //where x will be prexor ^ target (ye aise hi hai jaise hum longest subarray with sum 0 me dhundte the ki phle bhi kisi ka sum 0 rah chuka hai toh matlab beech ke elements ka bhi sum 0)

    //HashSet will be used here with preXor and count count isliye kyunki ham yaha number of subarrays dene hai maxlength nhi deni


    //import java.util.HashMap;
    //
    //public class Solution {
    //    public static int subarraysWithSumK(int []a, int b) {
    //        HashMap<Integer,Integer> mp = new HashMap<>();
    //        mp.put(0,1);
    //        int count = 0;
    //        int n = a.length;
    //        int preXor = 0;
    //        for (int i = 0;i<n;i++){
    //            preXor ^= a[i];
    //            int x = preXor ^ b;
    //            if (mp.containsKey(x)){
    //                count += mp.get(x);
    //            }
    //            if (mp.containsKey(preXor)){
    //                int c = mp.get(preXor);
    //                mp.put(preXor,c+1);
    //            }
    //            else {
    //                mp.put(preXor,1);
    //            }
    //        }
    //        return count;
    //    }
    //}
}
