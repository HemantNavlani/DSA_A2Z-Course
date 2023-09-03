import java.util.ArrayList;
import java.util.Collections;

public class ReverseANumber {
    //leetcode 7
    //https://leetcode.com/problems/reverse-integer/description/
    //class Solution {
    //    public int reverse(int x) {
    //        int m = Math.abs(x);
    //        long ans = 0;
    //        while (m>0){
    //            int rem = m%10;
    //            ans = 10*ans + rem;
    //            m/=10;
    //        }
    //        if (ans<Integer.MIN_VALUE || ans> Integer.MAX_VALUE) return 0;
    //
    //        if (x<0){
    //            return -1*(int)ans;
    //        }
    //        return (int)ans;
    //    }
    //}



//https://www.codingninjas.com/studio/problems/reverse-bits_2181102?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=2
 //import java.util.ArrayList;
    //import java.util.Collections;
    //
    //public class Solution {
    //	   public static long reverseBits(long n) {
    //        ArrayList<Integer> l = new ArrayList<>();
    //        while (n>0){
    //            int rem = (int)(n%2);
    //            l.add(rem);
    //            n/=2;
    //        }
    //        int [] arr = new int[32];
    //        int j = 0;
    //        for (int i=0;i<l.size();i++){
    //            arr[j]=l.get(i);
    //            j++;
    //        }
    //
    //        long twokipower = (long) Integer.MAX_VALUE +1;
    //        long ans = 0;
    //        for (int i=0;i<arr.length;i++){
    //            ans += (long) arr[i] *twokipower;
    //            twokipower/=2;
    //        }
    //        return ans;
    //
    //    }
    //}

}