public class CheckPrime {
    //https://www.codingninjas.com/studio/problems/check-prime_624934?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=3
    public class Solution {
        public static String isPrime(int num) {
            if (num==1) return "NO";
            for (int i=2;i<=Math.sqrt(num);i++){
                if (num%i==0) return "NO";
            }
            return "YES";
        }
    }
}
