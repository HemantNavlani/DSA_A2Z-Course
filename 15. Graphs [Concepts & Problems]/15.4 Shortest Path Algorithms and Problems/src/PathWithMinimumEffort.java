public class PathWithMinimumEffort {
    //https://leetcode.com/problems/path-with-minimum-effort/
    //https://www.codingninjas.com/studio/problems/path-with-minimum-effort_1380958?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //djisktra hi lagaya hai aur har jagah phle max effort nikalte hue chale hai fir minimum store karte chale hai distance vale me and usse return kar diya hai jab destination par pahuch gaye baki read the code
    //class Solution {
    //    class Tuple{
    //        int x;
    //        int y;
    //        int distance;
    //        Tuple(int x,int y, int distance){
    //            this.x= x;
    //            this.y= y;
    //            this.distance = distance;
    //        }
    //    }
    //    class TupleComparator implements Comparator<Tuple> {
    //        public int compare(Tuple t1, Tuple t2){
    //            return Integer.compare(t1.distance,t2.distance);
    //        }
    //    }
    //    public int minimumEffortPath(int[][] heights) {
    //        int n = heights.length;
    //        int m = heights[0].length;
    //        int [][] distance = new int[n][m];
    //        for (int i = 0;i<n;i++) for (int j = 0;j<m;j++) distance[i][j] = (int) 1e7;
    //        int[] drow = {-1,0,1,0};
    //        int[] dcol = {0,1,0,-1};
    //        int ans = 0;
    //        PriorityQueue<Tuple> pq = new PriorityQueue<>(new TupleComparator());
    //        pq.add(new Tuple(0,0,0));
    //        distance[0][0] = 0;
    //        while (pq.size()!=0){
    //            Tuple t = pq.remove();
    //            int x = t.x;
    //            int y = t.y;
    //            int dist = t.distance;
    //            if (x==n-1 && y==m-1) return dist;
    //            for (int i=0;i<4;i++){
    //                int newR = x+drow[i];
    //                int newC = y+dcol[i];
    //                if (newR>=0 && newR<n && newC>=0 && newC<m){
    //                    int newEffort = Math.max(Math.abs(heights[x][y]-heights[newR][newC]),dist);
    //                    if (newEffort<distance[newR][newC]){
    //                        distance[newR][newC] = newEffort;
    //                        pq.add(new Tuple(newR,newC,newEffort));
    //                    }
    //                }
    //            }
    //        }
    //        return 0;
    //    }
    //}
}
