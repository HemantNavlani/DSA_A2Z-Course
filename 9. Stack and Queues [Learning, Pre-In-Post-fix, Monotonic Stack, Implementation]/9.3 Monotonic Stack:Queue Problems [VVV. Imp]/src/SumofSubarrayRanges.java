public class SumofSubarrayRanges {
    //https://leetcode.com/problems/sum-of-subarray-ranges/description/

    //https://www.codingninjas.com/studio/problems/subarray-range-sum_8365419?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //brute force is simple and ek bar me hi dimag me aa jata hai
    //class Solution {
    //    public long subArrayRanges(int[] nums) {
    //        int n = nums.length;
    //        long sum =0;
    //        for (int i =0;i<n;i++){
    //            long min = nums[i];
    //            long max = nums[i];
    //            for (int j=i;j<n;j++){
    //                if (nums[j]<min) {
    //                    min = nums[j];
    //                }
    //                if (nums[j]>max){
    //                    max = nums[j];
    //                }
    //                long range = max-min;
    //                sum+=range;
    //            }
    //        }
    //        return sum;
    //    }
    //}



    //better ye hai ki ham sum of subarray minimums vale question me se vo nikale and sum of subarray maximums bhi nikale aur dono ko subtract kar de that would be our answer

    //class Solution {
    //    long sumOfSubarrayMax(int [] nums){
    //         int n = nums.length;
    //        long sum = 0;
    //        Stack<Integer> st1 = new Stack<>();
    //        Stack<Integer> st2 = new Stack<>();
    //        int [] preLarge = new int[n];
    //        int [] nextLarge = new int[n];
    //        //1 2 3
    //        //-1 -1 -1
    //        //
    //        for (int i = 0;i<n;i++){
    //            while (st1.size()!=0 && nums[st1.peek()]<=nums[i]){
    //                st1.pop();
    //            }
    //            if (st1.size()==0) preLarge[i]=-1;
    //            else preLarge[i] =st1.peek();
    //            st1.push(i);
    //        }
    ////1 2 3
    ////1 1 3
    ////3 1
    //        for (int i = n-1;i>=0;i--){
    //            while (st2.size()!=0 && nums[st2.peek()]<nums[i]){
    //                st2.pop();
    //            }
    //            if (st2.size()==0) nextLarge[i]=n;
    //            else nextLarge[i] = st2.peek();
    //            st2.push(i);
    //        }
    //// -1 -1 -1
    ////  1. 2. 3
    //        for (int i = 0;i<n;i++){
    //            long first = i-preLarge[i];//3
    //            long second = nextLarge[i]-i;//1
    //            long prod = first*second;
    //            sum+=prod*nums[i];//1+4+9
    //        }
    //        return sum;
    //    }
    //    long sumOfSubarrayMin(int[] nums){
    //        int n = nums.length;
    //        long sum = 0;
    //        Stack<Integer> st1 = new Stack<>();
    //        Stack<Integer> st2 = new Stack<>();
    //        int [] preSmall = new int[n];
    //        int [] nextSmall = new int[n];
    //        for (int i = 0;i<n;i++){
    //            while (st1.size()!=0 && nums[st1.peek()]>=nums[i]){
    //                st1.pop();
    //            }
    //            if (st1.size()==0) preSmall[i]=-1;
    //            else preSmall[i] =st1.peek();
    //            st1.push(i);
    //        }
    //
    //        for (int i = n-1;i>=0;i--){
    //            while (st2.size()!=0 && nums[st2.peek()]>nums[i]){
    //                st2.pop();
    //            }
    //            if (st2.size()==0) nextSmall[i]=n;
    //            else nextSmall[i] = st2.peek();
    //            st2.push(i);
    //        }
    //
    //        for (int i = 0;i<n;i++){
    //        //-1 0 2
    //        //3 3 3
    //            long first = i-preSmall[i];//1 0
    //            long second = nextSmall[i]-i;//3 2
    //            long prod = first*second;//3
    //            sum+=prod*nums[i];//3 0
    //        }
    //        return sum;
    //    }
    //    public long subArrayRanges(int[] nums) {
    //        long x = sumOfSubarrayMax(nums);
    //        long y = sumOfSubarrayMin(nums);
    //        return x-y;
    //    }
    //}


}
