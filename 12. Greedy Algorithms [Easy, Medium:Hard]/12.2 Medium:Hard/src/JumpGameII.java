public class JumpGameII {
    //https://leetcode.com/problems/jump-game-ii/
    //https://www.codingninjas.com/studio/problems/jump-game_893178?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //I did this solution, it has TC O(N^2) but it was accepted at leetcode but on coding ninjas it was partially accepted
    //class Solution {
    //    public int jump(int[] nums) {
    //        int goal = nums.length-1;
    //        int jumps = 0;
    //        for (int i = goal;i>=0;i--){
    //            for(int j=0;j<goal;j++){
    //                if (j+nums[j]>=goal) {
    //                    goal = j;
    //                    jumps++;
    //                    break;
    //                }
    //            }
    //        }
    //        return jumps;
    //    }
    //}
    //ye better approach hai isme hame breadth first search lagayi hai ki farthest kaha tak ja rahe hai read the code you will get it

    //coding ninja par ek differenve ye bhi hai ki vaha false vale test cases bhi hai jisme -1 return karna hai but leetcode ke testcases ke hissab se ham hamesha pahuch sakte hai end par bas hame minimum jumps batani hai
    //class Solution {
    //    public int jump(int[] nums) {
    //        int res = 0;
    //        int l = 0,r=0;
    //        while (r<nums.length-1){
    //            int farthest = 0;
    //            for (int i = l;i<=r;i++) farthest = Math.max(farthest,i+nums[i]);
    //            l = r+1;
    //            r = farthest;
    //            res++;
    //        }
    //        return res;
    //    }
    //}
}
