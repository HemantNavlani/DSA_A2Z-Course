public class MissingAndRepeatingNumbers {
    //https://www.codingninjas.com/studio/problems/missing-and-repeating-numbers_6828164?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    //public class Solution {
    //simple two loops approach -TC O(n^2)
    //    public static int[] findMissingRepeatingNumbers(int []a) {
    //yaha loop breaking ki conditions bhi laga do jab answer milgaya toh todha bdya hojayega aur shayad ache se submit bhi ho jaye
    //        int arr[] = new int[2];
    //        for (int i = 1;i<=a.length;i++){
    //            int cnt = 0;
    //            boolean flag = false;
    //            for (int j=0;j<a.length;j++){
    //                if (a[j]==i) cnt++;
    //                if (a[j]==i) flag = true;
    //                if (cnt==2) arr[0] = i;
    //            }
    //            if (!flag) arr[1] = i;
    //        }
    //        return arr;
    //    }
    //}

    //better approach using hashset
//    TC O(2N) SC O(N)
    //import java.util.HashSet;
    //yaha loop breaking ki conditions bhi laga do jab answer milgaya toh todha bdya hojayega aur shayad ache se submit bhi ho jaye
    ////public class Solution {
    //    public static int[] findMissingRepeatingNumbers(int []a) {
    //        HashSet<Integer> st = new HashSet<>();
    //        int [] ans = new int[2];
    //        for (int i=0;i<a.length;i++){
    //            if (st.contains(a[i])) ans[0] = a[i];
    //            else st.add(a[i]);
    //        }
    //
    //        for (int i = 1;i<=a.length;i++){
    //            if (!st.contains(i)) ans[1] = i;
    //        }
    //        return ans;
    //    }
    //}

    //optimal --> Using maths
    //find sum of array and sum of first n natural number subtract them you will get (rep - missing) = some value
    //find sum of squares of each element of array and sum of squares of first n natural number subtract them you will get (rep - missing)(rep+missing) = some value
    //so solve the equation x+y = somethuing and x-y = something to get the result
    //TC O(N)
    //SC O(1)

    //public class Solution {
    //    public static int[] findMissingRepeatingNumbers(int []arr) {
    //        long n = arr.length;
    //        long numSum = (n*(n+1))/2;
    //        long numSqSum = (n*(n+1)*(2*n+1))/6;
    //        long arrSum = 0;
    //        long arrSqSum = 0;
    //        for (int i=0;i<n;i++){
    //            arrSum+=arr[i];
    //            arrSqSum+=arr[i]*arr[i];
    //        }
    //
    //        long a = arrSum-numSum;
    //        long b = (arrSqSum-numSqSum)/a;
    //
    //        int [] ans = new int[2];
    //
    //        ans[0] =(int)((a+b)/2);
    //        ans[1] = (int)(-((a-b)/2));
    //        return ans;
    //    }
    //}

    //the above approach is also optimal , one more approach is told by striver using xor but vo filhal sir ke thoda upar se ja rhi hai so bad me kbhi dekhenge
}
