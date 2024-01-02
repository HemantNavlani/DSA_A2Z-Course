public class PrimeFactors {
//https://www.codingninjas.com/studio/problems/prime-factorisation_1760849?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //import java.util.*;
    //
    //public class Solution {
    //    //Optimization in Time complexity from O(N) to O(sqrt(N))
    //    public static List< Integer > countPrimes(int n) {
    //        HashSet<Integer> factors = new HashSet<>();
    //        for (int i = 2;i*i<=n;i++){
    //            while (n%i==0){
    //                factors.add(i);
    //                n=n/i;
    //            }
    //        }
    //        if (n>1) factors.add(n);
    //        List<Integer> l = new ArrayList<>(factors);
    //        Collections.sort(l);
    //        return l;
    //    }
    //}
    //
    //
    //The more optimized approach is that the maximum prime factors of a number can be log2(N) and hence we will do some pre computation and do our question in O(logN )
    //https://www.youtube.com/watch?v=0DT1_B0PVak&list=PLN4aKSfpk8TQDJz7KLiwGFgnoUUwzfl1i&index=4
    //import java.util.*;
    //
    //public class Solution {
    //    public static List< Integer > countPrimes(int n) {
    //        int [] seive = new int[n+1];
    //        for (int i = 0;i<seive.length;i++){
    //            seive[i]=i;
    //        }
    //
    //        for (int i =2;i*i<=n;i++){
    //            if (seive[i]==i){
    //                for (int j=i*i;j<=n;j+=i){
    //                    if (seive[j]==j){
    //                        seive[j]=i;
    //                    }
    //                }
    //            }
    //        }
    //        HashSet<Integer> st = new HashSet<>();
    //        while (n!=1){
    //            st.add(seive[n]);
    //            n/=seive[n];
    //        }
    //        List<Integer> ans = new ArrayList<>(st);
    //        Collections.sort(ans);
    //        return ans;
    //    }
    //}
}
