public class SeiveofEratosthenes {
    //https://www.codingninjas.com/studio/problems/prime-factorisation_1760849?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //https://leetcode.com/problems/count-primes/description/
    //just read the code you will understand
    //
    //class Solution {
    //    public int countPrimes(int n) {
    //
    //        //complexity of seive is O(NloglogN)
    //        boolean [] seive = new boolean [n+1];
    //        for (int i = 2;i<n+1;i++){
    //            seive[i] = true;
    //        }
    //
    //        for (int i = 2;i*i<=n;i++){
    //            if (seive[i]){
    //                for (int j = i*i;j<=n;j+=i){
    //                    seive[j] = false;
    //                }
    //            }
    //        }
    //
    //        int cnt = 0;
    //        for (int i = 0;i<n;i++){
    //            if (seive[i]) cnt ++;
    //        }
    //        return cnt;
    //    }
    //}
}
