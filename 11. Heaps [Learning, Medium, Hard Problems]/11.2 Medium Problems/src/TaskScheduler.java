import java.util.*;

public class TaskScheduler {
//https://www.codingninjas.com/studio/problems/task-scheduler_1070424?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/task-scheduler/
    //code khud kar liya tha maine after understanding the algorithm by a video by neetcode yt channel, read the code you will get it ek max heap li hai aur higher freq valo ko phle nipta rahe taki time kam se kam lage nhi toh agar koi end me rah gaya high freq ka toh bar bar delay mangega aur time lagega jyada
//class Solution {
//    class Pair{
//        int cnt;
//        int time;
//        Pair (int cnt,int time){
//            this.cnt = cnt;
//            this.time = time;
//        }
//    }
//    public int leastInterval(char[] tasks, int n) {
//        if (n==0) return tasks.length;
//        if(tasks.length==0) return 0;
//        HashMap<Character,Integer> mp = new HashMap<>();
//        for (int i = 0;i<tasks.length;i++){
//            mp.put(tasks[i],mp.getOrDefault(tasks[i],0)+1);
//        }
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        for (char ch : mp.keySet()){
//            pq.add(mp.get(ch));
//        }
//        Queue<Pair> q = new LinkedList<>();
//        int freq = pq.remove()-1;
//        int time = 1;
//        if (freq!=0) q.add(new Pair(freq,time+n));
//        while (q.size()!=0){
//            Pair p = q.peek();
//            if (p.time == time){
//                q.remove();
//                pq.add(p.cnt);
//            }
//            if (pq.size()!=0){
//                int f = pq.remove()-1;
//                time++;
//                if (f!=0) q.add(new Pair(f,time+n));
//            }
//            else time++;
//        }
//        time += pq.size();
//        return time;
//    }
//}
}