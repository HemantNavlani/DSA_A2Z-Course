import java.util.Arrays;
import java.util.Comparator;

public class JobSequencingProblem {
    //phle array ko descending order me sort karo according to profit
    // fir ek array banao jisme ham deadline ke hissab se job ids rakhenge arraysize will be equall to the maximum time in deadline
    //fir sorted array me se har task ko uthao aur job id vale array me dalne ke koshish karo as last as possible malab har task ko deadline pe ya fir deadline ke kafi close finiosh karne ki koshish karo
    //https://www.codingninjas.com/studio/problems/job-sequencing-problem_1169460?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://www.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1
//import java.util.*;
//public class Solution {
//    public static int[] jobScheduling(int [][]arr) {
//        Arrays.sort(arr, Comparator.comparingInt((int[] row) -> row[2]).reversed());
//        int maxDeadline = 0;
//        for (int i = 0;i<arr.length;i++){
//            maxDeadline = Math.max(arr[i][1],maxDeadline);
//        }
//        int [] jobSeq = new int [maxDeadline];
//        int [] ans = new int[2];
//        for (int i=0;i<arr.length;i++){
//            int id = arr[i][0];
//            int deadline =  arr[i][1];
//            int profit =  arr[i][2];
//            int x = deadline-1;
//            while (x>=0 && jobSeq[x]!=0){
//                x--;
//            }
//            if (x>=0){
//                jobSeq[x] = id;
//                ans[0]++;
//                ans[1]+=profit;
//            }
//        }
//        return ans;
//    }
//}
}