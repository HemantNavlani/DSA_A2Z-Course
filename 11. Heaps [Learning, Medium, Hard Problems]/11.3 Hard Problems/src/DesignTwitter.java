class DesignTwitter{
    //https://leetcode.com/problems/design-twitter/
    //https://www.codingninjas.com/studio/problems/design-twitter_8380711?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //badiya ques hai get news feed hi tough baki easy hai see the video by neetcode
    //    class Pair {
    //        int time;
    //        int tweetId;
    //        Pair(int time, int tweetId){
    //            this.time = time;
    //            this.tweetId = tweetId;
    //        }
    //    }
    //    class PairComparator implements Comparator<Pair> {
    //        public int compare(Pair pair1, Pair pair2) {
    //            return -1*Integer.compare(pair1.time, pair2.time);
    //        }
    //    }
    //class Twitter {
    //    HashMap<Integer,HashSet<Integer>> followMap;
    //    HashMap<Integer,List<Pair>> tweetMap;
    //    int time;
    //    public Twitter() {
    //        followMap = new HashMap<>();
    //        tweetMap = new HashMap<>();
    //        time = 0;
    //    }
    //
    //    public void postTweet(int userId, int tweetId) {
    //        List<Pair> tweets;
    //        if (!tweetMap.containsKey(userId)) tweets = new ArrayList<>();
    //        else tweets = tweetMap.get(userId);
    //        tweets.add(new Pair(time,tweetId));
    //        time++;
    //        tweetMap.put(userId,tweets);
    //    }
    //    public List<Integer> getNewsFeed(int userId) {
    //        PriorityQueue<Pair> pq = new PriorityQueue<>(new PairComparator());
    //        List<Pair> selfTweet;
    //        if (tweetMap.containsKey(userId)) selfTweet = tweetMap.get(userId);
    //        else selfTweet = new ArrayList<>();
    //
    //        for (int i =0;i<selfTweet.size();i++){
    //            pq.add(selfTweet.get(i));
    //        }
    //            HashSet<Integer> st;
    //            if (followMap.containsKey(userId)) st = followMap.get(userId);
    //            else st =new HashSet<>();
    //            for (int j : st){
    //                List<Pair> tweets;
    //                if (tweetMap.containsKey(j)) tweets = tweetMap.get(j);
    //                else tweets = new ArrayList<>();
    //                for (int a = 0;a<tweets.size();a++){
    //                    pq.add(tweets.get(a));
    //                }
    //            }
    //        int n = 0;
    //        List<Integer> ans = new ArrayList<>();
    //        while (n<10 && pq.size()!=0){
    //            ans.add(pq.remove().tweetId);
    //            n++;
    //        }
    //        return ans;
    //    }
    //
    //    public void follow(int followerId, int followeeId) {
    //        HashSet<Integer> followeeSet;
    //        if (!followMap.containsKey(followerId)) followeeSet = new HashSet<>();
    //        else  followeeSet = followMap.get(followerId);
    //        followeeSet.add(followeeId);
    //        followMap.put(followerId,followeeSet);
    //    }
    //
    //    public void unfollow(int followerId, int followeeId) {
    //        HashSet<Integer> followeeSet;
    //        if (followMap.containsKey(followerId)){
    //            followeeSet = followMap.get(followerId);
    //            followeeSet.remove(followeeId);
    //        }
    //    }
    //}
    ///**
    // * Your Twitter object will be instantiated and called as such:
    // * Twitter obj = new Twitter();
    // * obj.postTweet(userId,tweetId);
    // * List<Integer> param_2 = obj.getNewsFeed(userId);
    // * obj.follow(followerId,followeeId);
    // * obj.unfollow(followerId,followeeId);
    // */
}