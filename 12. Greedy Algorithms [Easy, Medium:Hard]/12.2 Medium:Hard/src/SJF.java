public class SJF {
    //concept easy hai but code ke samjhne ke liye dhoondhna pada solution shortest job first algorithm hai question badiya hai read the code you will get it
    //https://www.codingninjas.com/studio/problems/sjf_1172165?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //import java.util.*;
    //public class Solution {
    //    static class Job{
    //        int arrivalTime;
    //        int burstTime;
    //        Job(int arrivalTime,int burstTime){
    //            this.arrivalTime = arrivalTime;
    //            this.burstTime = burstTime;
    //        }
    //    }
    //    static class JobComparator implements Comparator<Job>{
    //        public int compare(Job a,Job b){
    //            if (a.arrivalTime==b.arrivalTime) return Integer.compare(a.burstTime,b.burstTime);
    //            else return Integer.compare(a.arrivalTime,b.arrivalTime);
    //        }
    //    }
    //    static class JobComparatorForPQ implements Comparator<Job>{
    //        public int compare(Job a,Job b){
    //            return Integer.compare(a.burstTime,b.burstTime);
    //        }
    //    }
    //    public static float sjf(int n, int []arrivalTime, int []burstTime){
    //        Job[] job = new Job[n];
    //        for (int i = 0;i<n;i++){
    //            job[i] = new Job(arrivalTime[i],burstTime[i]);
    //        }
    //        Arrays.sort(job,new JobComparator());
    //
    //        PriorityQueue<Job> pq = new PriorityQueue<>(new JobComparatorForPQ());
    //
    //        pq.add(job[0]);
    //
    //        int time = job[0].arrivalTime;
    //        int waitTime = 0;
    //        int i = 1;
    //        while (pq.size()!=0){
    //            Job curr = pq.remove();
    //            time = Math.max(time,curr.arrivalTime);
    //            waitTime+= time - curr.arrivalTime;
    //            time+=curr.burstTime;
    //            while (i<n && job[i].arrivalTime<=time){
    //                pq.add(job[i]);
    //                i++;
    //            }
    //            if (pq.size()==0 && i<n){
    //                pq.add(job[i]);
    //            }
    //        }
    //        return (float)waitTime/n;
    //    }
    //}

}
