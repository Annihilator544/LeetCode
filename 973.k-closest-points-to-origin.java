/*
 * @lc app=leetcode id=973 lang=java
 *
 * [973] K Closest Points to Origin
 */

// @lc code=start

import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) ->
            Long.compare(distanceSquared(b), distanceSquared(a)));
        for (int[] point : points) {
            pq.offer(point);
            if (pq.size() > k)
                pq.poll();
        }

        int[][] ans = new int[k][];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }

    private long distanceSquared(int[] point) {
        return (long) point[0] * point[0] + (long) point[1] * point[1];
    }
}
// @lc code=end

