public class NMeetingsInOneRoom {
    //https://www.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
    //https://www.codingninjas.com/studio/problems/maximum-meetings_1062658?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //import java.util.*;
    //public class Solution {
    //    static class Meeting{
    //        int start;
    //        int end;
    //        int pos;
    //        Meeting(int start,int end, int pos){
    //            this.start = start;
    //            this.end = end;
    //            this.pos = pos;
    //        }
    //    }
    //    public static class MeetingComparator implements Comparator<Meeting>{
    //        public int compare (Meeting m1, Meeting m2){
    //            if (m1.end<m2.end) return -1;
    //            else if (m1.end>m2.end) return 1;
    //            else {
    //                if (m1.pos<m2.pos) return -1;
    //                else return 1;
    //            }
    //        }
    //    }
    //    public static int maximumMeetings(int []start, int []end) {
    //        ArrayList<Meeting> meetings = new ArrayList<>();
    //        int n = start.length;
    //        for (int i = 0;i<n;i++){
    //            meetings.add(new Meeting(start[i],end[i],i+1));
    //        }
    //        Collections.sort(meetings,new MeetingComparator());
    //        int ans = 0;
    //        int limit = meetings.get(0).end;
    //        ans++;
    //        for (int i = 1;i<meetings.size();i++){
    //            if (meetings.get(i).start>limit) {
    //                ans++;
    //                limit = meetings.get(i).end;
    //            }
    //        }
    //        return ans;
    //    }
    //}
}
