public class TwoNumbersWithOddOccurrences {
    //https://www.codingninjas.com/studio/problems/two-numbers-with-odd-occurrences_8160466?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //public class Solution {
    //    public static int[] twoOddNum(int []arr){
    //        int [] ans = new int[2];
    //        int xor =0;
    //        for (int i = 0;i<arr.length;i++){
    //            xor^=arr[i];
    //        }
    //        int cnt = 0;
    //        while (xor!=0){
    //            if ((xor&1)!=0) break;
    //            cnt++;
    //            xor = xor>>1;
    //        }
    //        int xor1 = 0;
    //        int xor2 = 0;
    //
    //        for (int i = 0;i<arr.length;i++){
    //            if ((arr[i]&(1<<cnt))!=0) xor1^=arr[i];
    //            else xor2^=arr[i];
    //        }
    //        if (xor1>xor2) {
    //            ans[0] = xor1;
    //            ans[1] = xor2;
    //        }
    //        else {
    //            ans[0] = xor2;
    //            ans[1] = xor1;
    //        }
    //        return ans;
    //    }
    //}
}
