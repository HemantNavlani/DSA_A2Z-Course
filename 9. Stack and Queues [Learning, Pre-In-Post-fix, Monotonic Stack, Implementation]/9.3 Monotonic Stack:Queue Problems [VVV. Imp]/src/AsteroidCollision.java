import java.util.List;

public class AsteroidCollision {
    //https://leetcode.com/problems/asteroid-collision/

//    https://www.codingninjas.com/studio/problems/asteroid-collision_977232?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //isme hame ek single stack rakhna hai aur collision tab hi ho skta hai ki stack ke peek pe +ve value ho and arr[i] pe negative value //
    //toh collision ke according uske destroy karo jo chota hai and barabar hai toh dono ko destroy karo and accordingly stack me add karo bas
    //class Solution {
    //    public int[] asteroidCollision(int[] asteroids) {
    //        Stack<Integer> st = new Stack<>();
    //        int n = asteroids.length;
    //        for (int i = 0;i<n;i++){
    //            while (st.size()!=0 && st.peek()>0 && asteroids[i]<0){
    //                int diff = st.peek()+asteroids[i];
    //                if (diff<0) st.pop();
    //                else if (diff>0) asteroids[i]=0;
    //                else {
    //                    asteroids[i]=0;
    //                    st.pop();
    //                }
    //            }
    //            if (asteroids[i]!=0)
    //            st.push(asteroids[i]);
    //        }
    //        int[] ans = new int [st.size()];
    //        for (int i=ans.length-1;i>=0;i--){
    //            ans[i] = st.pop();
    //        }
    //        return ans;
    //    }
    //}
}
