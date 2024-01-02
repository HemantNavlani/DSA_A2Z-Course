public class CountTotalSetBits {
    //https://www.codingninjas.com/studio/problems/count-total-set-bits_784?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //https://youtu.be/g6OxU-hRGtY?si=d8LbWEBE_ILhfMHj
    //Ye video dekhi thi badiya formula ke roop me smjha diya
    //Largest power of 2 nikalni hai less than equal to n
    //public class Solution{
    //    public static int countSetBits(int n) {
    //        if (n==0) return 0;
    //        int x = largestPowerOf2(n);
    //        return (1<<(x-1))*x + (n-(1<<x)+1) + countSetBits(n-(1<<x));
    //    }
    //    public static int largestPowerOf2(int n){
    //        int x = 0;
    //        while ((1<<x)<=n){
    //            x++;
    //        }
    //        return x-1;
    //    }
    //}
}
