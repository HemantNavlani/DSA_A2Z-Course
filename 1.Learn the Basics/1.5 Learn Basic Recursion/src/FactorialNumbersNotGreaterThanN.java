import java.util.ArrayList;
import java.util.List;
//https://www.codingninjas.com/studio/problems/factorial-numbers-not-greater-than-n_8365435?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
public class FactorialNumbersNotGreaterThanN {
    public class Solution {
        public static List<Long> factorialNumbers(long n) {
            List<Long> ans = new ArrayList<>();
            helper(ans,1,1,n);
            return ans;
        }

        static void helper(List<Long> ans,long fact, int i,long n){
            fact = fact*i;
            if (fact>n) return;
            ans.add(fact);
            helper(ans,fact,i+1,n);
        }
    }


        public static List<Long> factorialNumbers(long n) {
            //24 kisi ka facrorial hai ye kaise pata chalege
            List<Long> list = new ArrayList<>();
            long fact = 1;
            for (int i=1;i<=n;i++){
                fact*=i;
                if (fact<=n) list.add(fact);
                else break;
            }
            return list;
        }
    }


