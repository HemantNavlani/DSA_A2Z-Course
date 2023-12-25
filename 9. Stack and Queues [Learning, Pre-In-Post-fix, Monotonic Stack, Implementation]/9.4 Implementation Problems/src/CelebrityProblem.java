public class CelebrityProblem {
    //https://www.codingninjas.com/studio/problems/the-celebrity-problem_982769?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    //easy hai isme ek ye dhyan rakhna hai ki celebrity vo hai jisse sab jante ho but ye kisi ko nhi janta ho , ye dono condition lagani hai phle sare ko 0 to n-1 ko stack me dal lo
    // fir inhe dekho do do karke pop karo aur inme se ek ko hatao jo celebrity nhi ban sakta hai at the atmost ek celeb toh hoga hi

    //import java.util.* ;
    //import java.io.*;
    ///*
    //	This is signature of helper function 'knows'.
    //	You should not implement it, or speculate about its implementation.
    //
    //	boolean knows(int A, int B);
    //	Function 'knows(A, B)' will returns "true" if the person having
    //	id 'A' know the person having id 'B' in the party, "false" otherwise.
    //	Use it as Runner.knows(A, B);
    //*/
    //
    //public class Solution {
    //	public static int findCelebrity(int n) {
    //
    //    Stack<Integer> st = new Stack <>();
    //        for (int i = 0;i<n;i++){
    //            st.push(i);
    //        }
    //        while (st.size()>1){
    //            int v1 = st.pop();
    //            int v2 = st.pop();
    //            if (Runner.knows(v1,v2)) st.push(v2);
    //            else if (Runner.knows(v2,v1)) st.push(v1);
    //        }
    //        if (st.size()==0) return -1;
    //        int potential = st.pop();
    //        for (int j = 0;j<n;j++){
    //            if (j==potential) continue;
    //            if (Runner.knows(potential,j)) return -1;
    //        }
    //        for (int i = 0;i<n;i++){
    //            if (i==potential) continue;
    //            if (!Runner.knows(i,potential)) return -1;
    //        }
    //        return potential;
    //    }
    //}
}
