public class PowXN {

    //leetcode 50
    //https://leetcode.com/problems/powx-n/description/

    //https://www.codingninjas.com/studio/problems/find-x-raised-to-power-n-_626560?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //hai toh simple but is case me badiya recursion hai O(log n ) time complexity vala todha code dekho smjh aa jayega

   //class Solution {
    //    public double myPow(double x, int n) {
    //        if (n==0) return 1;
    //        if (n<0){
    //            x=1/x;
    //            if (n==Integer.MIN_VALUE) return x * myPow(x,Integer.MAX_VALUE);
    //            n=-1*n;
    //            return myPow(x,n);
    //        }
    //        int mid = n/2;
    //        double temp = myPow(x,mid);
    //        double res = temp*temp;
    //        if (n%2==0) return res;
    //        else return res*x;
    //    }
    //}
}