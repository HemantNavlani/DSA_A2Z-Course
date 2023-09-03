public class SumofAllDivisors {
    //https://www.codingninjas.com/studio/problems/sum-of-all-divisors_8360720?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
        public static int sumOfAllDivisors(int n){
            int sum = 0;
            for (int i=1;i<=n;i++){
                for (int j=1;j<=i/2;j++){
                    if (i%j==0) sum+=j;
                }
                sum+=i;
            }
            return sum;
        }

    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(3));
    }
}
