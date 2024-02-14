public class CourseScedule2 {
    //yaha pe bas topological sort return karna hai reverse order me toh hamne bas adj ko hi ulta bana liya hai
    //https://leetcode.com/problems/course-schedule-ii/
    //https://www.codingninjas.com/studio/problems/course-schedule-ii_1069243?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //class Solution {
    //    public int[] findOrder(int numCourses, int[][] prerequisites) {
    //        int e = prerequisites.length;
    //        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    //        for (int i = 0;i<numCourses;i++) adj.add(new ArrayList<>());
    //        for (int i = 0;i<e;i++) adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
    //        int [] indegree = new int[numCourses];
    //
    //        for (int i = 0;i<numCourses;i++){
    //            for (int it :adj.get(i)) indegree[it]++;
    //        }
    //
    //        Queue<Integer> q = new LinkedList<>();
    //        for (int i = 0;i<numCourses;i++){
    //            if (indegree[i]==0) q.add(i);
    //        }
    //        int[] ans = new int[numCourses];
    //        int k = 0;
    //        while (q.size()!=0){
    //            int node = q.remove();
    //            ans[k++] = node;
    //            for (int it:adj.get(node)){
    //                indegree[it]--;
    //                if (indegree[it]==0) q.add(it);
    //            }
    //        }
    //        if (k==numCourses) return ans;
    //        else return new int[]{};
    //    }
    //}
}
