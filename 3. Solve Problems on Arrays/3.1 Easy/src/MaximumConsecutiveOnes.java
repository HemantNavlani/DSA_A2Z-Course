public class MaximumConsecutiveOnes {

    //https://www.codingninjas.com/studio/problems/traffic_6682625?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
    //
    //Coding Ninjas Wala question nhi hua hai abhi
    //I think vo sliding window ka use karta hai abhi smjh nhi aa raha aur net pe bhi dhang se nhi hai
    //
    //
    //  public static int traffic(int n, int m, int []vehicle) {
    //        int c = 0;
    //        for (int i=0;i<n;i++){
    //            if (vehicle[i]==1){
    //                c++;
    //            }
    //        }
    //        int rem = n-c;
    //
    //        if (rem>m){
    //             return c+m;
    //        }
    //
    //        else  return c+rem;
    //
    //    }
    //
    //chatgpt solution
    //public class TrafficJamAnalyzer {
    //    public static int maxTrafficJamLength(String[] VEHICLE, int M) {
    //        int maxTrafficJam = 0;  // Initialize the maximum length of traffic jam
    //        int left = 0;           // Initialize the left pointer of the window
    //        int flips = 0;          // Initialize the number of allowed flips
    //
    //        for (int right = 0; right < VEHICLE.length; right++) {
    //            if (VEHICLE[right].equals("1")) {
    //                // If the current position has a vehicle, no flip is needed
    //                maxTrafficJam = Math.max(maxTrafficJam, right - left + 1);
    //            } else {
    //                // If the current position has no vehicle, we can perform a flip
    //                flips++;
    //                while (flips > M) {
    //                    // If we've used up all the allowed flips, move the left pointer
    //                    if (VEHICLE[left].equals("0")) {
    //                        // If the left pointer points to '0', we decrease flips
    //                        flips--;
    //                    }
    //                    left++;  // Move the left pointer to the right
    //                }
    //                maxTrafficJam = Math.max(maxTrafficJam, right - left + 1);
    //            }
    //        }
    //
    //        return maxTrafficJam;
    //    }
    //
    //    public static void main(String[] args) {
    //        // Example usage
    //        String[] VEHICLE = {"1", "0", "1", "1", "0", "1", "0", "0", "1"};
    //        int M = 2;
    //        int result = maxTrafficJamLength(VEHICLE, M);
    //        System.out.println("Maximum possible length of consecutive vehicles: " + result);
    //    }
    //}


    // //class Solution {
    //    //leetcode 485
    //    //https://leetcode.com/problems/max-consecutive-ones/
    //    //    public int findMaxConsecutiveOnes(int[] nums) {
    //    //        int max = 0;
    //    //        for(int i=0;i<nums.length;i++){
    //    //
    //    //            if (nums[i]==1){
    //    //                int count =0;
    //    //                while (i<nums.length && nums[i]==1){
    //    //                    count++;
    //    //                    i++;
    //    //                }
    //    //                if (count > max) max = count;
    //    //            }
    //    //
    //    //        }
    //    //        return max;
    //    //    }
    //    //}
    //
}
